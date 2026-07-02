import java.util.Scanner;
public class Problem9 {
    Problem9(int a, int b) {
        System.out.println(a > b ? a : b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Problem9(sc.nextInt(), sc.nextInt());
    }
}