public class Factorial {

    public void factOfNum() {
        int fact = 1, num = 5;
        for(int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String args[]) {
        Factorial f = new Factorial();
        f.factOfNum();
    }
}