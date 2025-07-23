package hot;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution1 {
        public int longestConsecutive(int[] nums) {
            Map<Integer,Integer> m=new HashMap<>();
            int ans=0;
            for(int num:nums){
                if(!m.containsKey(num)){
                    int left=m.getOrDefault(num-1,0);
                    int right=m.getOrDefault(num+1,0);
                    int curLen=left+right+1;
                    ans=Math.max(ans,curLen);
                    m.put(num,-1);
                    m.put(num-left,curLen);
                    m.put(num+right,curLen);
                }
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    //leetcode submit region begin(Prohibit modification and deletion)
    class UnionFind{
        private Map<Integer,Integer> parent;
        private Map<Integer,Integer> count;
        public UnionFind(int[] nums){
            parent=new HashMap<>();
            count=new HashMap<>();
            for(int num:nums){
                parent.put(num,num);
                count.put(num,1);
            }
        }

        public Integer find(int x){
            if(!parent.containsKey(x))
                return null;
            while (x!=parent.get(x)){
                parent.put(x,parent.get(parent.get(x)));
                x=parent.get(x);
            }
            return x;
        }

        public int union(int x,int y){
            int rootX=find(x);
            int rootY=find(y);
            if(rootX==rootY)
                return count.get(rootX);

            parent.put(rootX,rootY);
            count.put(rootY,count.get(rootX)+count.get(rootY));
            return count.get(rootY);
        }

    }
    class Solution2 {
        public int longestConsecutive(int[] nums) {
            if(nums==null||nums.length==0)
                return 0;
            UnionFind uf=new UnionFind(nums);

            int ans=1;
            for(int num:nums){
                if(uf.find(num+1)!=null)
                    ans=Math.max(ans, uf.union(num,num+1));
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}