import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    String getGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 50)
            return "C";
        else
            return "Fail";
    }
}

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Student Grade Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Roll No: ");
                int roll = sc.nextInt();
                System.out.print("Enter Marks: ");
                double marks = sc.nextDouble();

                students.add(new Student(name, roll, marks));
                System.out.println("Student added successfully!");

            } else if (choice == 2) {
                System.out.println("\n--- Student Records ---");
                for (Student s : students) {
                    System.out.println("Name: " + s.name + ", Roll: " + s.rollNo +
                            ", Marks: " + s.marks + ", Grade: " + s.getGrade());
                }

            } else if (choice == 3) {
                System.out.println("Exiting program...");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
