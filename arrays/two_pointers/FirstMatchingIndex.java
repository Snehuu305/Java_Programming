class Solution {
    public int firstMatchingIndex(String s) {
        
        int i = 0;
        int k = s.length()-i-1;

        while(i <= k)
        {
            k = (s.length()-i-1);
           if(s.charAt(i)==s.charAt(k)) 
           {
             return i;
           }
           i++;
        }

        return -1;
    }
}