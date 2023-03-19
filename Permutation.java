import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] nums1 = {0, 2, 1, 5, 3, 2};
        int[] ans1 = new int[nums1.length];
        buildArray(nums1, ans1);
        System.out.println(Arrays.toString(ans1));
        
        int[] nums2 = {5, 0, 1, 2, 3, 5};
        int[] ans2 = new int[nums2.length];
        buildArray(nums2, ans2);
        System.out.println(Arrays.toString(ans2));
    }
    
    public static void buildArray(int[] nums, int[] ans) {
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
    }
}
