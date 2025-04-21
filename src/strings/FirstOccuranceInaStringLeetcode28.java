package strings;

public class FirstOccuranceInaStringLeetcode28 {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0; // If needle is empty, return 0

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) { // Check first character
                if (haystack.substring(i, i + needle.length()).equals(needle)) { // Check substring
                    return i;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {

    }
}
