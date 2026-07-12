class Solution
{
    public String reverseStr(String s, int k) 
    {
        char[] cArr = s.toCharArray();

        for(int i = 0; i < cArr.length; i += 2 * k)
        {
            int start = i;
            int end = Math.min(i + k - 1, cArr.length - 1);
            reverse(cArr, start, end);
        }

        return new String(cArr);
    }

    private void reverse(char[] cArr, int start, int end)
    {
        while(start < end)
        {
            char temp = cArr[start];
            cArr[start] = cArr[end];
            cArr[end] = temp;
            start++;
            end--;
        }
    } 
}