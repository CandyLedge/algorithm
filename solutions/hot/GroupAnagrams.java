package hot;

import java.util.*;

/**
 * 49. 字母异位词分组
 *
 * @author 晓苏理
 * @date 2025-07-22 14:09:16
 * @link https://leetcode.cn/problems/group-anagrams
 */
public class GroupAnagrams {

    /**
     * DONE: 实现解法
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String,List<String>> m=new HashMap<>();
            for(String s:strs){
                char[] sortedS=s.toCharArray();
                Arrays.sort(sortedS);
                m.computeIfAbsent(new String(sortedS),k->new ArrayList<>()).add(s);
            }
            return new ArrayList<>(m.values());
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}