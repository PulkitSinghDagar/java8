package strings;

import java.util.Arrays;

public class MinimumDistanceBetweenWords {

    // Method to find the minimum distance between two words
    public static int findMinDistance(String[] words, String word1, String word2) {
        int minDistance = Integer.MAX_VALUE; // Initialize the minimum distance as max possible value
        int index1 = -1; // Store the index of the first word
        int index2 = -1; // Store the index of the second word

        // Loop through the array of words
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                index1 = i; // Store index of word1
            } else if (words[i].equals(word2)) {
                index2 = i; // Store index of word2
            }

            // If both indices are valid, calculate the distance
            if (index1 != -1 && index2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(index1 - index2));
            }
        }

        // Simplified return statement
        if (minDistance == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minDistance;
        }
    }

    public static void main(String[] args) {
        // Example usage
        String[] words = { "the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog" };
        String word1 = "quick";
        String word2 = "dog";

        int result = findMinDistance(words, word1, word2);

        if (result != -1) {
            System.out.println("Minimum distance between '" + word1 + "' and '" + word2 + "' is: " + result);
        } else {
            System.out.println("One or both words are not present in the array.");
        }
    }
}
