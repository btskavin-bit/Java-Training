import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Problem7 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            int maxFreq = 0;
            int maxElement = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxElement = entry.getKey();
                }
            }
            result[i] = maxElement;
            map.remove(maxElement);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] ans = topKFrequent(nums, k);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}