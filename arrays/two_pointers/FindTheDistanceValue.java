class Solution {
        boolean f(int k,int[]arr,int d)
    {
        for(int i=0; i<arr.length; i++)
        {
            int result = Math.abs(arr[i]-k);
            if(result <= d)
            {
                return false;
            }
        }
        return true;
    }

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int len = arr1.length;
        int count =0;
        for(int i=0; i<len; i++)
        {
            boolean flag =f(arr1[i],arr2,d);
            if(flag==true)
            {
                count++;
            }
        }
        return count;        
    }
}