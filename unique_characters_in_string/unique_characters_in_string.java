import java.util.HashMap;
import java.util.Map;

public class unique_characters_in_string{
     public static void main(String []args){
        int result = isUnique("hello");

        if(result == 1){System.out.println("all characters unique");}
        else if(result == 0){System.out.println("not all characters are unique");}
        else{System.out.println("string is empty");}
     }
/*----------------------------------Methods--------------------------------------------*/
     public static int isUnique(String string){
        if(string.isEmpty() ){ return 3;} // edge case

        char[] character = string.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0; i<character.length; i++){
            if (map.containsKey(character[i]) )  { // checks if map contains the key already
                return 0;
            }else{
                map.put(character[i], 1);
            }
        }

        System.out.println(map);
        return 1;
     }
}
