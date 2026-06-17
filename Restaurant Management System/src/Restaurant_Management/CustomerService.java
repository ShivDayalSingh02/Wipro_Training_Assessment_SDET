package Restaurant_Management;

import java.sql.*;
import java.util.Scanner;

public class CustomerService {
    public static void addCustomer(Scanner sc) {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();

        String sql = "INSERT INTO customers(name, phone) VALUES (?, ?)";
        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.executeUpdate();
            System.out.println("-> Customer added");

        } catch (SQLException e) {
            System.out.println("-> Error");
        }
    }
    public static void viewCustomers() {
        String sql = "SELECT * FROM customers";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {
            while (rs.next()) {
                System.out.println(rs.getInt("customer_id") + " " +
                        rs.getString("name") + " " +
                        rs.getString("phone"));
            }
        } catch (SQLException e) {
            System.out.println("-> Error");
        }
    }
}