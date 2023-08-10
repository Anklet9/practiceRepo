class Solution {
    public void sortColors(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;

        while (mid <= hi) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, lo++, mid++);
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    swap(nums, mid, hi--);
                    break;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}