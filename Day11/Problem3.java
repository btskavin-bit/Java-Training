import java.util.Scanner;
public class Problem3 {
    Problem3(int length, int breadth) {
        System.out.println("Area = " + (length * breadth));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        new Problem3(l,b);
        sc.close();
    }
}