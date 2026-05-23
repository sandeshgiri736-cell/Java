public class MiniBookCorner {
    public static void main(String[] args) {
    
        String[] categories = {"Fiction", "Nepali"};
        
       
        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];

      
        titles[0][0] = "The Great Gatsby";
        prices[0][0] = 450.00;

        titles[1][0] = "Asahamati - 5";
        prices[1][0] = 750.00;

      
        System.out.println("--- Tiny Book Corner Inventory ---");
        for (int i = 0; i < categories.length; i++) {
            System.out.println("Category: " + categories[i]);
            
            System.out.printf("   Title: %s | Price: Rs. %.2f\n", titles[i][0], prices[i][0]);
        }
    }
}