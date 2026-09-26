import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class Jeep extends Vehicle {
    private static final String URL = "jdbc:postgresql://localhost:5432/YOUR_DATABASE";
    private static final String USER = "YOUR_USERNAME";
    private static final String PASSWORD = "YOUR_PASSWORD";
    private String serial;
    private String fuel;
    private String traction;
    public Jeep(int id,String serial, String fuel, String traction, String make, String model, int year, int kilometer, String color, String enginePower, String engineCapacity, int price, int stock) {
        super(id,make, model, year, kilometer, color, enginePower, engineCapacity, price, stock);
        this.serial = serial;
        this.fuel = fuel;
        this.traction = traction;
    }
    public Jeep() {}
    public Jeep getJeepById(int jeepId) {
        String query = "SELECT * FROM get_vehicle_details_by_type(?, 'jeep');";

        try (Connection conn = createConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, jeepId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Jeep(
                        rs.getInt("id"),
                        rs.getString("detail1"),               // Serial
                        rs.getString("detail2"),               // Fuel type
                        rs.getString("detail3"),           // Drive type
                        rs.getString("make"),               // Make
                        rs.getString("model"),              // Model
                        rs.getInt("year"),                  // Production year
                        rs.getInt("km"),                    // Kilometers
                        rs.getString("color"),              // Color
                        rs.getString("engine_power"),       // Engine power
                        rs.getString("engine_capacity"),    // Engine capacity
                        rs.getInt("price"),                 // Price
                        rs.getInt("stock")                  // Stock quantity
                );
            }

        } catch (SQLException e) {
            System.err.println("Error while fetching jeep: " + e.getMessage());
        }
        return null; // Return null if the jeep is not found
    }
    public ArrayList<Jeep> getAllJeeps() {
        ArrayList<Jeep> jeepList = new ArrayList<>();
        String query = "SELECT * FROM get_vehicles('jeep')";

        try (Connection conn = createConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                // Create a Jeep object and add it to the list
                jeepList.add(new Jeep(
                        rs.getInt("id"),                 // ID
                        rs.getString("detail1"),            // Serial
                        rs.getString("detail2"),            // Fuel Type
                        rs.getString("detail3"),        // Drive System
                        rs.getString("make"),            // Make
                        rs.getString("model"),           // Model
                        rs.getInt("year"),               // Production Year
                        rs.getInt("km"),                 // Kilometers
                        rs.getString("color"),           // Color
                        rs.getString("engine_power"),    // Engine Power
                        rs.getString("engine_capacity"), // Engine Capacity
                        rs.getInt("price"),              // Price
                        rs.getInt("stock")               // Stock Quantity
                ));
            }

        } catch (SQLException e) {
            System.err.println("Error while fetching jeeps: " + e.getMessage());
        }

        return jeepList;
    }
    public void deleteJeep(int id) throws SQLException{
        String deleteSQL = "call delete_vehicle('jeep',?);";

        try (Connection conn = createConnection();
             PreparedStatement stmt = conn.prepareStatement(deleteSQL)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
    public void updateJeep(
            int vehicleId, JTextArea make, JTextArea model, JTextArea year, JTextArea km, JTextArea color,
            JTextArea enginePower, JTextArea engineCapacity, JTextArea price, JTextArea stock,
            JTextArea serial, JTextArea fuel, JTextArea traction) {

        String sql = "CALL add_update_vehicle('jeep', ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NULL, NULL, NULL);";

        try (Connection conn = createConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, vehicleId);
            stmt.setString(2, make.getText());
            stmt.setString(3, model.getText());
            stmt.setInt(4, Integer.parseInt(year.getText()));
            stmt.setInt(5, Integer.parseInt(km.getText()));
            stmt.setString(6, color.getText());
            stmt.setString(7, enginePower.getText());
            stmt.setString(8, engineCapacity.getText());
            stmt.setInt(9, Integer.parseInt(price.getText()));
            stmt.setInt(10, Integer.parseInt(stock.getText()));
            stmt.setString(11, serial.getText());
            stmt.setString(12, fuel.getText());
            stmt.setString(13, traction.getText());

            stmt.executeUpdate();
            System.out.println("Jeep updated successfully.");

        } catch (SQLException e) {
            System.err.println("Error while updating jeep: " + e.getMessage());
        }
    }
    public void addJeepToDB(
            String make, String model, int year, int kilometer, String color,
            String enginePower, String engineCapacity, int price, int stock,
            String serial, String fuel, String traction) {
        String sql = "CALL add_update_vehicle('jeep', NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NULL, NULL, NULL)";

        try (Connection conn = createConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, make);
            stmt.setString(2, model);
            stmt.setInt(3, year);
            stmt.setInt(4, kilometer);
            stmt.setString(5, color);
            stmt.setString(6, enginePower);
            stmt.setString(7, engineCapacity);
            stmt.setInt(8, price);
            stmt.setInt(9, stock);
            stmt.setString(10, serial);
            stmt.setString(11, fuel);
            stmt.setString(12, traction);

            stmt.executeUpdate();
            System.out.println("Jeep added successfully.");
        } catch (SQLException e) {
            System.err.println("Error while adding jeep: " + e.getMessage());
        }
    }
    @Override
    void addToList() {}
    // Getter and Setter Methods
    public String getSerial() { return serial; }
    public String getFuel() { return fuel; }
    public String getTraction() { return traction; }
    public Connection createConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
