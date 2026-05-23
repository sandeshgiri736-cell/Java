class Patient {
    String patientName;
    int age;
    int daysAdmitted;
    double dailyCharge;

    public Patient(String patientName, int age, int daysAdmitted, double dailyCharge) {
        this.patientName = patientName;
        this.age = age;
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    public double calculateTotalBill() {
        double total = daysAdmitted * dailyCharge;
       
        if (daysAdmitted > 7) {
            total = total * 0.90;
        }
        return total;
    }

    public void displayDetails() {
        System.out.println("Patient: " + patientName + " | Age: " + age + " | Days: " + daysAdmitted);
    }
}

public class HospitalTest {
    public static void main(String[] args) {
        Patient p1 = new Patient("Sita Kumari", 45, 10, 2000.0);
        Patient p2 = new Patient("Ram Thapa", 30, 5, 2000.0);

        p1.displayDetails();
        System.out.println("Total Bill (after discount if applicable): Rs. " + p1.calculateTotalBill());

       

        p2.displayDetails();
        System.out.println("Total Bill (after discount if applicable): Rs. " + p2.calculateTotalBill());
    }
}