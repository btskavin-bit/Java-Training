import java.util.Scanner;
public class Problem7 {
    Problem7(int n) {
        System.out.println(n * n * n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Problem7(sc.nextInt());
    }
}