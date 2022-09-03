package doubblylist;

public class Main {

    public static void main(String[] args) {
        int []nodes = {1,2,3,4,5,6,7,8,9};
        Node head = CreateList.createList(nodes);
        Print.printInc(head);
        // Print.printDsc(head);
        System.out.println("-----------------------");
        //-----------------------insertion
        // head = InsertionDLL.insertHead(head, 13);
        // head = InsertionDLL.insertTail(head, 34);
        // head = InsertionDLL.insertAfterGivenNode(head, 9, 23);
        // head = InsertionDLL.insertAtGivenPos(head, 45, 9);
        //-----------------------Deletion
        // head = DeletionList.deleteHead(head);
        // head = DeletionList.deleteTail(head);
        // head = DeletionList.deleteGivenNode(head, 9);
        // head = DeletionList.deleteGivenPosition(head, 9);
        Print.printInc(head);

    }
    
}
