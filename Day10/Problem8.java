import java.util.Scanner;
public class Problem8 {
    Problem8(int n) {
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Problem8(sc.nextInt());
    }
}