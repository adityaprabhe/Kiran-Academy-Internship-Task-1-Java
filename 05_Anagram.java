// Program 5: Check whether word1 and word2 are Anagrams
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word1: ");
        String word1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.print("Enter word2: ");
        String word2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The words are Anagrams");
        } else {
            System.out.println("The words are Not Anagrams");
        }

        sc.close();
    }
}
