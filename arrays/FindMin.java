class Solution
{
    public int minNum(int nums[]){
    int low = 0;
int high = nums.length - 1;

while(low < high)
{
    int mid = low + (high - low) / 2;

    if(nums[mid] > nums[high])
    {
        // minimum is in the right half, excluding mid
        low = mid + 1;
    }
    else
    {
        high = mid;
    }
   }
   return nums[low];
 }
}
