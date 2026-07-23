import java.util.ArrayList;
import java.util.List;
public class Problem8 {
    public static void subsets(int[] nums, int index, List<Integer> list, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            subsets(nums, i + 1, list, ans);
            list.remove(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        subsets(nums, 0, new ArrayList<>(), ans);
        System.out.println(ans);
    }
}