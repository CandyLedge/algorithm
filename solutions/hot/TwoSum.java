package hot;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * 
 * @author 晓苏理
 * @date 2025-07-22 11:58:27
 * @link https://leetcode.cn/problems/two-sum
 */
public class TwoSum {

    /**
     * DONE: 实现解法
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] n, int t) {
            Map<Integer,Integer> m=new HashMap<>();
            for(int i=0;i<n.length;i++){
                int c=t-n[i];
                if(m.containsKey(c)){
                    return new int[]{i,m.get(c)};
                }
                m.put(n[i],i);
            }
            return new int[0];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}