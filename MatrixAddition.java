public class MatrixAddition {

    public void matrixAdd() {
        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        MatrixAddition m = new MatrixAddition();
        m.matrixAdd();
    }
}
