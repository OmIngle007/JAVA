import java.util.*;

public class ExceptionHandling {
    Scanner scanner = new Scanner(System.in);

    public void division() {
        System.out.print("Enter the value of a and b: ");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        try {
            int div = firstNum/secondNum;
            System.out.println(div);
        } catch(ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getMessage() + ". Enter valid values.");
        }
    }

    public void Array() {
            int arr[] = {12,52,45,56,25};
            try {
                System.out.println(arr[6]);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception occured: " + e.getLocalizedMessage());
            }
    }

    public static void main(String[] args) {
        ExceptionHandling e = new ExceptionHandling();
        e.division();
        e.Array();
    }
}
