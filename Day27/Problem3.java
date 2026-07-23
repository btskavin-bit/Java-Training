public class Problem3 {
    public static String removeOuterParentheses(String s) {
        String result = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (count > 0)
                    result += ch;
                count++;
            } else {
                count--;
                if (count > 0)
                    result += ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
}