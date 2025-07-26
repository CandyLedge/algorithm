package hot;

import java.util.HashMap;

/**
 * 3. 无重复字符的最长子串
 * 
 * @author 晓苏理
 * @date 2025-07-26 16:28:52
 * @link https://leetcode.cn/problems/longest-substring-without-repeating-characters
 */
public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * DONE: 实现解法
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s.length() == 0)
                return 0;
            HashMap<Character, Integer> map = new HashMap<>();
            int w, l, r;

            for (w = l = r = 0; r < s.length(); r++) {
                if (map.containsKey(s.charAt(r))) {
                    l = Math.max(l, map.get(s.charAt(r)) + 1);
                }
                map.put(s.charAt(r), r);
                w = Math.max(w, r - l + 1);
            }
            return w;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}