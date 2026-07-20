import java.util.*;

public class Problem7 {

    static List<List<Integer>> result = new ArrayList<>();

    public static void subset(int[] nums, int index, List<Integer> list) {

        result.add(new ArrayList<>(list));

        for (int i = index; i < nums.length; i++) {

            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            list.add(nums[i]);
            subset(nums, i + 1, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2};

        Arrays.sort(nums);

        subset(nums, 0, new ArrayList<>());

        System.out.println(result);
    }
}