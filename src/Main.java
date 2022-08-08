public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,15}};
        System.out.println("Tổng đường chéo thứ nhất là: " + sumCrossPath1(arr));
        System.out.println("Tổng đường chéo thứ hai là: " + sumCrossPath2(arr));
    }
    public static int sumCrossPath1(int[][] arr){
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1+= arr[i][i];
        }
        return sum1;
    }
    public static int sumCrossPath2(int[][] arr){
        int sum2 =0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[arr.length-1-i][i];
        }
        return sum2;
    }
}
