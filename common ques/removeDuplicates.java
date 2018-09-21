//set path=%path%;C:\"Program Files"\Java\jdk-9.0.4\bin
//remove duplicates from unsorted linked list
import java.util.HashSet;

public class removeDuplicates{
  public static void main(String[] args){
    Node list = new Node(5);
    list.next = new Node(10);
    list.next.next = new Node(15);
    list.next.next.next = new Node(15);
    list.next.next.next.next = new Node(15);
    list.next.next.next.next.next = new Node(20);

    removeDuplicate(list);
    printList(list);
  }
  static class Node{
    int value;
    Node next;

    Node(int val){
      this.value = val;
      next = null;
    }
  }
  static void removeDuplicate(Node head){
    HashSet<Integer> map = new HashSet<>();
    Node prev = null;
    Node current = head; // for readability

    while(current != null){
      if(map.contains(current.value)){
        prev.next = current.next;
      }else{
        map.add(current.value);
        prev = current;
      }
      current = current.next;
    }
  }
  static void printList(Node head){
    Node current = head;
    while(current != null){
      System.out.print(current.value+"-");
      current = current.next;
    }
  }

}
