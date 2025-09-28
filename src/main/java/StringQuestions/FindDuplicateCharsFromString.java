package StringQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateCharsFromString {

    /**
     * Finds and returns all duplicate characters present in the input string.
     * This method utilizes a Set to efficiently track seen characters and identify duplicates.
     * Non-alphanumeric characters and spaces are ignored, and the check is case-insensitive.
     *
     * @param input The string to analyze for duplicate characters.
     * @return An ArrayList containing the unique duplicate characters found.
     */
    public static List<Character> findDuplicateChars(String input) {
        // Handle edge cases
        if (input == null || input.isEmpty()) {
            return new ArrayList<>();
        }

        // Set to store characters encountered for the first time
        Set<Character> seenChars = new HashSet<>();

        // Set to store characters that have been identified as duplicates
        Set<Character> duplicateChars = new HashSet<>();

        // Convert the string to lowercase to ensure case-insensitive checking (e.g., 'A' and 'a' are the same)
        String lowerInput = input.toLowerCase();

        // Iterate through each character of the string
        for (char ch : lowerInput.toCharArray()) {

            // Optional: Skip spaces and non-letter/digit characters
            if (!Character.isLetterOrDigit(ch)) {
                continue;
            }

            // The Set.add() method returns TRUE if the element was successfully added (it was NOT present previously).
            // It returns FALSE if the element was already present in the Set (it IS a duplicate).
            if (!seenChars.add(ch)) {
                // If the character was ALREADY present (add() returned false), it's a duplicate.
                // Add it to the duplicateChars set. A Set is used here to ensure the final
                // list of duplicates only contains each character once, even if it appears 3+ times.
                duplicateChars.add(ch);
            }
        }

        // Convert the final Set of unique duplicates into the requested ArrayList
        return new ArrayList<>(duplicateChars);
    }

    public static void main(String[] args) {
        String testString1 = "Programming in Java";
        String testString2 = "Selenium WebDriver";
        String testString3 = "aBbcc";

        // Test Case 1
        List<Character> duplicates1 = findDuplicateChars(testString1);
        System.out.println("String: \"" + testString1 + "\"");
        // Expected Duplicates (Case-Insensitive, ignoring space): r, g, a, m, i, n
        System.out.println("Duplicates: " + duplicates1);
        System.out.println("------------------------------------");

        // Test Case 2
        List<Character> duplicates2 = findDuplicateChars(testString2);
        System.out.println("String: \"" + testString2 + "\"");
        // Expected Duplicates (Case-Insensitive): e, d, r
        System.out.println("Duplicates: " + duplicates2);
        System.out.println("------------------------------------");
        
        // Test Case 3 (Demonstrating case-insensitivity)
        List<Character> duplicates3 = findDuplicateChars(testString3);
        System.out.println("String: \"" + testString3 + "\"");
        // Expected Duplicates (a and A count as a single duplicate): b, c
        System.out.println("Duplicates: " + duplicates3);
    }
}

//u can make use of two pointer as well - but here the complexity will be o(n2)
//u can make use of HashMap(String, Character> and find the frequency of the character and return the character arraylist who has frequency greater than 1
// make sure u are returning the unique duplicate characters -- so instead of arrayList u can make use of set to store the duplicate chars


