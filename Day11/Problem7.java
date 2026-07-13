import java.util.Scanner;
public class Problem7 {
    Problem7(int n) {
        if(n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        new Problem7(n);
        sc.close();
    }
}