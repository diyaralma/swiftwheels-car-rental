import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;
import java.util.Objects;
public class LoginRegisterPanel {
    Customer customer = new Customer();
    public int userId;
    public String emailText;
    innerAppPanel innerAppPanel = new innerAppPanel(userId);
    JPanel mainPanel;
    private JLabel logoLabel;
    public JTextField emailLogField;
    private JPasswordField passwordLoginField;
    private JButton LoginButton;
    private JButton RegisterButton;
    private JPanel LogoPanel;
    private JPanel InputPanel;
    private JTextField nameField;
    private JTextField surnameField;
    private JTextField emailRegField;
    private JFormattedTextField numberField;
    private JPanel RegPanel;
    private JButton createAccountButton;
    private JPasswordField passwordRegField;
    private JCheckBox passwordShowCheckBox;
    private JCheckBox passwordShowCheckBox1;
    private JPanel parentPanel;
    private JLabel warningLabel;
    private JButton backButton;

    public LoginRegisterPanel() {
        createAccountButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        RegisterButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        LoginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        RegisterButton.addActionListener(e -> {
            backButton.setVisible(true);
            createRegisterPanel();
        });//Goes to the Register page
        passwordShowCheckBox1.addActionListener(e -> {
            JCheckBox checkBox = (JCheckBox) e.getSource();
            passwordLoginField.setEchoChar(checkBox.isSelected() ? '\0' : '•');
        });// Show the password on the login screen
        passwordShowCheckBox.addActionListener(e -> {
            JCheckBox checkBox = (JCheckBox) e.getSource();
            passwordRegField.setEchoChar(checkBox.isSelected() ? '\0' : '•');
        });//Show the password on the registration form
        createAccountButton.addActionListener(e -> {
            parentPanel.removeAll();
            parentPanel.add(InputPanel);
            parentPanel.repaint();
            parentPanel.revalidate();
            warningLabel.setVisible(false);

            // Email check
            boolean emailExists = customer.isEmailExists(emailRegField.getText());

            // User input validation
            String stringPassword = new String(passwordRegField.getPassword());
            String status = customer.checkInfos(
                    nameField.getText(),
                    surnameField.getText(),
                    numberField.getText(),
                    emailRegField.getText(),
                    stringPassword
            );

            if (Objects.equals(status, "")) {
                if (!emailExists) {
                    // Clean up the phone number and save
                    String cleanedNumber = numberField.getText().replaceAll("[^0-9]", "");
                    customer.takeInfos(
                            nameField.getText(),
                            surnameField.getText(),
                            cleanedNumber,
                            emailRegField.getText(),
                            stringPassword
                    );
                    // Clear all input fields
                    nameField.setText("");
                    surnameField.setText("");
                    numberField.setText("");
                    emailRegField.setText("");
                    passwordRegField.setText("");

                    JOptionPane.showMessageDialog(createAccountButton, "Your Account Created!");
                } else {
                    // Email is already registered
                    createRegisterPanel();
                    warningLabel.setText("E-Mail already exist");
                    warningLabel.setVisible(true);
                }
            } else {
                // User input validation failed
                createRegisterPanel();
                warningLabel.setText(status);
                warningLabel.setVisible(true);
            }
        });//When the Register button is pressed, returns to the main login screen if the email is valid
        LoginButton.addActionListener(e -> {
            StringBuilder passwordText = new StringBuilder();
            for (char item : getPasswordLoginField()) {
                passwordText.append(item); // Get the user's password
            }

            emailText = emailLogField.getText(); // Get the user's email address
            String password = passwordText.toString(); // Get the password as a String

            // Use the customer object to authenticate the user
            customer.readFile(emailText, password); // Authenticate against the database

            // If authentication succeeds, get the user ID
            innerAppPanel.userId = customer.userId;

            if (customer.isReadFileStat()) {
                // If login succeeds, open the new panel
                closeAllFrames(); // Close all open windows
                JFrame frame = new JFrame("innerAppPanel");
                frame.setContentPane(new innerAppPanel(innerAppPanel.userId).mainPanel1);
                frame.setPreferredSize(new Dimension(1250, 800));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            } else {
                // Show an error message if the email or password is incorrect
                JOptionPane.showMessageDialog(createAccountButton, "Mail or Password is incorrect!");
            }
        });// Checks the entered credentials against the database; if they are correct, goes to the main screen, otherwise shows an error message
        backButton.addActionListener(e-> {
            parentPanel.removeAll();
            parentPanel.add(InputPanel);
            parentPanel.repaint();
            parentPanel.revalidate();
            warningLabel.setVisible(false);
            backButton.setVisible(false);
        });// Goes to the Login page
    }
    public void createRegisterPanel() {
        parentPanel.removeAll();
        parentPanel.add(RegPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
        LogoPanel.setPreferredSize(new Dimension(200, 100));
        parentPanel.setPreferredSize(new Dimension(200, 700));
    }
    private void createUIComponents() {
        logoLabel = new JLabel();
        ImageIcon logoIcon = new ImageIcon(new ImageIcon("images/SwiftWheels.png").getImage().getScaledInstance(400, 420, Image.SCALE_SMOOTH));
        logoLabel.setIcon(logoIcon);
        try {
            MaskFormatter maskFormatter = new MaskFormatter("0(5##) ###-####");
            maskFormatter.setPlaceholderCharacter('_');
            maskFormatter.setValidCharacters("0123456789");
            maskFormatter.setAllowsInvalid(false);
            numberField = new JFormattedTextField(maskFormatter);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }//Our logo image
    static void closeAllFrames() {//Method to close the main panel
        Frame[] frames = Frame.getFrames();
        for (Frame frame : frames) {
            if (frame instanceof JFrame) {
                frame.dispose();
            }
        }
    }
    public char[] getPasswordLoginField() {
        return passwordLoginField.getPassword();
    }
}