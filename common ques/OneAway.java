import java.lang.*;

public class OneAway{
  public static void main(String[] args){
    String str1 = "pale";
    String str2 = "palbhe";
    int result = oneLetterAway(str1, str2);
    System.out.println(result);
    if(result > 1) System.out.println("nope");
    else System.out.println("yup");
  }

  public static int oneLetterAway(String str1, String str2){
    if(Math.abs(str1.length()-str2.length()) > 1 ) return 5;

    int letterDiff = 0;
    int[] arr = new int[128]; // all values are initialized to 0 by default
    for(int i=0; i<str1.length(); i++){
      arr[str1.charAt(i)]++; // add one at the ascii value of the letter
    }
    for(int i=0; i<str2.length(); i++){
      if(arr[str2.charAt(i)] != 0){ // checks if the letter exists
        arr[str2.charAt(i)]--;
      }else{
        arr[str2.charAt(i)]++; // if the letter does not exist
      }
    }
    for(int i=0; i<128; i++){
      if(arr[i] != 0){ letterDiff++;}
    }
    return letterDiff;
  }
}
