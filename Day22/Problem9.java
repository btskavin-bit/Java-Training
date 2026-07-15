import java.util.HashMap;
import java.util.Map;
public class Problem9 {
    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }
            if (map.containsKey(sum)) {
                int length = i - map.get(sum);
                if (length > maxLength) {
                    maxLength = length;
                }
            } else {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] nums = {0, 1};
        System.out.println(findMaxLength(nums));
    }
}