public class SumofArrayDigits {

    public void sumOfArray() {
        int arr[] = {2,6,8,15,20,4};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];        
        }
        System.out.println(sum);
    }
    

    public static void main(String[] args) {
        SumofArrayDigits s = new SumofArrayDigits();
        s.sumOfArray();
    }
}
