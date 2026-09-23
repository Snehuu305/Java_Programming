class Solution
{
     public boolean isPalindrome(String S)
     {
          String str = S.replaceAll("[^a-zA-Z0-9]","").toLowerCase();       // it will replace all non alphabet or non numeric will convert in to ""
          char[] cArr = str.toCharArray();
          int left = 0;
          int right = cArr.length - 1;
          boolean flag = true;

          while(left < right)
          {
              if(cArr[left] != cArr[right])
                { 
                    flag = false;
              break;
          }
          left++;
          right--;
        }
        return flag;
     }
}

class IsPalindrome
{
    public static void main(String A[])
    {

    }
}