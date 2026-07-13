import java.util.Scanner;
public class Problem11 {
    Problem11(int n){
        while(n!=0){
            System.out.print(n%10);
            n=n/10;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        new Problem11(n);
        sc.close();
    }
}