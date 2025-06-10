import java.util.HashSet;
import java.util.Set;

/**
 * The CommonElementsFinder class provides a method for finding common elements
 * between two arrays of integers.
 */
public class CommonElementsFinder {

    /**
     * Finds the common elements between two arrays of integers.
     *
     * @param array1 the first array of integers
     * @param array2 the second array of integers
     * @return a Set<Integer> containing the integers that are present in both arrays
     */
    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        // TODO
        Set<Integer> hash1 = new HashSet<>();
        for (Integer integer : array1) {
            hash1.add(integer);
        }
        Set<Integer> hash2 = new HashSet<>();
        for (Integer integer : array2) {
            hash2.add(integer);
        }
        Set<Integer> commonHash = new HashSet<>();
        for (Integer integer : hash2) {
            if (hash1.contains(integer)) {
                commonHash.add(integer);
            }
        }
        return commonHash;
    }


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        Set<Integer> common = findCommonElements(array1, array2);
        System.out.println("Common elements: " + common);
    }
}
