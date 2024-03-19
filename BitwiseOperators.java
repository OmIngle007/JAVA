import java.util.Scanner;

public class BitwiseOperators {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int a = 10, b = 5;

		System.out.println("Bitwise AND: " + (a & b));
		System.out.println("Bitwise OR: " + (a | b));
		System.out.println("Bitwise XOR: " + (a ^ b));
		System.out.println("Bitwise NOT: " + (-a));
		System.out.println("Bitwise Left Shift: " + (a << 2));
		System.out.println("Bitwise Right Shift: " + (a >> 2));
		System.out.println("Bitwise Unsigned Right Shift: " + (a >>> 2));

		input.close();
	}
}
