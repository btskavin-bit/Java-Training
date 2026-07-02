import java.util.Scanner;
public class Problem5 {
    int cube(int n) {
        return n * n * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem5 obj = new Problem5();
        int n = sc.nextInt();
        System.out.println(obj.cube(n));
    }
}