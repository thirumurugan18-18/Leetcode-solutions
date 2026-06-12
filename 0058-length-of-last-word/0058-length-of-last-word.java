class Solution {
    public int lengthOfLastWord(String s) {
        String trimmedS = s.trim();

        int lastSpaceIndex = trimmedS.lastIndexOf(" ") + 1;

        if( lastSpaceIndex == 1 ) return s.length();

        return trimmedS.length() - lastSpaceIndex;
    }
}