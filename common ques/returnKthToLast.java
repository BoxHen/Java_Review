//Done with a look ahead pointer and another with finding the length of list
public class returnKthToLast{
  public static void main(String[] args){
        Node list = new Node(5);
        list.next = new Node(10);
        list.next.next = new Node(15);
        list.next.next.next = new Node(16);
        list.next.next.next.next = new Node(17);
        list.next.next.next.next.next = new Node(20);

        returnFromEnd(list, 5);
  }
  static class Node{
    int value;
    Node next;

    Node(int val){
      this.value = val;
      next = null;
    }
  }
  static void returnFromEnd(Node head, int k){
    Node first = head;
    Node second = head;

    for(int i=0; i<k; i++){ // sets the second pointer to be k values ahead
      second = second.next;
    }

    while(second != null){
      first = first.next;
      second = second.next;
    }
    System.out.println(first.value);
  }
}
// public class returnKthToLast{
//   public static void main(String[] args){
//     Node list = new Node(5);
//     list.next = new Node(10);
//     list.next.next = new Node(15);
//     list.next.next.next = new Node(16);
//     list.next.next.next.next = new Node(17);
//     list.next.next.next.next.next = new Node(20);
//
//     valueFromEnd(list, 4);
//   }
//   static class Node{
//     int value;
//     Node next;
//
//     Node(int val){
//       this.value = val;
//       next = null;
//     }
//   }
//   static void valueFromEnd(Node head, int k){
//     Node current = head;
//     int newCount = 0, count = 0;
//
//     while(current != null){ // gets the length of the singly linked list
//       current = current.next;
//       count++;
//     }
//     count = count - k - 1;
//     current = head; //reset
//     while(newCount<=count){
//       newCount++;
//       current = current.next;
//     }
//     System.out.println(current.value);
//   }
//
// }
