import java.util.Scanner;
public class Problem5 {
    Problem5(int l, int b) {
        System.out.println("Area = " + (l * b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Problem5(sc.nextInt(), sc.nextInt());
    }
}