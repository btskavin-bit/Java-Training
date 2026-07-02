import java.util.Scanner;
public class Problem10 {
    static void check(int n) {
        if (n >= 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    }
}