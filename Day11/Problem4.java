import java.util.Scanner;
public class Problem4 {
    Problem4(int n) {
        System.out.println("Square = " + (n * n));
    }
    Problem4(double n) {
        System.out.println("Cube = " + (n * n * n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        new Problem4(n);
        new Problem4((double)n);
        sc.close();
    }
}