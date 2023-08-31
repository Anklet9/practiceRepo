// USING CYCLIC SORT TIMECOMPLEXITY O(N) AND SPACE COMPLEXITY O(1)
class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i < nums.length){
            if(nums[i] < nums.length && nums[i]!=i){
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i]=temp;
            }else{
                i++;
            }
        }
        // System.out.println(Arrays.toString(nums));
        for(int j=0;j<nums.length;j++){
            if(j!=nums[j]){
                return j;
            }
        }
        return nums.length;
    }
}