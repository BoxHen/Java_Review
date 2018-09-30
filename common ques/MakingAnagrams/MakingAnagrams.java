import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int count=0;

        int[] arr = new int[256];
        for(int i=0; i<a.length(); i++){
            arr[a.charAt(i)] += 1; // if the character exists, then add one at that ascii value
        }
        for(int i=0; i<b.length(); i++){
            arr[b.charAt(i)] -= 1; // if the character exists then minus one at that ascii value
        } // this results in a array where the values show how many characters to delete
        for(int i=0; i<arr.length; i++){
            count += Math.abs(arr[i]); // add up all values in the array
            // array value will be zero if the characters match up between strings
        }
        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
