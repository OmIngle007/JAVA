public class Main {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            int index = 5;

            int value = array[index];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        } catch (Exception e) {

            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
