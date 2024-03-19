public class Functions {

    int x1 = 20, x2 = 50;
    // Function with arguments with return value
    public int Add1(int a, int b) {
        return a+b;
    }
    
    // Function with arguments without value
    public void Add2(int a, int b) {
        int result = a+b;
        System.out.println("Function with arguments without value: " + result);
    }

    // Function without arguments and without return value
    public void Add3() {
        int add = this.x1 + this.x2;
        System.out.println("Function without arguments and without return value: " + add);
    }

    // Function without arguments and with return value
    public int Add4() {
        int add = this.x1 + this.x2;
        return add;
    }

    // Call by reference
    public int CallByReference(int a, int b) {
        return a+b;
    }

    // Call by value
    public int CallByValue(int a, int b) {
        return a+b;
    }

    public static void main(String args[]) {
        int x = 10, y = 5;
        Functions f = new Functions();
        int result1 = f.Add1(x,y);
        System.out.println("Function with arguments with return value: " + result1);
        f.Add2(x,y);
        f.Add3();
        System.out.println("Function without arguments and without return value: " + f.Add4());

        // CALL BY REFERENCE

        System.out.println("\n***CASE 1: Before Call By Reference***");
        System.out.println("Before x: " + x);
        System.out.println("Before y: " + y);

        f.CallByReference(x,y);

        System.out.println("\n***CASE 1: After Call By Reference***");
        System.out.println("After x: " + x);
        System.out.println("After y: " + y);

        // CALL BY VALUE

        System.out.println("\n***CASE 2: Before Call By Value***");
        System.out.println("Before x: " + x);
        System.out.println("Before y: " + y);

        f.CallByValue(x,y);

        System.out.println("\n***CASE 2: After Call By Value***");
        System.out.println("After x: " + x);
        System.out.println("After y: " + y);
    }
}
