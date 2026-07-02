import java.util.Scanner;
public class Problem6 {
    Problem6(int n) {
        System.out.println(n * n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Problem6(sc.nextInt());    }
}