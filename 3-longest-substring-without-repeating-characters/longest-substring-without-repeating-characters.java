class Solution {
    public int lengthOfLongestSubstring(String s) {
     int left = 0, right = 0, Maxlength = 0;
    int num[] = new int[256];

    while (right < s.length()) {
        char currentchar = s.charAt(right);
        num[currentchar]++; // Increment frequency of current char

        // If currentchar count > 1, we have a duplicate. 
        // Shrink the window from the left until the duplicate is gone.
        while (num[currentchar] > 1) {
            char leftchar = s.charAt(left);
            num[leftchar]--; // CORRECTED: Decrement the count of the char leaving the window
            left++;
        }

        // Update Maxlength
        int currentWindowSize = right - left + 1;
        if (currentWindowSize > Maxlength) {
            Maxlength = currentWindowSize;
        }
        
        right++;
    }

    return Maxlength;
    }
}