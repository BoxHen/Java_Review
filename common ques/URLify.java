
public class URLify{

  public static void main(String[] args){
    String input = "Mr John Smith      ";
    int length = 13;
    String answer = replaceSpace(input, length);
    System.out.println(answer);
  }
  /*---------------------------------Method--------------------------------------------*/
  public static String replaceSpace(String string, int length){
    if(string.isEmpty()) return "Empty string"; //edge case

    char[] str = string.toCharArray();
    int spaceCount = 0;
    for(int i=0; i<length; i++){ // count the number of spaces in str
      if(str[i] == ' ') spaceCount++;
    }

    int newLength = length + (2*spaceCount);
    // we need 2*spaceCount since "%20" needs 3 characters. one space will cover one of the three characters so two more are needed
    str[newLength] = '\0'; //set null terminator to this index to accomodate enough spaces for the "%20"
    for(int i=length-1; i>=0; i--){
      if(str[i] == ' '){
        str[newLength-1] = '0';
        str[newLength-2] = '2';
        str[newLength-3] = '%';
        newLength = newLength-3;
      }else{
        str[newLength-1] = str[i];
        newLength = newLength-1;
      }
    }
    return String.valueOf(str); // converts char[] to String
  }
}
