import java.util.Scanner;

public class FixedDepositNIB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "yes";
        
        while (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter Principal amount above Rs 1000: ");
            double principal = sc.nextDouble();
            
            System.out.print("Enter Annual Rate 8% to 12%: ");
            double annualRate = sc.nextDouble();
            
            System.out.print("Enter Duration years max 5: ");
            int years = sc.nextInt();
            
            
            int months = years * 12;
            double monthlyRate = (annualRate / 100) / 12;
            double maturityAmount = principal * Math.pow((1 + monthlyRate), months);
            
            double feeRate = 0.005; 
            double fee = maturityAmount * feeRate;
            double finalAmount = maturityAmount - fee;
            
            System.out.println("\n --- FD Calculation Results ---");
            System.out.printf("Maturity Amount (before fee): Rs. %.2f\n", maturityAmount);
            
           
            System.out.printf("Processing Fee (0.5%%): Rs. %.2f\n", fee); 
            
            System.out.printf("Final Maturity Amount: Rs. %.2f\n", finalAmount);
            
            System.out.print("\nCalculate another FD? (yes/no): ");
            choice = sc.next();
        }
        
        System.out.println("Thank you for using NIB FD Calculator!");
        sc.close();
    }
}