package Restaurant_Management;

import java.sql.*;
import java.util.Scanner;

public class BillingService {

    public static void generateBill(Scanner sc) {

        System.out.print("Enter Order ID: ");
        int orderId = sc.nextInt();
        String sql =
                "SELECT o.order_id, m.item_name, m.price, o.quantity, " +
                "(m.price * o.quantity) AS total_amount " +
                "FROM orders o " +
                "JOIN menu_items m ON o.item_id = m.item_id " +
                "WHERE o.order_id = ?";
        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setInt(1, orderId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String itemName = rs.getString("item_name");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                double total = rs.getDouble("total_amount");

                System.out.println("\n========= BILL =========");
                System.out.println("Order ID   : " + orderId);
                System.out.println("Item Name  : " + itemName);
                System.out.println("Price      : ₹" + price);
                System.out.println("Quantity   : " + quantity);
                System.out.println("------------------------");
                System.out.println("Total Bill : ₹" + total);
                System.out.println("========================");
            } 
            else {
                System.out.println("❌ Order not found.");
            }
        } catch (SQLException e) {
            System.out.println("⚠️ Error generating bill.");
        }
    }
}