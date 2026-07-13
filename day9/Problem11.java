package Day9;
public class Problem11 {
    void reverse(String s) {
        for (int i = s.length() - 1; i >= 0; i--)
            System.out.print(s.charAt(i));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem11 obj = new Problem11();
        obj.reverse(sc.nextLine());
    }
}