import java.util.Scanner;
public class Problem3 {
    int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem3 obj = new Problem3();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(obj.add(a, b));
    }
}