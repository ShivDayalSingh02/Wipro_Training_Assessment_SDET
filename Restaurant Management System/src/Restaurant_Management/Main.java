package Restaurant_Management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("-> Username: ");
        String username = sc.nextLine();
        System.out.print("-> Password: ");
        String password = sc.nextLine();

        if (!LoginService.login(username, password)) {
            System.out.println("-> Login failed.");
            return;
        }
        boolean running = true;
        while (running) {
            System.out.println("\n******* Restaurant Management System *******");
            System.out.println("1. Add Customer");
            System.out.println("2. View Customers");
            System.out.println("3. Place Order");
            System.out.println("4. Update Order");
            System.out.println("5. Delete Order");
            System.out.println("6. View Orders");
            System.out.println("7. Generate Bill");
            System.out.println("8. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> CustomerService.addCustomer(sc);
                case 2 -> CustomerService.viewCustomers();
                case 3 -> OrderService.placeOrder(sc);
                case 4 -> OrderService.updateOrder(sc);
                case 5 -> OrderService.deleteOrder(sc);
                case 6 -> OrderService.viewOrders();
                case 7 -> BillingService.generateBill(sc);
                case 8 -> {
                    System.out.println("\n🔚 Program ended successfully.");
                    running = false;
                }
                default -> System.out.println("-> Invalid choice");
            }
        }
        sc.close();
    }
}