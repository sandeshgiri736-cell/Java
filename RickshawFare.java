import java.util.Scanner;

public class RickshawFare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter distance in KM: ");
        double distance = sc.nextInt();
        System.out.print("Enter time in Minutes: ");
        int time = sc.nextInt();
        
        System.out.print("Is the customer a local? true or false: ");
        boolean isLocal = sc.nextBoolean();
        System.out.print("Is it night-time ? true or false: ");
        boolean isNight = sc.nextBoolean();
        
        double baseFare = 50.0;
        double distCharge = distance * 20.0;
        double timeCharge = time * 2.0;
        
        double totalFare = baseFare + distCharge + timeCharge;
        
        totalFare = (isLocal && distance > 5) ? totalFare * 0.9: totalFare;
        
        totalFare = (isNight) ? totalFare * 1.2: totalFare;
        
        System.out.println("\n --- Fare Summary ---");
        System.out.println("Total Fare: Rs. " + (int)totalFare);
        
    }
}