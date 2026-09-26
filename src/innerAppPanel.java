import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Objects;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.*;


public class innerAppPanel {
    private static final String URL = "jdbc:postgresql://localhost:5432/YOUR_DATABASE";
    private static final String USER = "YOUR_USERNAME";
    private static final String PASSWORD = "YOUR_PASSWORD";
    public int userId;
    Color background = new Color(76,147,152);
    boolean readFileStat;
    public String email_degiskeni ;
    public Customer customer = new Customer();
    int counters = 0;
    int currentVehicleId = 0;
    public  Car car = new Car();
    public Motorcycle motorcycle = new Motorcycle();
    public Jeep jeep = new Jeep();
    public JPanel mainPanel1;
    private JLabel LogoLabel;
    private JButton homeButton;
    private JButton accountButton;
    private JButton contractButton;
    private JButton vehicleButton;
    public JPanel InnerLogoPanel;
    private JPanel MenuPanel;
    public JPanel parentPanel;
    private JPanel menuOpen;
    private JPanel MenuClose;
    private JButton menu;
    private JButton menuCloseButton;
    private JPanel homePanel;
    private JPanel accountPanel;
    private JPanel vehiclesMenuPanel;
    private JPanel contractParentPanel;
    private JPanel MenuButtonPanel;
    private JLabel ppLabel;
    private JButton signOutButton;
    public JTextArea nameArea;
    public JTextArea surnameArea;
    public JTextArea phoneArea;
    public JTextArea emailArea;
    public JTextArea passwordArea;
    private JButton logOutButton;
    private JLabel car1Logo;
    private JLabel car2Logo;
    private JLabel motorLogo;
    private JRadioButton carRadioButton;
    private JRadioButton motorcycleRadioButton;
    private JRadioButton suvRadioButton;
    private JPanel vehicleTypePanel;
    private JPanel vehicleParentPanel;
    private JPanel carPanel;
    private JPanel suvPanel;
    private JPanel motorcyclePanel;
    private JPanel carInfoPanel;
    private JPanel suvInfoPanel;
    private JPanel motorInfoPanel;
    private JLabel carbigInfo;
    private JLabel motorbigInfo;
    private JLabel suvbigInfo;
    private JTextArea carPriceprivate;
    private JTextArea carEngineCrivate;
    private JTextArea carEnginePprivate;
    private JTextArea carColorprivate;
    private JTextArea carKmprivate;
    private JTextArea carYearprivate;
    private JTextArea carModelprivate;
    private JTextArea carFuelprivate;
    private JTextArea carSerialprivate;
    public JTextArea carMakeprivate;
    private JButton backButton;
    private JPanel contractDefaultPanel;
    private JPanel contractActionPanel;
    private JLabel homeLogo;
    private JLabel mailLogo;
    private JLabel phoneLogo;
    private JLabel instaLogo;
    private JLabel locationLogo;
    private JButton carContractButton;
    private JLabel contractImage;
    private JCheckBox okudumBox1;
    private JTextField idField;
    private JTextField addressField;
    private JButton rentButton;
    private JTextField dayField;
    private JTextField licenseField;
    private JTextField feeField;
    private JScrollBar scrollBar1;
    private JScrollPane scrollPane1;
    private JScrollPane scrollPane;
    private JButton seeVehiclesButton;
    private JButton suvContractButton;
    private JTextArea suvPrice;
    private JTextArea suvEngineP;
    private JTextArea suvEngineC;
    private JTextArea suvColor;
    private JTextArea suvKm;
    private JTextArea suvYear;
    private JTextArea suvTraction;

    private JTextArea suvModel;
    private JTextArea suvFuel;
    private JTextArea suvSerial;
    private JTextArea suvMake;
    private JTextArea motoMakePrivate;
    private JTextArea motoTypePrivate;
    private JTextArea motoCoolingPrivate;
    private JTextArea motoModelPrivate;
    private JTextArea motoCyclinderPrivate;
    private JTextArea motoYearPrivate;
    private JTextArea motoKmPrivate;
    private JTextArea motoEnginePPrivate;
    private JTextArea motoEngineCPrivate;
    private JTextArea motoPricePrivate;
    private JTextArea motoColorPrivate;
    private JButton motoContractButton;
    private JFormattedTextField cardDateField;
    private JButton deleteButton;
    private JButton editButton;
    private JButton updateButton;
    private JTextArea carStockPrivate;
    private JTextArea motoStockPrivate;
    private JTextArea suvStockP;
    private JTextArea adminKey;
    private JButton adminButton;
    private JButton adminEdit1;
    private JButton adminDelete1;
    private JButton adminEdit2;
    private JButton adminDelete2;
    private JButton adminEdit3;
    private JButton adminDelete3;
    private JButton adminUpdate1;
    private JButton adminUpdate3;
    private JButton adminUpdate2;
    private JButton addVehicle1Button;
    private JPanel addVehiclePanel;
    private JButton addVehicle2Button;
    private JTextField addVehicleMakeText;
    private JTextField addVehicleSerialText;
    private JTextField addVehicleFuelText;
    private JTextField addVehicleModelText;
    private JTextField addVehicleYearText;
    private JTextField addVehicleKilometerText;
    private JTextField addVehicleColorText;
    private JTextField addVehicleEnginePowerText;
    private JTextField addVehicleEngineCapacityText;
    private JTextField addVehiclePriceText;
    private JTextField addVehicleStockText;
    private JLabel addCarMake;
    private JLabel addVehicleSerial;
    private JLabel addVehicleFuel;
    private JLabel addVehicleModel;
    private JLabel addVehicleYear;
    private JLabel addVehicleKilometer;
    private JLabel addVehicleColor;
    private JLabel addVehicleEnginePower;
    private JLabel addVehicleEngineCapacity;
    private JLabel addVehiclePrice;
    private JLabel addVehicleStock;
    private JButton imageUploadButton;
    private JTextField addMotoTypeText;
    private JTextField addMotoCoolingText;
    private JTextField addMotoCylinderText;
    private JLabel addMotoType;
    private JLabel addMotoCooling;
    private JLabel addMotoCylinder;
    private JTextField addJeepTractionText;
    private JLabel addJeepTraction;
    private JPanel seeVehiclesPanel;
    private JScrollPane scrollPane2;
    private JLabel imageLabel;
    private JFormattedTextField identityNumberField;
    private JFormattedTextField licenseNumberField;
    private JFormattedTextField vehicleReturnField;
    private JButton adminPanelButton;
    private JPanel adminPanel;
    private JLabel vehicleInfo;
    private JFormattedTextField cardNumberField;
    private JFormattedTextField cardCvcField;
    private JTextArea cinfo;
    private JCheckBox wantCheckbox;
    private JCheckBox acceptCheckbox;
    private JTable myRentedVehicleTable;
    private JTable adminContractTable;
    private JTextField adminVehicleType;
    private JTextField adminUserNumber;
    private JTextField adminOnRentedVehicle;
    private JTextField adminRevenue;
    private JTextField adminVehicleStock;
    private JTextField iadeField;
    private JButton iadeButton;
    String folderPath = "images";
    boolean[] isAdminMode = {false};
    ArrayList<Car> carList = new ArrayList<>();
    ArrayList<Motorcycle> motorList = new ArrayList<>();
    ArrayList<Jeep> jeepList = new ArrayList<>();

