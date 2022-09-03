package singlylist;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hi, This is the basic of linkedList!!!");
        int []nodes = {1,2,3,4,5,6,7,8,9};
        Node head = CreateList.createList(nodes);
        Print.print(head);
        System.out.println("-------------------------------");
        //reverse list
        // head = ReverseList.reverseListRecursively(head);
        // head = ReverseList.reverseListIteratevely(head);
        //---------------------insertion 
        // head = Insertion.insertHead(head, 12);
        // head = Insertion.insertTail(head, 23);
        // head = Insertion.insertAfterGivenNode(head, 34, 10);
        // head = Insertion.insertAtPos(head, 43, 10);
        //---------------------deleteion
        // head = DeletionList.deleteHead(head);
        // head = DeletionList.deleteTail(head);
        head = DeletionList.deleteGivenNode(head, 9);
        // head = DeletionList.deleteAtGivenPos(head, 9);
        Print.print(head);

    }
}