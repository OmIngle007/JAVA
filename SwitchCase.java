import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 20, b = 5;

        while(true) {
            System.out.print("Enter your choice: ");
            int enteredNum = scanner.nextInt();

            if(enteredNum == 0 || enteredNum == -1) {
                System.out.println("Exited");
                break;
            }

            switch(enteredNum) {
                case 1: int add = a+b;
                System.out.println("Addition: " + add);
                break;

                case 2: int sub = a-b;
                System.out.println("Subtraction: " + sub);
                break;

                case 3: int mul = a*b;
                System.out.println("Multiplication: " + mul);
                break;

                case 4: double mod = a%b;
                System.out.println("Modulus: " + mod);
                break;

                case 5: if(b==0) {
                    System.out.println("Divide by zero is not possible. Enter valid values.");
                } else {
                    double div = a/b;
                    System.out.println("Division: " + div);
                }
                break;

                default: System.out.println("Invalid choice.");
                break;
            }
        }
        scanner.close();
    }
}