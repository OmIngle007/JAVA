public class Main {
    public static void main(String[] args) {
        String str = null;
        try {

            int length = str.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
