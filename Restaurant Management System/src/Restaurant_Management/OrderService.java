package Restaurant_Management;

import java.sql.*;
import java.util.Scanner;

public class OrderService {
	public static void placeOrder(Scanner sc) {
	    System.out.print("Customer ID: ");
	    int customerId = sc.nextInt();
	    System.out.println("\n📋 MENU");
	    viewMenuItems();
	    System.out.print("\nEnter Item ID: ");
	    int itemId = sc.nextInt();
	    System.out.print("Enter Quantity: ");
	    int quantity = sc.nextInt();
	    String sql = "INSERT INTO orders(customer_id, item_id, quantity) VALUES (?, ?, ?)";
	    try (
	        Connection con = DBConnection.getConnection();
	        PreparedStatement ps = con.prepareStatement(sql)
	    ) {
	        ps.setInt(1, customerId);
	        ps.setInt(2, itemId);
	        ps.setInt(3, quantity);
	        ps.executeUpdate();

	        System.out.println("✅ Order placed successfully.");
	    } catch (SQLException e) {
	        System.out.println("⚠️ Error placing order.");
	    }
	}
	
	public static void viewMenuItems() {

	    String sql = "SELECT * FROM menu_items";

	    try (
	        Connection con = DBConnection.getConnection();
	        PreparedStatement ps = con.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery()
	    ) {

	        System.out.printf("%-10s %-20s %-10s%n",
	                "Item ID", "Item Name", "Price");

	        while (rs.next()) {

	            System.out.printf("%-10d %-20s %-10.2f%n",
	                    rs.getInt("item_id"),
	                    rs.getString("item_name"),
	                    rs.getDouble("price"));
	        }

	    } catch (SQLException e) {
	        System.out.println("⚠️ Error loading menu.");
	    }
	}
    
    public static void updateOrder(Scanner sc) {
        System.out.print("Enter Order ID to update: ");

        if (!sc.hasNextInt()) {
            System.out.println("-> Invalid Order ID");
            sc.nextLine();
            return;
        }
        int orderId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter New Item Name: ");
        String itemName = sc.nextLine();
        System.out.print("Enter New Quantity: ");

        if (!sc.hasNextInt()) {
            System.out.println("-> Invalid Quantity");
            sc.nextLine();
            return;
        }
        int quantity = sc.nextInt();
        String sql = "UPDATE orders SET item_name=?, quantity=? WHERE order_id=?";
        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setString(1, itemName);
            ps.setInt(2, quantity);
            ps.setInt(3, orderId);
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("-> Order updated successfully.");
            } else {
                System.out.println("-> Order ID not found.");
            }
        } catch (SQLException e) {
            System.out.println("-> Error updating order.");
        }
    }
    
    public static void deleteOrder(Scanner sc) {
        System.out.print("Enter Order ID to delete: ");
        if (!sc.hasNextInt()) {
            System.out.println("-> Invalid Order ID");
            sc.nextLine();
            return;
        }
        int orderId = sc.nextInt();
        String sql = "DELETE FROM orders WHERE order_id=?";
        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setInt(1, orderId);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Order deleted successfully.");
            } else {
                System.out.println("Order ID not found.");
            }
        } catch (SQLException e) {
            System.out.println("-> Error deleting order.");
        }
    }
    
    public static void viewOrders() {
        String sql =
                "SELECT o.order_id, c.name AS customer_name, " +
                "m.item_name, o.quantity, m.price, " +
                "(o.quantity * m.price) AS total " +
                "FROM orders o " +
                "JOIN customers c ON o.customer_id = c.customer_id " +
                "JOIN menu_items m ON o.item_id = m.item_id";
        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {
            System.out.println("\n📋 Orders List");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.printf("%-10s %-20s %-15s %-10s %-10s %-10s%n",
                    "Order ID",
                    "Customer",
                    "Item",
                    "Quantity",
                    "Price",
                    "Total");
            while (rs.next()) {
                System.out.printf("%-10d %-20s %-15s %-10d %-10.2f %-10.2f%n",
                        rs.getInt("order_id"),
                        rs.getString("customer_name"),
                        rs.getString("item_name"),
                        rs.getInt("quantity"),
                        rs.getDouble("price"),
                        rs.getDouble("total"));
            }
        } catch (SQLException e) {
            System.out.println("⚠️ Error viewing orders.");
            e.printStackTrace();
        }
    }
}