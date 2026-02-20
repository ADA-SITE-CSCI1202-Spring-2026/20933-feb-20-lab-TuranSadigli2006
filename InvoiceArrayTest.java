import java.util.Scanner;

public class InvoiceArrayTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of invoices: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Invoice[] invoices = new Invoice[n];

        // a) Take information about a few invoices from the user
        for (int i = 0; i < n; i++) {
            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Part number: ");
            String partNumber = sc.nextLine();

            System.out.print("Part description: ");
            String description = sc.nextLine();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Price per item: ");
            double price = sc.nextDouble();
            sc.nextLine(); // consume newline

            invoices[i] = new Invoice(partNumber, description, quantity, price);
        }

        // Calculate and display invoice amount per each invoice item
        System.out.println("\n--- Invoice Amounts ---");
        for (Invoice inv : invoices) {
            System.out.println(
                "Part: " + inv.getPartNumber() +
                " | Description: " + inv.getPartDescription() +
                " | Amount: " + inv.getInvoiceAmount()
            );
        }

        sc.close();
    }
}
class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Getters
    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // Method to calculate invoice amount for this item
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}