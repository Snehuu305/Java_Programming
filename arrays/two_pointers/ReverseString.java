class Solution
{
    public void reverseString(char[] S)
    {
         int left = 0;
         int right = S.lenght-1;

         while(left < right)
         {
            char temp = S[left];
            S[left] = S[right];
            S[right] = temp; 
            left++;
            right--;
         }
    }
}

class ReverseString
{
    public static void main(String A[])
    {

    }
}