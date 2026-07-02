import java.util.Scanner;
public class Problem6 {
    void check(int n) {
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem6 obj = new Problem6();
        obj.check(sc.nextInt());
    }
}