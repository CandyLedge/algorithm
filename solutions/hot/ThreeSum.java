package hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 15. 三数之和
 * 
 * @author 晓苏理
 * @date 2025-07-24 19:10:39
 * @link https://leetcode.cn/problems/3sum
 */
public class ThreeSum {

    /**
     * DONE: 实现解法
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //哈希表法
        public List<List<Integer>> threeSum(int[] nums) {
            if(nums.length<3)
                return new ArrayList<>();
            List<List<Integer>> ans=new ArrayList<>();
            Arrays.sort(nums);

            for(int i=0;i<nums.length;i++){
                if(i>0 && nums[i]==nums[i-1]) continue;
                int target=-nums[i];
                HashSet<Integer> set=new HashSet<>();

                for(int j=i+1;j<nums.length;){

                    if(set.contains(target-nums[j])){
                        ArrayList<Integer> tmp=new ArrayList<>();
                            tmp.add(nums[i]);
                            tmp.add(nums[j]);
                            tmp.add(target-nums[j]);
                            ans.add(tmp);
                            j++;
                            while(j<nums.length && nums[j]==nums[j-1]){
                                j++;
                            }
                    }
                    else {
                        set.add(nums[j++]);
                    }
                }
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution1 {
        //双指针法
        public List<List<Integer>> threeSum(int[] nums) {
            if (nums.length < 3)
                return new ArrayList<>();
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(nums);
            int i,j,k;

            for(i=j=k=0;i<nums.length;i++){
                if(i>0 && nums[i]==nums[i-1])   continue;
                int target=-nums[i];
                j=i+1;
                k=nums.length-1;

                while(j<k){
                    while(j<k && nums[j]+nums[k]<target){
                        j++;
                    }
                    while(j<k && nums[j]+nums[k]>target){
                        k--;
                    }

                    if(j<k && nums[j]+nums[k]==target){
                        ArrayList<Integer> tmp=new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        ans.add(tmp);
                        j++;
                        k--;

                        while(j<k && j<nums.length && nums[j]==nums[j-1]){
                            j++;
                        }
                        while(j<k && k>i+1 && nums[k]==nums[k+1]){
                            k--;
                        }
                    }
                }
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}