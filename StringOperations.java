public class StringOperations {

    String str1 = "sggs";
    String str2 = " it";

    public void stringOp() {
        String str3 = str1 + str2;
        System.out.println(str3);
        System.out.println(str1.length());
        System.out.println(str1.charAt(1));
        System.out.println(str1.substring(0, 2));
        System.out.println(str1.trim());
    }

    public static void main(String[] args) {
        StringOperations s = new StringOperations();
        s.stringOp();
    }
}
