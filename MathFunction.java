public class MathFunction {
    int a = 12, b = 6;

    public void allMathOperations() {
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        
        System.out.println(add + "\n" + sub + "\n" + mul);
        if(b==0) {
            System.out.println("Error...Divide by zero is not possible.");
        } else {
            double div = a/b;
            System.out.println(div);
        }
    }
    public static void main(String[] args) {
        MathFunction m = new MathFunction();
        m.allMathOperations();
    }
}
