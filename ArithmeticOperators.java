public class ArithmeticOperators {

    public static void main(String []args) {
        int a = 12, b = 6;

        // arithmetic operators -> +,-,*,%,/,++,--
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int mod = a%b;
        
        System.out.println("Addition: " + add + "\nSubtraction: " + sub + "\nMultiplication: " + mul + "\nModulus: " + mod);

        // for division case
        if(b==0) {

            System.out.println("Invalid Operation. Enter a valid number, b cant be zero");
        } else {
            int div = a/b;
            System.out.println("Division: " + div);
        }

        // int x = 5;
        // x++;
        // int y = 60;
        // y--;
        
        a++;
        b--;

        System.out.println("Increment: " + a + "\nDecrement: " + b);

    }

}
