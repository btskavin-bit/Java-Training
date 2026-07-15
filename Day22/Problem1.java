import java.util.HashMap;
import java.util.Map;
public class Problem1 {
    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return ch;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return ' ';
    }
    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
}