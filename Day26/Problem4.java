import java.util.ArrayList;
import java.util.List;
public class Problem4 {
    public static void permute(int[] nums, List<Integer> list, boolean[] used, List<List<Integer>> ans) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            used[i] = true;
            list.add(nums[i]);
            permute(nums, list, used, ans);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        permute(nums, new ArrayList<>(), new boolean[nums.length], ans);
        System.out.println(ans);
    }
}