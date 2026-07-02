import java.util.Scanner;
public class Problem10 {
    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem10 obj = new Problem10();
        int n = sc.nextInt();
        System.out.println(obj.factorial(n));
    }
}