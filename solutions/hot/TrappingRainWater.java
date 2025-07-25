package hot;

/**
 * 42. 接雨水
 * 
 * @author 晓苏理
 * @date 2025-07-25 10:40:58
 * @link https://leetcode.cn/problems/trapping-rain-water
 */
public class TrappingRainWater {

    /**
     * DONE: 实现解法
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int trap(int[] height) {
            int l_max,r_max,ans;
            l_max=r_max=ans=0;
            for(int i=0;i<height.length;i++){
                l_max=Math.max(l_max,height[i]);
                r_max=Math.max(r_max,height[height.length-i-1]);
                ans+=l_max+r_max-height[i];
            }
            return ans-l_max*height.length;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}