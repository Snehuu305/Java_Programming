class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char leftChar = chars[left];
            char rightChar = chars[right];

            if (Character.isLetter(leftChar) == false) {
                left = left + 1;
            }
            else if (Character.isLetter(rightChar) == false) {
                right = right - 1;
            }
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left = left + 1;
                right = right - 1;
            }
        }

        return new String(chars);
    }
}