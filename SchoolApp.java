class Person {
    int id;
    String name;
    double basicSalary;
    static String collegeName = "Informatics College";

    public Person(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateAnnualSalary() {
        return basicSalary * 12;
    }
}

class Teacher extends Person {
    String subject;
    double bonus;

    public Teacher(int id, String name, double basicSalary, String subject, double bonus) {
        super(id, name, basicSalary);
        this.subject = subject;
        this.bonus = bonus;
    }

    @Override
    public double calculateAnnualSalary() {
        
        return super.calculateAnnualSalary() + bonus;
    }
}

public class SchoolApp {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(101, "Dr. Sharma", 50000, "Java", 20000);
        System.out.println("College: " + Person.collegeName);
        System.out.println("Teacher: " + t1.name);
        System.out.println("Annual Salary: Rs. " + t1.calculateAnnualSalary());
    }
}