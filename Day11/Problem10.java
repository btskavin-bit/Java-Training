import java.util.Scanner;
public class Problem10 {
    Problem10(int p,int r,int t){
        int si=(p*r*t)/100;
        System.out.println("Simple Interest = "+si);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        new Problem10(p,r,t);
        sc.close();
    }
}