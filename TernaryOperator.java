public class TernaryOperator {
    public static void main(String[] args) {

        // int firstNum = 10, secondNum = 5;
        // int greaterNum = firstNum > secondNum ? firstNum : secondNum;
        // System.out.println(greaterNum + " is the greatest number.");

        int firstNum = 10, secondNum = 5, thirdNum = 12;
        int greaterNum = (firstNum > secondNum) ? (secondNum > thirdNum ? secondNum : thirdNum) : firstNum;
        System.out.println(greaterNum + " is the greater number among these three.");
    }
}
