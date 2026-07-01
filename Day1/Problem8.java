import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        System.out.println("Perimeter = " + (2 * (l + w)));
    }
}