import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Search {
    public static int search(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        System.out.println(leftIdx);
        int rightIdx = binarySearch(nums, target, false) - 1;
        System.out.println(rightIdx);
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return rightIdx - leftIdx + 1;
        }
        return 0;
    }

    public static int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        System.out.println(search(new int[]{5, 5,8,8,8,8, 8, 8, 9, 9, 10}, 8));
    }

}
