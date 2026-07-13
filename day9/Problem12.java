package Day9;
import java.util.Scanner;
public class Problem12 {
    int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++)
            total += arr[i];
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem12 obj = new Problem12();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();
        System.out.println(obj.sum(arr));
    }
}