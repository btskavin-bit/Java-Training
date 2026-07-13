import java.util.Scanner;
public class Problem13 {
    Problem13(int a,int b){
        System.out.println("Product = "+(a*b));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        new Problem13(a,b);
    }
}