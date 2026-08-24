class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0; // position to place the next non-zero element
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[insertPos];
                nums[insertPos] = nums[i];
                nums[i] = temp;
                insertPos++;
            }
        }
    }
}