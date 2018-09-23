public class partitionLinkedList{
  public static void main(String[] args){
    Node list = new Node(10);
    list.next = new Node(5);
    list.next.next = new Node(25);
    list.next.next.next = new Node(2);
    list.next.next.next.next = new Node(35);
    list.next.next.next.next.next = new Node(22);
    list.next.next.next.next.next.next = new Node(40);

    //partition(list, 35);
    printList(list);
    //printList(partitionList);
  }
  static class Node{
    int value;
    Node next;

    Node(int val){
      this.value = val;
      next = null;
    }
    Node(){
      this.value = 0;
      next = null;
    }
  }
  // static void partition(Node head, int partitionNum){
  //   Node partitionList = new Node();
  //
  //   Node current  = head; // rename for clarity
  //   while(current != null){
  //     if(current.value < partitionNum){
  //       partitionList.value = current.value;
  //       partitionList.next = new Node();
  //       partitionList = partitionList.next;
  //     }
  //     current = current.next;
  //   }
  //   current  = head; // rename for clarity
  //   while(current != null){
  //     if(current.value == partitionNum){
  //       partitionList.value = current.value;
  //       partitionList.next = new Node();
  //       partitionList = partitionList.next;
  //     }
  //     current = current.next;
  //   }
  //
  //   while(partitionList != null){
  //     System.out.print(partitionList.value+"-");
  //     partitionList = partitionList.next;
  //   }
  //
  //   current  = head; // rename for clarity
  //   while(current != null){
  //     if(current.value > partitionNum){
  //       partitionList.value = current.value;
  //       partitionList.next = new Node();
  //       partitionList = partitionList.next;
  //     }
  //     current = current.next;
  //   }
  //   System.out.println(partitionList.value);
  //   //printList(partitionList.value);
  //   //return partitionList;
  // }

  static void printList(Node head){
    Node current = head;
    while(current != null){
      System.out.print(current.value+"-");
      current = current.next;
    }
  }
}
/* TRY to concat linked list */
// public class partitionLinkedList{
//   public static void main(String[] args){
//
//   }
//   class Node{
//     int value;
//     Node next;
//
//     Node(int val){
//       this.value = val;
//       next = null;
//     }
//   }
//   static void parition(int partitionNum){
//     Node less; // will store values less than partitionNum
//     Node equal; // will store values equal than partitionNum
//     Node greater; // will store values greater than partitionNum
//
//     Node current  = head; // rename for clarity
//     while(current != null){
//       if(current.value > partitionNum){
//         greater.value = current.value;
//       }else if(current.value = partitionNum){
//         equal.value = current.value;
//       }else if(current.value < partitionNum){
//         less.value = current.value;
//       }
//       current = current.next;
//     }
//
//   }
// }
