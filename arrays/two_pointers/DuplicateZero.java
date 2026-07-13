class DuplicateZero
{
    public void duplicateZero(int[] arr)
    {
         int i = 0;
          int j = 0;
      int[] num = new int[arr.length];

          while(i < arr.length)
        {
            if(arr[j] !=0)
            {
               num[i] = arr[j];
               i++;
            }

            else
            {
                While((i + 1) < arr.length - 1)
                {
                num[i] = 0;
                num[i + 1] = 0;
                i += 2;
                }
            }
            j++;
        }  
      }
}