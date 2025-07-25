package hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 438. 找到字符串中所有字母异位词
 * 
 * @author 晓苏理
 * @date 2025-07-25 21:42:02
 * @link https://leetcode.cn/problems/find-all-anagrams-in-a-string
 */
public class FindAllAnagramsInAString {

    /**
     * DONE: 实现解法
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            int n=s.length(),m=p.length();
            List<Integer> ans=new ArrayList<>();
            if(n<m) return ans;
            int[] pCnt=new int[26];
            int[] sCnt=new int[26];
            for(int i=0;i<m;i++){
                pCnt[p.charAt(i)-'a']++;
                sCnt[s.charAt(i)-'a']++;
            }
            if(Arrays.equals(sCnt,pCnt)){
                ans.add(0);
            }
            for(int i=m;i<n;i++){
                sCnt[s.charAt(i-m)-'a']--;
                sCnt[s.charAt(i)-'a']++;
                if(Arrays.equals(sCnt,pCnt)){
                    ans.add((i-m+1));
                }
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution1 {
        public List<Integer> findAnagrams(String s, String p) {
            int n=s.length(),m=p.length();
            List<Integer> ans=new ArrayList<>();
            if(n<m) return ans;
            int[] pCnt=new int[26];
            int[] sCnt=new int[26];

            for(int i=0;i<m;i++){
                pCnt[p.charAt(i)-'a']++;
            }

            int l=0;
            for(int r=0;r<n;r++){
                int curR=s.charAt(r)-'a';
                sCnt[curR]++;
                while(sCnt[curR]>pCnt[curR]){
                    int curL=s.charAt(l)-'a';
                    sCnt[curL]--;
                    l++;
                }
                if(r-l+1==m)
                    ans.add(l);
            }

            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}