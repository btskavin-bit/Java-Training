import java.util.Scanner;
public class Problem12 {
    Problem12(double r) {
        System.out.println(3.14 * r * r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Problem12(sc.nextDouble());
    }
}