    public innerAppPanel(int userId) {
        // Menu panel action listeners
        menu.addActionListener(e -> {
            menuOpen.setVisible(false);
            MenuClose.setVisible(true);
            MenuPanel.setVisible(true);
        });//Opens the menu panel when the Menu button is pressed
        menuCloseButton.addActionListener(e -> {
            MenuClose.setVisible(true);
            menuOpen.setVisible(true);
            MenuPanel.setVisible(false);
        });//Closes the menu panel when the Menu button is pressed
        homeButton.addActionListener(e -> {
            parentPanel.removeAll();
            parentPanel.add(homePanel);
            parentPanel.repaint();
            parentPanel.revalidate();
            vehicleTypePanel.setVisible(false);
        });//Opens the Home page when the Home button is pressed
        //Menu panel on the left side of the app
        vehicleButton.addActionListener(e -> {
            carRadioButton.setSelected(true);
            parentPanel.removeAll();
            parentPanel.add(vehiclesMenuPanel);
            parentPanel.repaint();
            parentPanel.revalidate();
            vehicleTypePanel.setVisible(true);

            if (counters == 0) {
                carList.addAll(car.getAllCars());
                jeepList.addAll(jeep.getAllJeeps());
                motorList.addAll(motorcycle.getAllMotorcycles());
                updateCarPanel();
                updateJeepPanel();
                updateMotoPanel();
                counters++;
            }
        });//Opens the Vehicle page when the Vehicle button is pressed
        contractButton.addActionListener(e -> {
            parentPanel.removeAll();
            if(isAdminMode[0]){
                adminContractTable.setModel(getAllRentedVehiclesTable());
                myRentedVehicleTable.setVisible(false);
                adminContractTable.setVisible(true);
            }else {
                myRentedVehicleTable.setModel(getRentedVehicleTable(userId));
                adminContractTable.setVisible(false);
                myRentedVehicleTable.setVisible(true);
            }
            parentPanel.add(contractParentPanel);
            parentPanel.repaint();
            parentPanel.revalidate();
            vehicleTypePanel.setVisible(false);
        }); // there is an issue here when exiting admin mode
        accountButton.addActionListener(e -> {
            parentPanel.removeAll();
            parentPanel.add(accountPanel);
            customer.loadUserInfoToTextArea(userId,nameArea,surnameArea,phoneArea, emailArea,passwordArea); // Load the user info
            parentPanel.repaint();
            parentPanel.revalidate();
            vehicleTypePanel.setVisible(false);
        } );//Opens the Account page when the Account button is pressed
        logOutButton.addActionListener(e -> LoginRegisterPanel.closeAllFrames());//Closes the application
        //for editing the name fields on the account panel
        editButton.addActionListener(e -> {
            nameArea.setEditable(true);
            surnameArea.setEditable(true);
            phoneArea.setEditable(true);
            passwordArea.setEditable(true);

            editButton.setVisible(false);
            signOutButton.setVisible(false);
            deleteButton.setVisible(false);
            adminButton.setVisible(false);
            updateButton.setVisible(true);

        });
        deleteButton.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to delete your account?",
                    "Delete Account",
                    JOptionPane.YES_NO_OPTION
            );
            if (result == JOptionPane.YES_OPTION) {
                try {
                    // Call deleteFile to delete the account
                    customer.deleteFile(userId);

                    // Additional check to confirm the deletion succeeded
                    if (customer.isAccountDeleted(userId)) {
                        // On success, redirect the user to the login screen
                        LoginRegisterPanel.closeAllFrames();
                        JFrame frame = new JFrame("LoginRegisterPanel");
                        frame.setContentPane(new LoginRegisterPanel().mainPanel);
                        frame.setPreferredSize(new Dimension(1000, 450));
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                        frame.pack();
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);
                    } else {

                        JOptionPane.showMessageDialog(
                                null,
                                "The account could not be deleted. You may have a rented vehicle.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }

                } catch (Exception ex) {
                    // Show the user a message for any other unexpected errors
                    JOptionPane.showMessageDialog(
                            null,
                            "The account could not be deleted: " + ex.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });
        updateButton.addActionListener(e -> {
            nameArea.setEditable(false);
            surnameArea.setEditable(false);
            phoneArea.setEditable(false);
            passwordArea.setEditable(false);

            signOutButton.setVisible(true);
            deleteButton.setVisible(true);
            updateButton.setVisible(false);
            editButton.setVisible(true);
            adminButton.setVisible(true);

            customer.updateFile(nameArea,surnameArea,phoneArea,emailArea,passwordArea);
            customer.loadUserInfoToTextArea(userId,nameArea,surnameArea,phoneArea,emailArea,passwordArea);
        });
        adminButton.addActionListener(e -> {
            String admin = adminKey.getText(); // Get the text entered by the user

            if (!isAdminMode[0] && Objects.equals(admin, "admin")) {
                // Enter admin mode
                isAdminMode[0] = true; // Admin mode on
                toggleAdminMode(true); // Enable admin mode
                JOptionPane.showMessageDialog(null, "Admin login successful");
            }
            else if (isAdminMode[0] && Objects.equals(admin, "admincikis")) {
                // Exit admin mode
                isAdminMode[0] = false; // Admin mode off
                toggleAdminMode(false); // Disable admin mode
                JOptionPane.showMessageDialog(null, "Logged out of admin mode");
            }
            else if (!isAdminMode[0]) {
                // Invalid input (login attempt while not in admin mode)
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid value!");
            }
            else {
                // In admin mode, but an invalid command was entered
                JOptionPane.showMessageDialog(null, "Invalid operation. Type 'admincikis' to exit admin mode.");
            }
        });// A variable that tracks the admin state
        signOutButton.addActionListener(e -> {
            LoginRegisterPanel.closeAllFrames();
            JFrame frame = new JFrame("LoginRegisterPanel");
            frame.setContentPane(new LoginRegisterPanel().mainPanel);
            frame.setPreferredSize(new Dimension(1000,450));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });//Signs out of the account and returns to the login/register screen
        //end of account panel actions
        //edit/update actions on vehicles via the show details buttons
        adminEdit1.addActionListener(e -> {
            carMakeprivate.setEditable(true);
            carFuelprivate.setEditable(true);
            carYearprivate.setEditable(true);
            carKmprivate.setEditable(true);
            carColorprivate.setEditable(true);
            carEngineCrivate.setEditable(true);
            carEnginePprivate.setEditable(true);
            carPriceprivate.setEditable(true);
            carStockPrivate.setEditable(true);
            carSerialprivate.setEditable(true);
            carModelprivate.setEditable(true);

            adminEdit1.setVisible(false);
            adminUpdate1.setVisible(true);
        });// car edit button
        adminUpdate1.addActionListener(e->{
            carMakeprivate.setEditable(false);
            carFuelprivate.setEditable(false);
            carYearprivate.setEditable(false);
            carKmprivate.setEditable(false);
            carColorprivate.setEditable(false);
            carEngineCrivate.setEditable(false);
            carEnginePprivate.setEditable(false);
            carPriceprivate.setEditable(false);
            carStockPrivate.setEditable(false);
            carModelprivate.setEditable(false);
            carSerialprivate.setEditable(false);

            car.updateCar(currentVehicleId,carMakeprivate,carModelprivate,carYearprivate,carKmprivate,carColorprivate,carEnginePprivate,carEngineCrivate,carPriceprivate
                    ,carStockPrivate,carSerialprivate,carFuelprivate);
            adminEdit1.setVisible(true);
            adminUpdate1.setVisible(false);
        });// car update button
        adminDelete1.addActionListener(e -> {
            int response = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to delete this vehicle?",
                    "Delete Vehicle",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);

            // If the user answers "Yes", delete the vehicle
            if (response == JOptionPane.YES_OPTION) {
                // First, find the matching vehicle in `carList`
                Car vehicleToDelete = null;
                for (Car car : carList) {
                    if (car.getId() == currentVehicleId) {
                        vehicleToDelete = car;
                        break;
                    }
                }

                // If the vehicle was found, perform the deletion
                if (vehicleToDelete != null) {
                    try {
                        // Try to delete it from the database
                        car.deleteCar(currentVehicleId); // Call the procedure

                        // Build the photo file path
                        int vehicleId = vehicleToDelete.getId(); // Vehicle ID
                        String photoPath = String.format("images/vehicles_%d.png", vehicleId);

                        // Delete the photo
                        File photoFile = new File(photoPath);
                        if (photoFile.exists()) {
                            if (photoFile.delete()) {
                                System.out.println("Photo deleted successfully: " + photoPath);
                            } else {
                                System.out.println("Photo could not be deleted: " + photoPath);
                            }
                        } else {
                            System.out.println("Photo file not found: " + photoPath);
                        }

                        // Remove it from the list and refresh the panel
                        carList.remove(vehicleToDelete);
                        vehicleParentPanel.removeAll();
                        vehicleParentPanel.add(carPanel);
                        vehicleParentPanel.revalidate();
                        vehicleParentPanel.repaint();
                        updateCarPanel(); // Refresh the panel

                        JOptionPane.showMessageDialog(null, "Vehicle and photo deleted successfully.");

                    } catch (SQLException ex) {
                        // If the SQL operation fails, notify the user
                        JOptionPane.showMessageDialog(null,
                                "An error occurred: " + ex.getMessage(),
                                "Deletion Error", JOptionPane.ERROR_MESSAGE);
                        System.err.println("SQL Error: " + ex.getMessage());
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Vehicle not found. The deletion could not be completed.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Deletion canceled.");
            }
        });

// car delete button
        adminEdit2.addActionListener(e -> {
            motoColorPrivate.setEditable(true);
            motoCoolingPrivate.setEditable(true);
            motoCyclinderPrivate.setEditable(true);
            motoColorPrivate.setEditable(true);
            motoKmPrivate.setEditable(true);
            motoMakePrivate.setEditable(true);
            motoModelPrivate.setEditable(true);
            motoPricePrivate.setEditable(true);
            motoStockPrivate.setEditable(true);
            motoTypePrivate.setEditable(true);
            motoYearPrivate.setEditable(true);
            motoEngineCPrivate.setEditable(true);
            motoEnginePPrivate.setEditable(true);

            adminEdit2.setVisible(false);
            adminUpdate2.setVisible(true);
        });// motor edit button
        adminUpdate2.addActionListener(e->{
            motoColorPrivate.setEditable(false);
            motoCoolingPrivate.setEditable(false);
            motoCyclinderPrivate.setEditable(false);
            motoColorPrivate.setEditable(false);
            motoKmPrivate.setEditable(false);
            motoMakePrivate.setEditable(false);
            motoModelPrivate.setEditable(false);
            motoPricePrivate.setEditable(false);
            motoStockPrivate.setEditable(false);
            motoTypePrivate.setEditable(false);
            motoYearPrivate.setEditable(false);
            motoEngineCPrivate.setEditable(false);
            motoEnginePPrivate.setEditable(false);

            motorcycle.updateMotorcycle(currentVehicleId,motoMakePrivate,motoModelPrivate,motoYearPrivate,motoKmPrivate,motoColorPrivate,motoEnginePPrivate,
                    motoEngineCPrivate,motoPricePrivate,motoStockPrivate,motoTypePrivate,motoCoolingPrivate,motoCyclinderPrivate);
            adminEdit2.setVisible(true);
            adminUpdate2.setVisible(false);
        });// motor update button
        adminDelete2.addActionListener(e -> {
            int response = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to delete this vehicle?",
                    "Delete Vehicle",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);

            if (response == JOptionPane.YES_OPTION) {
                // First, find the matching motorcycle in the motorcycle list
                Motorcycle motorcycleToDelete = null;
                for (Motorcycle moto : motorList) {
                    if (moto.getId() == currentVehicleId) {
                        motorcycleToDelete = moto;
                        break;
                    }
                }

                // If the motorcycle was found, perform the deletion
                if (motorcycleToDelete != null) {
                    try {
                        // Try to delete it from the database
                        motorcycle.deleteMotorcycle(currentVehicleId); // Call the procedure

                        // Build the photo file path
                        int motorcycleId = motorcycleToDelete.getId(); // Motorcycle ID
                        String photoPath = String.format("images/vehicles_%d.png", motorcycleId);

                        // Delete the photo
                        File photoFile = new File(photoPath);
                        if (photoFile.exists()) {
                            if (photoFile.delete()) {
                                System.out.println("Photo deleted successfully: " + photoPath);
                            } else {
                                System.out.println("Photo could not be deleted: " + photoPath);
                            }
                        } else {
                            System.out.println("Photo file not found: " + photoPath);
                        }

                        // Remove it from the list and refresh the panel
                        motorList.remove(motorcycleToDelete);
                        vehicleParentPanel.removeAll();
                        vehicleParentPanel.add(motorcyclePanel);
                        vehicleParentPanel.revalidate();
                        vehicleParentPanel.repaint();
                        updateMotoPanel(); // Refresh the panel

                        JOptionPane.showMessageDialog(null, "Vehicle and photo deleted successfully.");

                    } catch (SQLException ex) {
                        // If the SQL operation fails, notify the user
                        JOptionPane.showMessageDialog(null,
                                "An error occurred: " + ex.getMessage(),
                                "Deletion Error", JOptionPane.ERROR_MESSAGE);
                        System.err.println("SQL Error: " + ex.getMessage());
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Vehicle not found. The deletion could not be completed.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Deletion canceled.");
            }
        });
// motor delete button
        adminEdit3.addActionListener(e ->{
            suvColor.setEditable(true);
            suvYear.setEditable(true);
            suvTraction.setEditable(true);
            suvStockP.setEditable(true);
            suvSerial.setEditable(true);
            suvPrice.setEditable(true);
            suvModel.setEditable(true);
            suvMake.setEditable(true);
            suvKm.setEditable(true);
            suvFuel.setEditable(true);
            suvEngineP.setEditable(true);
            suvEngineC.setEditable(true);

            adminEdit3.setVisible(false);
            adminUpdate3.setVisible(true);
        });// jeep edit button
        adminUpdate3.addActionListener(e->{
            suvColor.setEditable(false);
            suvYear.setEditable(false);
            suvTraction.setEditable(false);
            suvStockP.setEditable(false);
            suvSerial.setEditable(false);
            suvPrice.setEditable(false);
            suvModel.setEditable(false);
            suvMake.setEditable(false);
            suvKm.setEditable(false);
            suvFuel.setEditable(false);
            suvEngineP.setEditable(false);
            suvEngineC.setEditable(false);

            jeep.updateJeep(currentVehicleId,suvMake,suvModel,suvYear,suvKm,suvColor,suvEngineP,suvEngineC,suvPrice
                    ,suvStockP,suvSerial,suvTraction,suvFuel);

            adminEdit3.setVisible(true);
            adminUpdate3.setVisible(false);
        });// jeep update button
        adminDelete3.addActionListener(e -> {
            int response = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to delete this vehicle?",
                    "Delete Vehicle",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);

            if (response == JOptionPane.YES_OPTION) {
                // First, find the matching vehicle in the jeep list
                Jeep jeepToDelete = null;
                for (Jeep suv : jeepList) {
                    if (suv.getId() == currentVehicleId) {
                        jeepToDelete = suv;
                        break;
                    }
                }

                // If the jeep was found, perform the deletion
                if (jeepToDelete != null) {
                    try {
                        // Try to delete it from the database
                        jeep.deleteJeep(currentVehicleId); // Call the procedure

                        // Build the photo file path
                        int jeepId = jeepToDelete.getId(); // Jeep ID
                        String photoPath = String.format("images/vehicles_%d.png", jeepId);

                        // Delete the photo
                        File photoFile = new File(photoPath);
                        if (photoFile.exists()) {
                            if (photoFile.delete()) {
                                System.out.println("Photo deleted successfully: " + photoPath);
                            } else {
                                System.out.println("Photo could not be deleted: " + photoPath);
                            }
                        } else {
                            System.out.println("Photo file not found: " + photoPath);
                        }

                        // Remove it from the list and refresh the panel
                        jeepList.remove(jeepToDelete);
                        vehicleParentPanel.removeAll();
                        vehicleParentPanel.add(suvPanel);
                        vehicleParentPanel.revalidate();
                        vehicleParentPanel.repaint();
                        updateJeepPanel(); // Refresh the panel

                        JOptionPane.showMessageDialog(null, "Vehicle and photo deleted successfully.");

                    } catch (SQLException ex) {
                        // If the SQL operation fails, notify the user
                        JOptionPane.showMessageDialog(null,
                                "An error occurred: " + ex.getMessage(),
                                "Deletion Error", JOptionPane.ERROR_MESSAGE);
                        System.err.println("SQL Error: " + ex.getMessage());
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Vehicle not found. The deletion could not be completed.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Deletion canceled.");
            }
        });
// jeep delete button
        //end of show details actions
        carRadioButton.addActionListener(e -> {
            vehicleParentPanel.removeAll();
            vehicleParentPanel.add(carPanel);
            vehicleParentPanel.revalidate();
            vehicleParentPanel.repaint();

        });//Radio button that opens the car panel
        motorcycleRadioButton.addActionListener(e -> {
            vehicleParentPanel.removeAll();
            vehicleParentPanel.add(motorcyclePanel);
            vehicleParentPanel.revalidate();
            vehicleParentPanel.repaint();
        });//Radio button that opens the motorcycle panel
        suvRadioButton.addActionListener(e -> {
            vehicleParentPanel.removeAll();
            vehicleParentPanel.add(suvPanel);
            vehicleParentPanel.revalidate();
            vehicleParentPanel.repaint();
        });//Radio button that opens the SUV panel
        backButton.addActionListener(e -> {
            if(carRadioButton.isSelected()){
            vehicleParentPanel.removeAll();
            vehicleParentPanel.add(carPanel);
            vehicleParentPanel.revalidate();
            vehicleParentPanel.repaint();
            } else if (motorcycleRadioButton.isSelected()) {
                vehicleParentPanel.removeAll();
                vehicleParentPanel.add(motorcyclePanel);
                vehicleParentPanel.revalidate();
                vehicleParentPanel.repaint();
            }
            else if (suvRadioButton.isSelected()) {
                vehicleParentPanel.removeAll();
                vehicleParentPanel.add(suvPanel);
                vehicleParentPanel.revalidate();
                vehicleParentPanel.repaint();
            }
        });// Back button
        // CONTRACT PANELS
        seeVehiclesButton.addActionListener(e -> {
            vehicleTypePanel.setVisible(true);
            parentPanel.removeAll();
            parentPanel.add(vehiclesMenuPanel);
            parentPanel.revalidate();
            parentPanel.repaint();

        });// in contract panel see Vehicle button
        carContractButton.addActionListener(e -> {
            vehicleTypePanel.setVisible(false);
            parentPanel.removeAll();
            parentPanel.add(contractActionPanel);
            parentPanel.revalidate();
            parentPanel.repaint();
            // Apply formatting to the fields created in the GUI Designer
            setupFormattedFields();
        });
        suvContractButton.addActionListener(e -> {
            vehicleTypePanel.setVisible(false);
            parentPanel.removeAll();
            parentPanel.add(contractActionPanel);
            parentPanel.revalidate();
            parentPanel.repaint();
            setupFormattedFields();

        });// vehicle contract button
        motoContractButton.addActionListener(e -> {
            vehicleTypePanel.setVisible(false);
            parentPanel.removeAll();
            parentPanel.add(contractActionPanel);
            parentPanel.revalidate();
            parentPanel.repaint();
            setupFormattedFields();
        });// vehicle contract button
        rentButton.addActionListener(e -> {
            String cardNumber = cardNumberField.getText().replaceAll("[^0-9]", "");
            String cardDate = cardDateField.getText();
            String cardCvc = cardCvcField.getText().replaceAll("[^0-9]", "");
            String returnDate = vehicleReturnField.getText();
            String address = addressField.getText();

            // Check that all fields are filled in
            if ( cardNumber.isEmpty() ||  cardDate.isEmpty() || cardCvc.isEmpty() || returnDate.isEmpty() || address.isEmpty() && acceptCheckbox.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Date validation
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false); // Enforces strict date parsing
            try {
                // Check the date entered by the user
                Date enteredDate = dateFormat.parse(returnDate);

                // Check against one day after the system date
                Calendar systemCalendar = Calendar.getInstance();
                systemCalendar.add(Calendar.DAY_OF_MONTH, 1); // Add 1 day to the system date
                Date minDate = systemCalendar.getTime();

                if (!enteredDate.after(minDate)) {
                    JOptionPane.showMessageDialog(null, "Return date must be at least one day after the current date.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid date in DD/MM/YYYY format.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int daysBetween = calculateDaysBetween(returnDate, "dd/MM/yyyy") ;
            if (carRadioButton.isSelected() || motorcycleRadioButton.isSelected() || suvRadioButton.isSelected()) {
                try {
                    rentVehicle(userId,address,currentVehicleId,daysBetween,feeField, parentPanel);

                    // Clear and refresh the screen
                    parentPanel.removeAll();
                    parentPanel.add(homePanel);
                    parentPanel.repaint();
                    parentPanel.revalidate();

                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(parentPanel, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Clear the fields
            cardNumberField.setText("");
            cardDateField.setText("");
            cardCvcField.setText("");
            vehicleReturnField.setText("");
            addressField.setText("");
            feeField.setText("");
            wantCheckbox.setSelected(false);
            acceptCheckbox.setSelected(false);
        });
        // Clear the fields
        acceptCheckbox.addActionListener(e -> {
            // Rental operations
            String returnDate = vehicleReturnField.getText();
            int daysBetween = calculateDaysBetween(returnDate, "dd/MM/yyyy") ;
            if (carRadioButton.isSelected()){
                if (wantCheckbox.isSelected()){
                    feeField.setText(String.valueOf((Integer.parseInt(carPriceprivate.getText()) * daysBetween) + 20));
                }else {
                    feeField.setText(String.valueOf((Integer.parseInt(carPriceprivate.getText()) * daysBetween)));
                }
            }
            else if(motorcycleRadioButton.isSelected()){
                if (wantCheckbox.isSelected()){
                    feeField.setText(String.valueOf((Integer.parseInt(motoPricePrivate.getText()) * daysBetween) + 20));
                }else{
                feeField.setText(String.valueOf((Integer.parseInt(motoPricePrivate.getText()) * daysBetween)));
                }
            }
            else if (suvRadioButton.isSelected()) {
                if (wantCheckbox.isSelected()){
                    feeField.setText(String.valueOf((Integer.parseInt(suvPrice.getText()) * daysBetween) + 20));
                }
                else{
                feeField.setText(String.valueOf((Integer.parseInt(suvPrice.getText()) * daysBetween)));
                }
            }

        });// confirm button
        addVehicle1Button.addActionListener(e -> {
            vehicleParentPanel.removeAll();
            vehicleParentPanel.add(addVehiclePanel);
            vehicleParentPanel.revalidate();
            vehicleParentPanel.repaint();

            ImageIcon whiteIcon = new ImageIcon(new ImageIcon("images/pictureimage.png").getImage().getScaledInstance(400,300, Image.SCALE_SMOOTH));
            imageLabel.setIcon(whiteIcon);


            if (carRadioButton.isSelected()){

                addMotoCooling.setVisible(false);
                addMotoCylinder.setVisible(false);
                addMotoType.setVisible(false);
                addMotoTypeText.setVisible(false);
                addMotoCylinderText.setVisible(false);
                addMotoCoolingText.setVisible(false);
                addJeepTraction.setVisible(false);
                addJeepTractionText.setVisible(false);

                addVehicleSerial.setVisible(true);
                addVehicleSerialText.setVisible(true);
                addVehicleFuel.setVisible(true);
                addVehicleFuelText.setVisible(true);
            }
            else if (motorcycleRadioButton.isSelected()){
                addVehicleSerial.setVisible(false);
                addVehicleSerialText.setVisible(false);
                addVehicleFuel.setVisible(false);
                addVehicleFuelText.setVisible(false);
                addJeepTraction.setVisible(false);
                addJeepTractionText.setVisible(false);

                addMotoCooling.setVisible(true);
                addMotoCylinder.setVisible(true);
                addMotoType.setVisible(true);
                addMotoTypeText.setVisible(true);
                addMotoCylinderText.setVisible(true);
                addMotoCoolingText.setVisible(true);

            }
            else if (suvRadioButton.isSelected()){
                addMotoCooling.setVisible(false);
                addMotoCylinder.setVisible(false);
                addMotoType.setVisible(false);
                addMotoTypeText.setVisible(false);
                addMotoCylinderText.setVisible(false);
                addMotoCoolingText.setVisible(false);

                addVehicleSerial.setVisible(true);
                addVehicleSerialText.setVisible(true);
                addVehicleFuel.setVisible(true);
                addVehicleFuelText.setVisible(true);
                addJeepTraction.setVisible(true);
                addJeepTractionText.setVisible(true);
            }
        });// add vehicle panel opener
        addVehicle2Button.addActionListener(e -> {
            try {
                // Get the common fields
                String make = addVehicleMakeText.getText();
                String model = addVehicleModelText.getText();
                int year = Integer.parseInt(addVehicleYearText.getText());
                int kilometer = Integer.parseInt(addVehicleKilometerText.getText());
                String color = addVehicleColorText.getText();
                String enginePower = addVehicleEnginePowerText.getText();
                String engineCapacity = addVehicleEngineCapacityText.getText();
                int price = Integer.parseInt(addVehiclePriceText.getText());
                int stock = Integer.parseInt(addVehicleStockText.getText());

                // Get the vehicle ID
                int vehicleId = getLastId("vehicles") + 1;

                if (carRadioButton.isSelected()) {
                    // Get the car details
                    String serial = addVehicleSerialText.getText();
                    String fuel = addVehicleFuelText.getText();

                    // Create a new car object and add it to the list
                    Car car = new Car(vehicleId, serial, fuel, make, model, year, kilometer, color, enginePower, engineCapacity, price, stock);
                    carList.add(car);
                    car.addCarToDB(make,model,year,kilometer,color,enginePower,engineCapacity,price,stock,serial,fuel);

                    // Save the image
                    saveImageFromLabel(imageLabel, "images", "vehicles_" + vehicleId + ".png");

                    // Refresh the panel
                    updateCarPanel();
                    vehicleParentPanel.removeAll();
                    vehicleParentPanel.add(carPanel);
                    vehicleParentPanel.revalidate();
                    vehicleParentPanel.repaint();

                } else if (motorcycleRadioButton.isSelected()) {
                    // Get the motorcycle details
                    String type = addMotoTypeText.getText();
                    String cooling = addMotoCoolingText.getText();
                    String cylinder = addMotoCylinderText.getText();

                    // Create a new motorcycle object and add it to the list
                    Motorcycle motor = new Motorcycle(vehicleId, type, cooling, cylinder, make, model, year, kilometer, color, enginePower, engineCapacity, price, stock);
                    motorList.add(motor);
                    motor.addMotorToDB(make, model, year, kilometer, color, enginePower, engineCapacity, price, stock, type, cooling, cylinder);

                    // Save the image
                    saveImageFromLabel(imageLabel, "images", "vehicles_" + vehicleId + ".png");

                    // Refresh the panel
                    updateMotoPanel();
                    vehicleParentPanel.removeAll();
                    vehicleParentPanel.add(motorcyclePanel);
                    vehicleParentPanel.revalidate();
                    vehicleParentPanel.repaint();

                } else if (suvRadioButton.isSelected()) {
                    // Get the SUV details
                    String serial = addVehicleSerialText.getText();
                    String fuel = addVehicleFuelText.getText();
                    String traction = addJeepTractionText.getText();

                    // Create a new SUV object and add it to the list
                    Jeep jeep = new Jeep(vehicleId, serial, fuel, traction, make, model, year, kilometer, color, enginePower, engineCapacity, price, stock);
                    jeepList.add(jeep);
                    jeep.addJeepToDB(make, model, year, kilometer, color, enginePower, engineCapacity, price, stock, serial, fuel, traction);

                    // Save the image
                    saveImageFromLabel(imageLabel, "images", "vehicles_" + vehicleId + ".png");

                    // Refresh the panel
                    updateJeepPanel();
                    vehicleParentPanel.removeAll();
                    vehicleParentPanel.add(suvPanel);
                    vehicleParentPanel.revalidate();
                    vehicleParentPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a vehicle type!");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        });// clicking this button adds the vehicle
        imageUploadButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Select Vehicle Image");
            fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "png"));
            int result = fileChooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();

                try {
                    // Scale the photo and place it in the JLabel
                    ImageIcon vehicleImageIcon = new ImageIcon(new ImageIcon(selectedFile.getAbsolutePath())
                            .getImage()
                            .getScaledInstance(450, 200, Image.SCALE_SMOOTH)); // Scale the image

                    imageLabel.setIcon(vehicleImageIcon); // Set the icon on the JLabel
                    JOptionPane.showMessageDialog(null, "Image successfully loaded.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error loading image: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Image loading canceled.");
            }
        });// upload a photo from the computer
        adminPanelButton.addActionListener(e -> {
            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                // SQL query to fetch data from the admin table
                String query = "SELECT vehicle_type_number, user_number, rented_vehicle_number, total_turnover, vehicle_stock FROM public.admin";

                try (Statement statement = connection.createStatement();
                     ResultSet resultSet = statement.executeQuery(query)) {

                    if (resultSet.next()) {
                        // Read the database values into variables
                        int vehicleTypeNumber = resultSet.getInt("vehicle_type_number");
                        int userNumber = resultSet.getInt("user_number");
                        int rentedVehicleNumber = resultSet.getInt("rented_vehicle_number");
                        double totalTurnover = resultSet.getDouble("total_turnover");
                        int vehicleStock = resultSet.getInt("vehicle_stock");

                        // Put the values into the JTextAreas
                        adminVehicleType.setText(String.valueOf(vehicleTypeNumber));
                        adminUserNumber.setText(String.valueOf(userNumber));
                        adminOnRentedVehicle.setText(String.valueOf(rentedVehicleNumber));
                        adminRevenue.setText(String.valueOf(totalTurnover));
                        adminVehicleStock.setText(String.valueOf(vehicleStock));
                    }
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "An error occurred while connecting to the database: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Panel visibility and repaint
            vehicleTypePanel.setVisible(false);
            parentPanel.removeAll();
            parentPanel.add(adminPanel);
            parentPanel.revalidate();
            parentPanel.repaint();
        });
        iadeButton.addActionListener(e -> {
            int iadeId = Integer.parseInt(iadeField.getText());
            try {
                // Call the vehicle return function
                vehicle_return(userId, iadeId);

                // On success, switch to homePanel
                parentPanel.removeAll();
                parentPanel.add(homePanel);
                parentPanel.revalidate();
                parentPanel.repaint();

                // Show a success message
                JOptionPane.showMessageDialog(null, "Vehicle returned successfully.");
            } catch (Exception ex) {
                // On error, stay on adminPanel and show an error message
                JOptionPane.showMessageDialog(null,
                        "An error occurred while returning the vehicle: " + ex.getMessage(),
                        "Return Error", JOptionPane.ERROR_MESSAGE);

                // On error, leave the panel on adminPanel
                parentPanel.removeAll();
                parentPanel.add(adminPanel);
                parentPanel.revalidate();
                parentPanel.repaint();
            }
        });
    }
    public static void saveImageFromLabel(JLabel imageLabel, String destDirPath, String fileName) throws IOException {
        if (imageLabel.getIcon() != null) {
            // Check the folder (create it if missing)
            File destDir = new File(destDirPath);
            if (!destDir.exists()) {
                destDir.mkdir();
            }

            // File path
            File destFile = new File(destDir, fileName);

            // Create a BufferedImage from the ImageIcon
            ImageIcon icon = (ImageIcon) imageLabel.getIcon();
            Image img = icon.getImage();

            // Convert to BufferedImage
            BufferedImage bufferedImage = new BufferedImage(
                    img.getWidth(null),
                    img.getHeight(null),
                    BufferedImage.TYPE_INT_ARGB
            );
            Graphics2D g2d = bufferedImage.createGraphics();
            g2d.drawImage(img, 0, 0, null);
            g2d.dispose();

            // Write the image to the file
            ImageIO.write(bufferedImage, "png", destFile);
            JOptionPane.showMessageDialog(null, "Image successfully saved as " + fileName);
        } else {
            JOptionPane.showMessageDialog(null, "No image found on the label!");
        }
    }
    public void rentVehicle(int userId, String address, int vehicleId, int daysBetween, JTextField feeField, JPanel parentPanel) {

        String insertSQL = "CALL vehicle_rent(?, ?, ?, ?, ?)";  // Procedure call

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(insertSQL)) {

            // Pass the user-supplied values to the procedure
            stmt.setInt(1, userId);  // User ID
            stmt.setString(2, address);  // User address
            stmt.setInt(3, vehicleId);  // Vehicle ID
            stmt.setInt(4, daysBetween);  // Rental duration (in days)
            stmt.setInt(5, Integer.parseInt(feeField.getText()));  // Rental fee

            // Execute the procedure
            stmt.executeUpdate();

            // Success message
            JOptionPane.showMessageDialog(parentPanel, "Vehicle rented successfully!");

        } catch (SQLException ex) {
            ex.printStackTrace();  // Print the error details
            JOptionPane.showMessageDialog(parentPanel, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(parentPanel, "The fee field must be a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static int calculateDaysBetween(String inputDate, String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false); // Enforces strict date parsing
        try {
            // Get the date entered by the user and the system date
            Date enteredDate = sdf.parse(inputDate);
            Date currentDate = new Date(); // System date

            // Calculate the difference in milliseconds
            long differenceInMillis = enteredDate.getTime() - currentDate.getTime();

            // Calculate the difference in days
            return (int) (differenceInMillis / (1000 * 60 * 60 * 24) +1);
        } catch (ParseException e) {
            throw new RuntimeException("Invalid date format. Please use " + dateFormat, e);
        }
    }
    private void setupFormattedFields() {
        try {

            // Card Number (16 digits)
            MaskFormatter cardNumberFormatter = new MaskFormatter("####-####-####-####");
            cardNumberFormatter.setPlaceholderCharacter('_');
            cardNumberFormatter.install(cardNumberField);

            // Card Expiry Date (MM/YY)
            MaskFormatter cardDateFormatter = new MaskFormatter("##/##");
            cardDateFormatter.setPlaceholderCharacter('_');
            cardDateFormatter.install(cardDateField);

            // Card CVC (3 digits)
            MaskFormatter cardCvcFormatter = new MaskFormatter("###");
            cardCvcFormatter.setPlaceholderCharacter('_');
            cardCvcFormatter.install(cardCvcField);

            // Vehicle Return Date (DD/MM/YYYY)
            MaskFormatter vehicleReturnFormatter = new MaskFormatter("##/##/####");
            vehicleReturnFormatter.setPlaceholderCharacter('_');
            vehicleReturnFormatter.install(vehicleReturnField);

        } catch (ParseException e) {
            throw new RuntimeException("Error setting up formatted fields", e);
        }
    }
    public void toggleAdminMode(boolean enable) {
        if (enable) {
            // Switch to admin mode
            carContractButton.setVisible(false);
            motoContractButton.setVisible(false);
            suvContractButton.setVisible(false);
            iadeField.setEditable(false);

            adminEdit1.setVisible(true);
            adminDelete1.setVisible(true);
            adminEdit2.setVisible(true);
            adminDelete2.setVisible(true);
            adminEdit3.setVisible(true);
            adminDelete3.setVisible(true);
            addVehicle1Button.setVisible(true);
            adminContractTable.setVisible(true);
            adminPanelButton.setVisible(true);
        } else {
            // Exit admin mode
            carContractButton.setVisible(true);
            motoContractButton.setVisible(true);
            suvContractButton.setVisible(true);
            iadeField.setEditable(true);

            adminEdit1.setVisible(false);
            adminUpdate1.setVisible(false);
            adminDelete1.setVisible(false);
            adminEdit2.setVisible(false);
            adminUpdate2.setVisible(false);
            adminDelete2.setVisible(false);
            adminEdit3.setVisible(false);
            adminUpdate3.setVisible(false);
            adminDelete3.setVisible(false);
            addVehicle1Button.setVisible(false);
            adminContractTable.setVisible(false);
            adminPanelButton.setVisible(false);
        }
    }// Method that toggles admin mode
    private void vehicle_return(int userId, int vehicleId) {
        String callProcedureSQL = "CALL return_vehicle(?, ?)";

        try (Connection conn = createConnection();
             PreparedStatement stmt = conn.prepareStatement(callProcedureSQL)) {

            // Pass the parameters to the procedure
            stmt.setInt(1, userId);
            stmt.setInt(2, vehicleId);

            // Execute the procedure
            stmt.execute();

            // Show the user a success message
            JOptionPane.showMessageDialog(null, "Vehicle returned successfully.");

        } catch (SQLException e) {
            // Notify the user on error
            JOptionPane.showMessageDialog(null,
                    "An error occurred: " + e.getMessage(),
                    "Return Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    private void updateJeepPanel() {
        // Refresh the Jeep list from the database
        jeepList = jeep.getAllJeeps();

        suvPanel.removeAll();  // Clear existing components
        suvPanel.setLayout(new GridLayout(0, 2, 10, 10));  // Create a 2-column GridLayout

        for (Jeep vehicle : jeepList) {
            if (vehicle != null) {  // Null check
                JPanel singleVehiclePanel = new JPanel(new BorderLayout());  // Separate panel for each vehicle
                singleVehiclePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                singleVehiclePanel.setBackground(new Color(214, 240, 247));  // Background color

                // Get the Jeep ID
                int vehicleId = vehicle.getId();
                String imageFileName = String.format("images/vehicles_%d.png", vehicleId);

                // Check for and load the image
                ImageIcon vehicleImageIcon;
                File imageFile = new File(imageFileName);
                if (imageFile.exists()) {
                    vehicleImageIcon = new ImageIcon(new ImageIcon(imageFileName)
                            .getImage()
                            .getScaledInstance(150, 100, Image.SCALE_SMOOTH));  // Smaller scaling
                } else {
                    // Load a default image
                    vehicleImageIcon = new ImageIcon(new ImageIcon("images/default_jeep.png")
                            .getImage()
                            .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
                }

                // Image label
                JLabel vehicleImageLabel = new JLabel(vehicleImageIcon);

                // Vehicle info label
                JLabel vehicleInfoLabel = new JLabel(
                        "<html>Make: " + vehicle.getMake() +
                                "<br>Serial: " + vehicle.getSerial() +
                                "<br>Price: " + vehicle.getPrice() + "</html>"
                );
                vehicleInfoLabel.setHorizontalAlignment(SwingConstants.CENTER);  // Center the text
                vehicleInfoLabel.setForeground(Color.BLACK);

                // Details button
                JButton detailsButton = new JButton("Show Details");
                detailsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
                detailsButton.setBackground(background);
                detailsButton.setForeground(Color.WHITE);

                detailsButton.addActionListener(e -> {
                    vehicleParentPanel.removeAll();
                    vehicleParentPanel.add(suvInfoPanel);
                    vehicleParentPanel.revalidate();
                    vehicleParentPanel.repaint();

                    // Build the file name dynamically
                    String fileName = String.format("images/vehicles_%d.png", vehicleId);

                    // Large image scaling
                    ImageIcon jeepImage;
                    File largeImageFile = new File(fileName);
                    if (largeImageFile.exists()) {
                        jeepImage = new ImageIcon(new ImageIcon(fileName)
                                .getImage()
                                .getScaledInstance(450, 300, Image.SCALE_SMOOTH));
                    } else {
                        jeepImage = new ImageIcon(new ImageIcon("images/default_jeep.png")
                                .getImage()
                                .getScaledInstance(450, 300, Image.SCALE_SMOOTH));
                    }
                    suvbigInfo.setIcon(jeepImage);

                    // Small image scaling
                    ImageIcon smallImage;
                    if (largeImageFile.exists()) {
                        smallImage = new ImageIcon(new ImageIcon(fileName)
                                .getImage()
                                .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
                    } else {
                        smallImage = new ImageIcon(new ImageIcon("images/default_jeep.png")
                                .getImage()
                                .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
                    }
                    contractImage.setIcon(smallImage);

                    vehicleInfo.setText("<html>Make: " + vehicle.getMake() +
                            "<br>Serial: " + vehicle.getSerial() +
                            "<br>Price: " + vehicle.getPrice() + "</html>");

                    currentVehicleId = vehicleId;  // Update the current ID
                    updateJeepInfoPanel(jeep.getJeepById(currentVehicleId));
                });

                // Panel layout: image on top, info in the middle, button at the bottom
                singleVehiclePanel.add(vehicleImageLabel, BorderLayout.WEST);  // Show the image on top
                singleVehiclePanel.add(vehicleInfoLabel, BorderLayout.CENTER); // Show the info in the middle
                singleVehiclePanel.add(detailsButton, BorderLayout.SOUTH);     // Show the button at the bottom

                suvPanel.add(singleVehiclePanel);  // Add to the main panel
            }
        }
        // Repaint the panel
        suvPanel.revalidate();
        suvPanel.repaint();
    }
    private void updateMotoPanel() {
        // Refresh motorList from the database
        motorList = motorcycle.getAllMotorcycles(); // Reload all motorcycles

        motorcyclePanel.removeAll();  // Clear existing components
        motorcyclePanel.setLayout(new GridLayout(0, 2, 10, 10));  // Create a 2-column GridLayout

        for (Motorcycle vehicle : motorList) {
            if (vehicle != null) {  // Null check
                JPanel singleMotoPanel = new JPanel(new BorderLayout());
                singleMotoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                singleMotoPanel.setBackground(new Color(214, 240, 247));

                int vehicleId = vehicle.getId(); // Get the ID directly
                String imageFileName = String.format("images/vehicles_%d.png", vehicleId);

                // Check for the image file of the newly added vehicle
                ImageIcon vehicleImageIcon = null;
                File imageFile = new File(imageFileName);
                if (imageFile.exists()) {
                    vehicleImageIcon = new ImageIcon(new ImageIcon(imageFileName)
                            .getImage()
                            .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
                } else {
                    // Use the default image
                    vehicleImageIcon = new ImageIcon(new ImageIcon("images/default_motorcycle.png")
                            .getImage()
                            .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
                }

                JLabel vehicleImageLabel = new JLabel(vehicleImageIcon);

                JLabel vehicleInfoLabel = new JLabel(
                        "<html>Make: " + vehicle.getMake() +
                                "<br>Model: " + vehicle.getModel() +
                                "<br>Price: " + vehicle.getPrice() + "</html>"
                );
                vehicleInfoLabel.setHorizontalAlignment(SwingConstants.CENTER);
                vehicleInfoLabel.setForeground(Color.BLACK);

                JButton detailsButton = new JButton("Show Details");
                detailsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
                detailsButton.setBackground(background);
                detailsButton.setForeground(Color.WHITE);
                detailsButton.addActionListener(e -> {
                    vehicleParentPanel.removeAll();
                    vehicleParentPanel.add(motorInfoPanel);
                    vehicleParentPanel.revalidate();
                    vehicleParentPanel.repaint();

                    System.out.println(vehicleId);

                    String fileName = String.format("images/vehicles_%d.png", vehicleId);

                    ImageIcon carImage = new ImageIcon(new ImageIcon(fileName)
                            .getImage()
                            .getScaledInstance(450, 300, Image.SCALE_SMOOTH));
                    motorbigInfo.setIcon(carImage);

                    ImageIcon a = new ImageIcon(new ImageIcon(fileName)
                            .getImage()
                            .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
                    contractImage.setIcon(a);

                    vehicleInfo.setText("<html>Make: " + vehicle.getMake() +
                            "<br>Model: " + vehicle.getModel() +
                            "<br>Price: " + vehicle.getPrice() + "</html>");

                    currentVehicleId = vehicleId;  // Update the current ID
                    updateMotorcycleInfoPanel(motorcycle.getMotorcycleById(currentVehicleId));
                });

                singleMotoPanel.add(vehicleImageLabel, BorderLayout.WEST);
                singleMotoPanel.add(vehicleInfoLabel, BorderLayout.CENTER);
                singleMotoPanel.add(detailsButton, BorderLayout.SOUTH);

                motorcyclePanel.add(singleMotoPanel);
            }
        }

        motorcyclePanel.revalidate(); // Recalculate the layout
        motorcyclePanel.repaint();   // Repaint the panel to refresh the view
    }
    private void updateCarPanel() {
        // Refresh the vehicle list from the database
        carList = car.getAllCars();

        carPanel.removeAll();  // Clear existing components
        carPanel.setLayout(new GridLayout(0, 2, 10, 10));  // Create a 2-column GridLayout

        for (Car vehicle : carList) {
            if (vehicle != null) {  // Null check
                JPanel singleCarPanel = new JPanel(new BorderLayout());  // Separate panel for each vehicle
                singleCarPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                singleCarPanel.setBackground(new Color(214, 240, 247));  // Background color

                int vehicleId = vehicle.getId(); // Get the ID directly
                String imageFileName = String.format("images/vehicles_%d.png", vehicleId);

                // Load and check the image
                ImageIcon vehicleImageIcon;
                File imageFile = new File(imageFileName);
                if (imageFile.exists()) {
                    vehicleImageIcon = new ImageIcon(new ImageIcon(imageFileName)
                            .getImage()
                            .getScaledInstance(150, 100, Image.SCALE_SMOOTH));  // Smaller scaling
                } else {
                    // Load a default image
                    vehicleImageIcon = new ImageIcon(new ImageIcon("images/default_car.png")
                            .getImage()
                            .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
                }

                JLabel vehicleImageLabel = new JLabel(vehicleImageIcon);

                JLabel vehicleInfoLabel = new JLabel(
                        "<html>Make: " + vehicle.getMake() +
                                "<br>Serial: " + vehicle.getSerial() +
                                "<br>Price: " + vehicle.getPrice() + "</html>"
                );
                vehicleInfoLabel.setHorizontalAlignment(SwingConstants.CENTER);  // Center the text
                vehicleInfoLabel.setForeground(Color.BLACK);

                JButton detailsButton = new JButton("Show Details");
                detailsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
                detailsButton.setBackground(background);
                detailsButton.setForeground(Color.WHITE);

                detailsButton.addActionListener(e -> {
                    vehicleParentPanel.removeAll();
                    vehicleParentPanel.add(carInfoPanel);
                    vehicleParentPanel.revalidate();
                    vehicleParentPanel.repaint();

                    String fileName = String.format("images/vehicles_%d.png", vehicleId);

                    // Load and check the large image
                    ImageIcon carImage;
                    File largeImageFile = new File(fileName);
                    if (largeImageFile.exists()) {
                        carImage = new ImageIcon(new ImageIcon(fileName)
                                .getImage()
                                .getScaledInstance(450, 300, Image.SCALE_SMOOTH));  // Large image scaling
                    } else {
                        carImage = new ImageIcon(new ImageIcon("images/default_car.png")
                                .getImage()
                                .getScaledInstance(450, 300, Image.SCALE_SMOOTH));
                    }
                    carbigInfo.setIcon(carImage);

                    // Load and check the small image
                    ImageIcon smallImage;
                    if (largeImageFile.exists()) {
                        smallImage = new ImageIcon(new ImageIcon(fileName)
                                .getImage()
                                .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
                    } else {
                        smallImage = new ImageIcon(new ImageIcon("images/default_car.png")
                                .getImage()
                                .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
                    }
                    contractImage.setIcon(smallImage);

                    vehicleInfo.setText("<html>Make: " + vehicle.getMake() +
                            "<br>Serial: " + vehicle.getSerial() +
                            "<br>Price: " + vehicle.getPrice() + "</html>");

                    currentVehicleId = vehicleId;  // Update the current ID
                    updateCarInfoPanel(car.getCarById(currentVehicleId));
                });

                singleCarPanel.add(vehicleImageLabel, BorderLayout.WEST);  // Place the image on the left
                singleCarPanel.add(vehicleInfoLabel, BorderLayout.CENTER); // Show the info in the middle
                singleCarPanel.add(detailsButton, BorderLayout.SOUTH);     // Show the button at the bottom

                carPanel.add(singleCarPanel);  // Add to the main panel
            }
        }

        // Repaint the panel
        carPanel.revalidate();
        carPanel.repaint();
    }
    public void updateCarInfoPanel(Car car) {
        if (car != null) {
            carMakeprivate.setText(car.getMake());
            carSerialprivate.setText(car.getSerial());
            carFuelprivate.setText(car.getFuel());
            carYearprivate.setText(String.valueOf(car.getYear()));
            carKmprivate.setText(String.valueOf(car.getKilometer()));
            carColorprivate.setText(car.getColor());
            carEnginePprivate.setText(car.getEnginePower());
            carEngineCrivate.setText(car.getEngineCapacity());
            carPriceprivate.setText(String.valueOf(car.getPrice()));
            carModelprivate.setText(car.getModel());
            carStockPrivate.setText(String.valueOf(car.getStock()));
        } else {
            JOptionPane.showMessageDialog(null, "Vehicle information not found!");
        }
    }
    public void updateMotorcycleInfoPanel(Motorcycle motorcycle) {
        if (motorcycle != null) {
            motoMakePrivate.setText(motorcycle.getMake());
            motoCoolingPrivate.setText(motorcycle.getCooling());
            motoKmPrivate.setText(String.valueOf(motorcycle.getKilometer()));
            motoCyclinderPrivate.setText(String.valueOf(motorcycle.getCylinders()));
            motoModelPrivate.setText(motorcycle.getModel());
            motoPricePrivate.setText(String.valueOf(motorcycle.getPrice()));
            motoTypePrivate.setText(motorcycle.getType());
            motoYearPrivate.setText(String.valueOf(motorcycle.getYear()));
            motoEngineCPrivate.setText(motorcycle.getEngineCapacity());
            motoEnginePPrivate.setText(motorcycle.getEnginePower());
            motoColorPrivate.setText(motorcycle.getColor());
            motoStockPrivate.setText(String.valueOf(motorcycle.getStock()));
        } else {
            JOptionPane.showMessageDialog(null, "Motorcycle information not found!");
        }
    }
    public void updateJeepInfoPanel(Jeep jeep) {
        if (jeep != null) {
            suvMake.setText(jeep.getMake());
            suvTraction.setText(jeep.getTraction());
            suvYear.setText(String.valueOf(jeep.getYear()));
            suvKm.setText(String.valueOf(jeep.getKilometer()));
            suvFuel.setText(jeep.getFuel());
            suvSerial.setText(jeep.getSerial());
            suvModel.setText(jeep.getModel());
            suvPrice.setText(String.valueOf(jeep.getPrice()));
            suvColor.setText(jeep.getColor());
            suvEngineC.setText(jeep.getEngineCapacity());
            suvEngineP.setText(jeep.getEnginePower());
            suvStockP.setText(String.valueOf(jeep.getStock()));
        } else {
            JOptionPane.showMessageDialog(null, "SUV information not found!");
        }
    }
    public Connection createConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    public int getLastId(String tableName) {
        String selectSQL = "SELECT MAX(id) AS max_id FROM " + tableName + ";";
        int lastId = -1;  // Default value if the query returns nothing or an error occurs

        try (Connection conn = createConnection();
             PreparedStatement stmt = conn.prepareStatement(selectSQL)) {

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {  // If a result is returned
                lastId = rs.getInt("max_id");  // Get the value of the max_id column
            }

        } catch (SQLException e) {
            System.out.println("Error while fetching last ID from " + tableName + ": " + e.getMessage());
            lastId = -1;  // Default value on error
        }

        return lastId;  // Return the result
    }
    public static TableModel getRentedVehicleTable(int userId) {
        // Information required for the database connection
        // Connect to the database
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

            // SQL query to fetch the vehicles rented by the user
            String query = "SELECT * FROM get_rented_vehicles_by_user(?);";

            // DefaultTableModel holds the data as the model for the JTable
            DefaultTableModel tableModel = new DefaultTableModel();

            // Define the table headers
            tableModel.addColumn("Id");
            tableModel.addColumn("Make");
            tableModel.addColumn("Model");
            tableModel.addColumn("Fee");
            tableModel.addColumn("Purchase Date");
            tableModel.addColumn("Return Date");

            // JTable object
            JTable rentedVehicleTable = new JTable(tableModel);

            // Make the table headers black
            JTableHeader tableHeader = rentedVehicleTable.getTableHeader();
            tableHeader.setForeground(Color.BLACK); // Set the headers to black

            // Prepare the query
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, userId);

                // Execute the query
                try (ResultSet rs = stmt.executeQuery()) {
                    // Read the rows from the ResultSet and add them to the table model
                    while (rs.next()) {
                        Object[] row = new Object[6]; // Only 5 columns
                        row[0] = rs.getString("vehicle_id");
                        row[1] = rs.getString("make");  // Vehicle make
                        row[2] = rs.getString("model");  // Vehicle model
                        row[3] = rs.getInt("fee");      // Rental fee
                        row[4] = rs.getDate("purchase_date"); // Purchase date
                        row[5] = rs.getDate("return_date");   // Return date
                        // Add the row to the table
                        tableModel.addRow(row);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
            }

            return tableModel;

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
            return null;
        }
    }
    public static TableModel getAllRentedVehiclesTable() {
        // Information required for the database connection

        // SQL query
        String query = "SELECT * FROM get_all_rented_vehicles();";

        // DefaultTableModel holds the data as the model for the JTable
        DefaultTableModel tableModel = new DefaultTableModel();

        // Define the table headers

        tableModel.addColumn("User ID");
        tableModel.addColumn("Address");
        tableModel.addColumn("Purchase Date");
        tableModel.addColumn("Return Date");
        tableModel.addColumn("Vehicle ID");
        tableModel.addColumn("Fee");

        // Connect to the database
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            // Read the data and add it to the table model
            while (rs.next()) {
                Object[] row = new Object[6];

                row[0] = rs.getInt("user_id"); // User ID
                row[1] = rs.getString("address"); // User address
                row[2] = rs.getDate("purchase_date"); // Purchase date
                row[3] = rs.getDate("return_date"); // Return date
                row[4] = rs.getInt("vehicle_id"); // Vehicle ID
                row[5] = rs.getInt("fee"); // Fee

                // Add the row to the table
                tableModel.addRow(row);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
        }

        return tableModel; // Only the TableModel is returned
    }
    private void createUIComponents() {
        phoneLogo = new JLabel();
        ImageIcon phonelogoIcon = new ImageIcon(new ImageIcon("images/phone.png").getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH));
        phoneLogo.setIcon(phonelogoIcon);

        locationLogo = new JLabel();
        ImageIcon locationlogoIcon = new ImageIcon(new ImageIcon("images/location.png").getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH));
        locationLogo.setIcon(locationlogoIcon);

        instaLogo = new JLabel();
        ImageIcon instalogoIcon = new ImageIcon(new ImageIcon("images/insta.png").getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH));
        instaLogo.setIcon(instalogoIcon);

        mailLogo = new JLabel();
        ImageIcon maillogoIcon = new ImageIcon(new ImageIcon("images/mail.png").getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH));
        mailLogo.setIcon(maillogoIcon);

        homeLogo = new JLabel();
        ImageIcon homelogoIcon = new ImageIcon(new ImageIcon("images/SwiftWheels.png").getImage().getScaledInstance(400,220, Image.SCALE_SMOOTH));
        homeLogo.setIcon(homelogoIcon);

        LogoLabel = new JLabel();
        ImageIcon logoIcon = new ImageIcon(new ImageIcon("images/yatay.png").getImage().getScaledInstance(300,100, Image.SCALE_SMOOTH));
        LogoLabel.setIcon(logoIcon);

        car1Logo = new JLabel();
        ImageIcon carIcon = new ImageIcon(new ImageIcon("images/Car-Transparent-Background1.png").getImage().getScaledInstance(150,100, Image.SCALE_SMOOTH));
        car1Logo.setIcon(carIcon);

        car2Logo = new JLabel();
        ImageIcon car2Icon = new ImageIcon(new ImageIcon("images/Car-Transparent-Background2.png").getImage().getScaledInstance(150,100, Image.SCALE_SMOOTH));
        car2Logo.setIcon(car2Icon);

        motorLogo = new JLabel();
        ImageIcon motorIcon = new ImageIcon(new ImageIcon("images/Motorcycle-Transparent-Background1.png").getImage().getScaledInstance(150,100, Image.SCALE_SMOOTH));
        motorLogo.setIcon(motorIcon);

        ppLabel = new JLabel();
        ImageIcon ppIcon = new ImageIcon(new  ImageIcon("images/Pp.png").getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH));
        ppLabel.setIcon(ppIcon);
    }//The PNGs we use are loaded here
}