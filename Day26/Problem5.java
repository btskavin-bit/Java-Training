import java.util.Stack;
public class Problem5 {
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String rev = "";
        while (!stack.isEmpty()) {
            rev += stack.pop();
        }
        return rev;
    }
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(reverse(str));
    }
}