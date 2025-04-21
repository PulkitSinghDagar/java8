package strings;

public class RotateStringClockwiseandSeeHWtaCome {
    public boolean isRotated(String str1, String str2)
    {
        // Check if the lengths of the two strings are not
        // equal, return false if they are not.
        if (str1.length() != str2.length()) {
            return false;
        }

        // If the length of the strings is less than or
        // equal to 2, simply check if they are equal.
        if (str1.length() <= 2 || str2.length() <= 2) {
            return str1.equals(str2);
        }

        // Initialize strings to store the clockwise and
        // anti-clockwise rotations of str2.
        String clockRot = "";
        String anticlockRot = "";
        int len = str2.length();

        // Store the anti-clockwise rotation of str2 by
        // concatenating the last 2 characters to the
        // beginning.
        anticlockRot = str2.substring(len - 2)
                + str2.substring(0, len - 2);

        // Store the clockwise rotation of str2 by
        // concatenating the first 2 characters to the end.
        clockRot = str2.substring(2) + str2.substring(0, 2);

        // Check if either the clockwise or anti-clockwise
        // rotation of str2 is equal to str1, and return the
        // result.
        return str1.equals(clockRot)
                || str1.equals(anticlockRot);
    }

    public static void main(String[] args)
    {
        RotateStringClockwiseandSeeHWtaCome solution = new RotateStringClockwiseandSeeHWtaCome();

        String str1 = "amazon";
        String str2 = "azonam";
        System.out.println(
                solution.isRotated(str1, str2)); // Output: true

        str1 = "amazon";
        str2 = "onamaz";
        System.out.println(
                solution.isRotated(str1, str2)); // Output: true
    }
}
