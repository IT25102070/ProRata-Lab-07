import java.util.Scanner;

public class IT25102070Lab7Q3 {
    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

        final double DISCOUNT_RATE = 0.05; 

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i + ":");

            System.out.print("Enter total bill amount: ");
            double billAmount = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Enter payment mode (C for cash , O for others): ");
            String paymentMode = scanner.nextLine();

            if (paymentMode.equalsIgnoreCase("C")) {
                double discount = billAmount * DISCOUNT_RATE;
                double finalAmount = billAmount - discount;
                System.out.printf("Discount is: %.2f\n", discount);
                System.out.printf("Amount to be paid: %.2f\n", finalAmount);
            } else if (paymentMode.equalsIgnoreCase("O")) {
                System.out.println("No discount applied.");
                System.out.printf("Amount to be paid: %.2f\n", billAmount);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println(); 
			
        }

        scanner.close();
    }
}