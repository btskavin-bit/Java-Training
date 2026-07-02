import java.util.Scanner;
public class Problem9 {
    static int cube(int n) {
        return n * n * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cube(n));
    }
}