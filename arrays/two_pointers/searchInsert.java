//leetcode 35. Search Insert Position
class Solutions
{
    public int searchInsert(int nums[], int target)
    {
        int i = 0;

        while(i < nums.length)
        {
            if(target < nums[i] && target > nums[i-1]) break;
            else if(target == nums[i]) break;
            else i++;
                
        }
        return i;
    }
}


class searchInsert
{
    public static void main(String A[])
    {

    }
}