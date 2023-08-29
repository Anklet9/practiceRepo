import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        int res=0;
        for(int i=1;i<=nums.length;i++){
            if(!Arrays.asList(nums).contains(i)){
                res=i;
            }
        }
        return res;
    }
}