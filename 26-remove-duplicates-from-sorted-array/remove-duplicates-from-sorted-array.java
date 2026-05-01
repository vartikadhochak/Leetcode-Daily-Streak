import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int k=0;
        for(int val:set){
            nums[k++]=val;
        }
        return k;
        
    }
}