import java.util.Scanner;

public class IT24104168Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of new members you have introduced: ");
        int newMembers = scanner.nextInt();
        
        if (newMembers < 0) {
            System.out.println("Invalid number. The number of new members must be 0 or greater.");
        } else {
            String prize;
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }
            System.out.println("You are entitled to: " + prize);
        }
        
        scanner.close();
    }
}
