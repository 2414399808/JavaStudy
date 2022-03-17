import java.util.Arrays;

public class FindRepeatNumber {


    public static int findRepeatNumber(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findRepeatNumber(new int[]{1, 2, 3, 4, 2, 3, 4}));
    }
}
