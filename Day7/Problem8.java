import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (c >= 'a' && c <= 'z' &&
                c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
                count++;
        }
        System.out.println("Consonants = " + count);
    }
}