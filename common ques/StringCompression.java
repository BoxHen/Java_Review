
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.io.*;
import java.util.*;

public class StringCompression{
  public static void main(String[] args){
    String input = "aabbbcccccaaa";
    String result = compression(input);
    int rlength = result.length();
    int ilength = input.length();

    if(rlength > ilength) System.out.println(input); // if original string is shorter, print that
    else System.out.println(result);
  }
  public static String compression(String str){
    String compressedString = "";
    int count = 1; // initialize to 1 since there must be at least one of that letter always
    char prevChar = str.charAt(0);

    for(int i=1; i<str.length(); i++){
      if(str.charAt(i) == prevChar){
        prevChar = str.charAt(i); // the prev will now be the current in next loop
        ++count;
      }else{
        compressedString = compressedString+prevChar+count;
        prevChar = str.charAt(i); // the prev will now be the current in next loop
        count = 1;
      }
    }
    compressedString = compressedString+prevChar+count; // used to get last set of letters
    return compressedString;
  }
}
