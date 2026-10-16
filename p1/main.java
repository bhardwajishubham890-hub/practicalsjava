class Student {
    int rollNumber;
    String name;
    double subject1;
    double subject2;
    double subject3;

    Student(int rollNumber, String name, double subject1, double subject2, double subject3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    double calculateTotal() {
        return subject1 + subject2 + subject3;
    }

    double calculatePercentage() {
        return calculateTotal() / 3;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Subject 1 Marks: " + subject1);
        System.out.println("Subject 2 Marks: " + subject2);
        System.out.println("Subject 3 Marks: " + subject3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("-------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "shubham", 85, 90, 80);
        Student s2 = new Student(102, "shuddhi", 92, 88, 95);
        Student s3 = new Student(103, "suraj", 75, 82, 78);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
