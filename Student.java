import java.util.*;

public class Student {

    Scanner scanner = new Scanner(System.in);
    int enteredStudents;
    String[] names;
    int[] roll_nos;
    int[] totalMarks;

    public void studentsData() {

        System.out.print("Enter the number of students: ");
        enteredStudents = scanner.nextInt();
        scanner.nextLine(); 

        names = new String[enteredStudents];
        roll_nos = new int[enteredStudents];
        totalMarks = new int[enteredStudents];

        for(int i = 0; i < enteredStudents; i++) {
            System.out.print("Enter the name of the Student " + (i+1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter the roll number: ");
            roll_nos[i] = scanner.nextInt();
            scanner.nextLine();

            int j, sum = 0;
            int marks[] = new int[5];
            for(j = 0; j < 5; j++) {
                System.out.print("Enter the marks for Subject " + (j+1) + ": ");
                marks[j] = scanner.nextInt();
                scanner.nextLine();
                sum = sum + marks[j];
            }
            totalMarks[i] = sum;
            System.out.println("Total Marks of Student " + (i+1) + ": " + sum);
        }
    }

    public void printData() {
        for (int i = 0; i < enteredStudents; i++) {
            System.out.println("Student " + (i+1) + ":");
            System.out.println("Name: " + names[i]);
            System.out.println("Roll Number: " + roll_nos[i]);
            System.out.println("Total Marks: " + totalMarks[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.studentsData();
        s.printData();
    }
}
