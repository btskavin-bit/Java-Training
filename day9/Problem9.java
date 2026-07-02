import java.util.Scanner;
public class Problem9 {
    double area(double r) {
        return 3.14 * r * r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem9 obj = new Problem9();
        double r = sc.nextDouble();
        System.out.println(obj.area(r));
    }
}