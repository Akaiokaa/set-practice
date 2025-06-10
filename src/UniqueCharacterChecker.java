import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * The UniqueCharacterChecker class provides a method to check if all characters
 * in a given word are unique.
 */
public class UniqueCharacterChecker {

    /**
     * Checks if a given word has all unique characters.
     *
     * @param word the string to be checked for unique characters
     * @return true if all characters in the word are unique; false otherwise
     */
    public static boolean hasUniqueCharacters(String word) {
        // TODO: implement this!
        // Requirement: This must run in O(n) time, where n is the number of characters in the word
        // Hint: Stuck? Consider looking up "charAt" and seeing how it can help you

        /*
        hashset only unqiue values
        try making a counter to see if it as been seen
         loop through the word get its .length()

         go through each of the letters and check to see if it has appeared more than once

         return true or false whether there are duplicate characters
         */
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            if (seen.contains(word.charAt(i))) {
                return false;
            }
            seen.add(word.charAt(i));
        }
        

        return true;
    }

    public static void main(String[] args) {
        String word1 = "hello";
        String word2 = "world";
        String word3 = "abcdefg";

        System.out.println(word1 + " has unique characters: " + hasUniqueCharacters(word1));
        System.out.println(word2 + " has unique characters: " + hasUniqueCharacters(word2));
        System.out.println(word3 + " has unique characters: " + hasUniqueCharacters(word3));
    }
}
