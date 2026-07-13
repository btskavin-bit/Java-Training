package Day9;
import java.util.Scanner;
public class Problem8 {
    int area(int l, int b) {
        return l * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem8 obj = new Problem8();
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(obj.area(l, b));
    }
}