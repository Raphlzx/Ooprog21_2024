import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        final int HOURLY_RATE = 40;
        final int ADDITIONAL_MINUTE_RATE = 1;

        Scanner input = new Scanner(System.in);

       
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

       
        System.out.print("Enter the number of minutes rented: ");
        int totalMinutes = input.nextInt();

        
        int hours = totalMinutes / 60;
        int additionalMinutes = totalMinutes % 60;
        double totalPrice = (hours * HOURLY_RATE) + (additionalMinutes * ADDITIONAL_MINUTE_RATE);

        
        System.out.println("-------------------------------------");
        System.out.println("Number of Minutes: " + totalMinutes);
        System.out.println("Hours: " + hours);
        System.out.println("Additional minutes: " + additionalMinutes);
        System.out.println("Total price: $" + totalPrice);
    }
}
