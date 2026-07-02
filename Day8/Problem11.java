import java.util.Scanner;

public class Problem11 {

    static void printNumbers(int n) {
        for (int i = 1; i <= n; i++)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printNumbers(n);

        sc.close();
    }

}