import java.util.Scanner;
public class Problem10 {
    Problem10(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();
        new Problem10(arr);
    }
}