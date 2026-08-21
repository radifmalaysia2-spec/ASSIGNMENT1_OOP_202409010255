import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter mark (0-100): ");
        double mark = input.nextDouble();

        if (mark < 0 || mark > 100) {
            System.out.println("Invalid mark. Please enter a value from 0 to 100.");
            input.close();
            return;
        }

        String grade;
        if (mark >= 80) {
            grade = "A";
        } else if (mark >= 70) {
            grade = "B";
        } else if (mark >= 60) {
            grade = "C";
        } else if (mark >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\nStudent: " + name);
        System.out.println("Mark   : " + mark);
        System.out.println("Grade  : " + grade);
        input.close();
    }
}

