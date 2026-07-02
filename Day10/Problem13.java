import java.util.Scanner;
public class Problem13 {
    Problem13(int a, int b) {
        System.out.println(a * b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Problem13(sc.nextInt(), sc.nextInt());
    }
}