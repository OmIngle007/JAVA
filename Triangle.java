public class Triangle {

    int base = 10, height = 5;

    Triangle() {
        double area = (0.5* base * height);
        System.out.println("Area of Triangle using default constructor: " + area);
    }

    Triangle(double base, double height) {
        this.base = (int)base;
        this.height = (int)height;
        double area = (0.5 * base * height);
        System.out.println("Area of Triangle using parameter constructor: " + area);
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        Triangle t2 = new Triangle();
    }
}
