package hot;

/**
 * 11. 盛最多水的容器
 * 
 * @author 晓苏理
 * @date 2025-07-24 17:46:19
 * @link https://leetcode.cn/problems/container-with-most-water
 */
public class ContainerWithMostWater {

    /**
     * DONE: 实现解法
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxArea(int[] height) {
            int ans=0;
            int i=0;
            int j=height.length-1;

            while(i<j){
                int area=(j-i)*Math.min(height[i],height[j]);
                ans=Math.max(ans,area);
                if(height[i]<height[j]){
                    i++;
                }else {
                    j--;
                }
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}