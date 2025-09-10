package Q2;
import java.util.ArrayList;

public class PayableDriver {
    public static void main(String[] args) {
        // Create an array of Payable references
        ArrayList<Payable> payables = new ArrayList<>();

        // Populate the array with different Payable objects
        // At least 2 freelancers
        payables.add(new Freelancer("Coco", "Chanel", 23, 38));  // no OT
        payables.add(new Freelancer("Kang", "Daniel", 34, 45));  // with OT
        payables.add(new Freelancer("Lisa", "Blackpink", 70, 54)); // with OT 

       // At least 2 vendor invoices
        payables.add(new VendorInvoice("Schneider", "I1234", 4500));
        payables.add(new VendorInvoice("XPO Logistics", "I4567", 975.50));
        payables.add(new VendorInvoice("J.B. Hunt Inc.", "I7890", 6430.75));

        // Total payout
        double totalPayout = 0;

        System.out.println("==================== Payments for This Period ================");
        for (Payable p : payables) {
            // Polymorphic print with overridden toString()
            System.out.println(p);
            totalPayout += p.calculatePayment();
        }
        System.out.println("==============================================================");
        System.out.printf("TOTAL PAYOUT: $%,.2f%n", totalPayout);
    }
}
