class Solution
{
    public boolean checkMatrix(int[][] Nums)
    {
        int i = 0;
        int j = 0;

       for(;i<Nums.length-1;)
       {          
        for(j=0;j<Nums[0].length-1;)
        {
            if(Nums[i][j] == Nums[i+1][j+1] ) 
            {
                                j++;
            }

            else return false;
        }

        i++;
    }        return true;

}
}

class ToeplitzMatrix
{
    public static void main (STRing A[])
    {

    }
}