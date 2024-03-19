public class NestedIfElse {
    public static void main(String args[]) {
        int marks = 75;

        if(marks >= 90 && marks <=100) {
            System.out.println("Grade: A+");
        } else if(marks >= 83) {
            System.out.println("Grade: A");
        } else if(marks >= 73) {
            System.out.println("Grade: B+");
        } else if(marks >= 63) {
            System.out.println("Grade: B");
        } else if(marks >= 53) {
            System.out.println("Grade: C+");
        } else if(marks >= 43) {
            System.out.println("Grade: C");
        } else if(marks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Fail");
        }
    }
}