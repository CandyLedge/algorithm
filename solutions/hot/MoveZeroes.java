package hot;

import java.util.Arrays;

/**
 * 283. 移动零
 * 
 * @author 晓苏理
 * @date 2025-07-23 08:06:47
 * @link https://leetcode.cn/problems/move-zeroes
 */
public class MoveZeroes {

    /**
     * TODO: 实现解法
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            int stackSize=0;
            for(int x:nums){
                if(x!=0)
                    nums[stackSize++]=x;
            }
            Arrays.fill(nums,stackSize,nums.length,0);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution1 {
        public void moveZeroes(int[] nums) {
            if(nums==null||nums.length==0)
                return;
            int s,f;
            for(s=f=0;f<nums.length;f++){
                if(nums[f]!=0){
                    int t=nums[f];
                    nums[f]=nums[s];
                    nums[s]=t;
                    s++;
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}