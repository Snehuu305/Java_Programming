class Solution {
    public String reverseByType(String s) {

        char[] str = s.toCharArray();
        int start = 0;
        int end = str.length - 1;

        while(start < end)
        {
            if(! Character.isLetter(str[start])){ start++; }
           else if(! Character.isLetter(str[end])){ end--; }
            
            else
            {
                reverseLetter(str, start, end);
                start++;
            end--;
            }
        }

        start = 0;
        end = str.length - 1;
        while(start < end)
        {
            if(Character.isLetter(str[start])){ start++; }
            else if(Character.isLetter(str[end])){ end--; }
            
            else
            {
                reverseLetter(str, start, end);
                start++;
            end--;
            }
        }
        
        return new String(str);
    }

    public void reverseLetter(char str[], int start, int end ){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
    }
}