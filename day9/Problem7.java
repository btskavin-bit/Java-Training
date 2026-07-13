package Day9;
import java.util.Scanner;
public class Problem7 {
    int max(int a, int b) {
        return (a > b) ? a : b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem7 obj = new Problem7();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(obj.max(a, b));
    }
}