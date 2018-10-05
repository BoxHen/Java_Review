import java.util.Scanner;

public class permutation_Palindrome{

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter your text: ");
    String input = scanner.nextLine(); // String input = "tact coaf";
    System.out.println("You entered: "+input);
    boolean result = isPermutPalindrome(input);
    //System.out.println(result);
    if(result) System.out.println("This is a palindrome permutation");
    else System.out.println("This is not a palindrome permutation");
  }

  public static boolean isPermutPalindrome(String str){
    // we know that it is a permutation of a palindrome if each letter has a even count (even num of letters)
    //OR if each letter has an even count except one letter (odd num of letters)
    int count = 0; // will keep track of number of odd letters
    int[] arr = new int[128]; // make an array for all chracters from 0-127 (128 total)
    for(int i=0; i<str.length(); i++){
      if(str.charAt(i) == ' ') continue; // ignore the spaces
      arr[str.charAt(i)]++;
      // if we encounter this letter, it will be converted to decimal according to ascii table and we will
      // increment the value
      // this is similar to a hash map where we store a key and value
      if(arr[str.charAt(i)] % 2 == 0 ){// this makes sense since if a letter count is even, the count will negate it self
        count--; // if num of letter is even
      }else{
        count++; // if num of letter is odd
      }
    }
    System.out.println(count);
    if(count<=1) return true;
    else return false;
  }
}
