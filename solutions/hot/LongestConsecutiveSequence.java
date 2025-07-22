package hot;

import java.util.HashSet;
import java.util.Set;

/**
 * 128. 最长连续序列
 * 
 * @author 晓苏理
 * @date 2025-07-22 22:13:39
 * @link https://leetcode.cn/problems/longest-consecutive-sequence
 */
public class LongestConsecutiveSequence {

    /**
     * DONE: 实现解法
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestConsecutive(int[] nums) {
            Set<Integer> s=new HashSet<>();
            for(int num:nums)
                s.add(num);

            int ans=0;
            for(int num:s){
                int cur=num;
                if(!s.contains(cur-1)){
                    while(s.contains(cur+1))
                        cur++;
                }
                ans=Math.max(ans, cur-num+1);
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}