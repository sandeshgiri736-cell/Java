import java.util.Scanner;
public class FixDepositNIB{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        char choice = 'y';
        System.out.println("Nepal Investment Bank Fix Deposit Calculator");
        
        while (choice == 'y' || choice == 'Y'){
            System.out.print("Enter Deposit Amount min Rs 1000: ");
            double principal = scanner.nextDouble();
            if (principal < 1000){
                System.out.println("Error: Mininum deposit is Rs 1000.");
                continue;
            }
            System.out.print("Enter Annual Interest Rate ( 8-12%) :");
            double annualRate = scanner.nextDouble();
            if (annualRate < 8 || annualRate > 12){
                System.out.println("Error: Rate must be between 8-12%.");
                continue;
            }
            System.out.print("Enter Duration in Years (Max 5): ");
            int years = scanner.nextInt();
            if (years < 1 || years > 5){
                System.out.println("Error: Years Duration must between 1 and 5 years.");
                continue;
            }
            int totalMonths = years * 12;
            double monthlyRate = (annualRate / 100) / 12;
            double feeRate = 0.005;
            double maturityAmount = principal * Math.pow( 1 + monthlyRate, totalMonths);
            double fee = maturityAmount * feeRate;
            double finalAmount = maturityAmount - fee;
            
            System.out.printf("Principal(P): Rs. %2f\n ", principal);
            System.out.printf("Annual Rate: %5f\n", annualRate);
            System.out.printf("Monthly Rate: %5f\n", monthlyRate);
            System.out.println("Duration: " + years + " years (" + totalMonths + " months)");
            System.out.printf("Maturity Amount (A): Rs. %.2f\n", maturityAmount);
            System.out.printf("Processing Fee (0.5%%): Rs. %.2f\n", fee);
            System.out.printf("FINAL AMOUNT TO RECEIVE: Rs. %.2f\n", finalAmount);
            
            System.out.print("Calculate another FD?(y/n): ");
            choice = scanner.next().charAt(0);
            
            
        }
        System.out.println("Thank you for using the NIB FD Calcculator");
        scanner.close();
    }
    
}