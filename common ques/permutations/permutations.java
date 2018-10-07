import java.util.HashMap;
import java.util.Map;

public class permutations{//permutations

     public static void main(String []args){
         // Permutation: a way, especially one of several possible variations, in which a set or number of things can be ordered or arranged.
         int result = isPermutation("test", "retest");
         if(result == 4) System.out.println("strings are empty");
         if(result == 3 | result == 0) System.out.println("Not permutation");
         if(result == 1) System.out.println("They are permutations");
     }

    public static int isPermutation(String str1, String str2){
        char[] character1 = str1.toCharArray();
        char[] character2 = str2.toCharArray();
        if(str1.isEmpty() | str2.isEmpty() ) return 4; //edge case
        if(str1.length() != str2.length() ) return 3; //edge case

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i<character1.length; i++){
            map1.put(character1[i], 1);
        }
        for(int i=0; i<character2.length; i++){
            if( map1.containsKey(character2[i]) ){
                map1.remove(character2[i]);
            }
        }
        if(map1.isEmpty() ){
            return 1;
        }else{
            return 0;
        }
    }
}
