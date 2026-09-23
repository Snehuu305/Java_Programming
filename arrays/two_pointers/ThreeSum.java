class Solutions
{
    public List<List<Integer>> threeSum(int nums[])
    {
        Arrays.sort(nums);
        int i = 0;
         int j = i + 1;
            int k = j + 1;
              List<List<Integer>> result = new ArrayList<>();

            while(i < (nums.lenght - 3))
            {
                while(j < (nums.length-2))
                    {
               if(nums[i] == nums[j]) j++; 
                  
            while( k < (nums.length-1))
                {
               if(nums[j] == nums[k]) k++;
               if(nums[k] == nums[i]) k++;
               if(nums[i]+nums[j]+nums[k] == 0)
               {
                {
                      result.add(nums[i]);
                      result.add(nums[j]);
                      result.add(nums[k]);
                }
                 k++;
               }
            }
          }   i++; j++; k++;
        }  return result;
    }
}


class ThreeSum
{
    public static void main(String A[])
    {

    }
}