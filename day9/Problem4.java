import java.util.Scanner;
public class Problem4 {
    int square(int n) {
        return n * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem4 obj = new Problem4();
        int n = sc.nextInt();
        System.out.println(obj.square(n));
    }
}