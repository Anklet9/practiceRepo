import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        ArrayList<Integer> missingNumbers = new ArrayList<>();

        for (int num : nums) {
            uniqueNumbers.add(num);
        }
        System.out.println(uniqueNumbers);
        
        for (int i = 1; i <= nums.length; i++) {
            if (!uniqueNumbers.contains(i)) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }
}
// USING CYCLIC SORT TIME COMPLEXITY O(N)
// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         int i = 0;
//         List<Integer> l = new ArrayList<>();
//         while(i < nums.length){
//             if(nums[i]!=nums[nums[i]-1]){
//                 int temp = nums[nums[i]-1];
//                 nums[nums[i]-1] = nums[i];
//                 nums[i]=temp;
//             }else{
//                 i++;
//             }
//         }
        
//         for(int j=0;j<nums.length;j++){
//             if(j+1 != nums[j]){
//                 l.add(j+1);
//             }
//         }
//         return l; 
//     }
// }
