import java.util.Scanner;

public class IT24104168Lab5Q3 {
    public static void main(String[] args) {
        final int ROOM_CHARGE_PER_DAY = 48000;
        final int DISCOUNT_3_TO_4_DAYS = 10;
        final int DISCOUNT_5_OR_MORE_DAYS = 20;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();
        
        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();
        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }
        
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be earlier than the end date.");
            return;
        }
        
        int numberOfDays = endDate - startDate + 1;
        double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
        
        int discountPercentage = 0;
        if (numberOfDays >= 5) {
            discountPercentage = DISCOUNT_5_OR_MORE_DAYS;
        } else if (numberOfDays >= 3) {
            discountPercentage = DISCOUNT_3_TO_4_DAYS;
        }
        
        double discountAmount = (discountPercentage / 100.0) * totalAmount;
        double amountToPay = totalAmount - discountAmount;
        
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Total amount before discount: Rs " + totalAmount);
        System.out.println("Discount applied: " + discountPercentage + "%");
        System.out.println("Total amount to be paid: Rs " + amountToPay);
        
        scanner.close();
    }
}
