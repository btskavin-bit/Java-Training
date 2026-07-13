import java.util.Scanner;
public class Problem6 {
    Problem6(double r) {
        System.out.println("Area = " + (3.14 * r * r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        new Problem6(r);
        sc.close();
    }
}