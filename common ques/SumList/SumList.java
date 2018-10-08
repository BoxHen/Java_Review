import java.util.*;

public class SumList{
  public static void main(String[] args){
    LinkedList<Integer> a = new LinkedList<>();
      a.add(7);
      a.add(1);
      a.add(6);
    LinkedList<Integer> b = new LinkedList<>();
      b.add(5);
      b.add(9);
      b.add(2);
    System.out.println("This is the sum of the two lists: "+addList(a, b));
  }
  /*--------------------------------------------------------------------------*/
  static LinkedList<Integer> addList(LinkedList<Integer> a, LinkedList<Integer> b){
    int carry = 0, num1, num2, sum;
    LinkedList<Integer> answer = new LinkedList<Integer>();
    int listSize = getLongerListSize(a, b);

    for(int i=0; i<listSize; i++){
      num1 = a.getFirst();
      num2 = b.getFirst();
      sum = num1 + num2 + carry;
      carry = 0; // reset the carry before we get a new carry value
      while(sum >= 10){ // implements a carry feature
        sum -= 10;
        carry += 1;
      }
      answer.add(sum); //  start creating new answer list
      a.remove(); b.remove(); // removes the numbers at the head of the list so we can use get first again.
    }
    return answer;
  }
  /*--------------------------------------------------------------------------*/
  static int getLength(LinkedList<Integer> a){
    return a.size();
  }
  /*--------------------------------------------------------------------------*/
  static int getLongerListSize(LinkedList<Integer> a, LinkedList<Integer> b){
    int size1 = getLength(a);
    int size2 = getLength(b);
    if(size1 < size2){
      return size2;
    }else
      return size1;
  }
}
