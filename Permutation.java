import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] nums1 = {0, 2, 1, 5, 3, 2};
        int[] ans1 = buildArray(nums1);
        System.out.println(Arrays.toString(ans1));
        
        int[] nums2 = {5, 0, 1, 2, 3, 5};
        int[] ans2 = buildArray(nums2);
        System.out.println(Arrays.toString(ans2));
    }
    
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
