package Module_4.problem_1;

import java.util.Arrays;

public class ProductExceptSelf {

        public static int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] prefix = new int[n];
            int[] suffix = new int[n];
            int[] ans = new int[n];

            prefix[0] = 1;
            suffix[n - 1] = 1;

            // Fill prefix array
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] * nums[i - 1];
            }

            // Fill suffix array
            for (int i = n - 2; i >= 0; i--) {
                suffix[i] = suffix[i + 1] * nums[i + 1];
            }

            // Calculate the result
            for (int i = 0; i < n; i++) {
                ans[i] = prefix[i] * suffix[i];
            }
            return ans;
        }


    public static void main(String[] args) {

            int[] arr = new int[] { 1, 2, 3, 4 };

            int[] ans = ProductExceptSelf.productExceptSelf(arr);
            System.out.println(Arrays.toString(ans));
            
    }
}
