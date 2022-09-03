package circularlist;

public class Main {
    
    public static void main(String[] args) {
        int nodes[] = {1,2,3,4,5,6,7,8,9};

        Node head = Create.createList(nodes);
        Print.print(head);
        //----------------insertion
        // head = Insertion.insertHead(head, 16);
        // head = Insertion.insertTail(head, 14);
        // head = Insertion.insertGivenPosition(head, 23, 9);
        // head = Deletion.deleteHead(head);
        // head = Deletion.deleteTail(head);
        head = Deletion.deleteGivenNode(head, 9);
        Print.print(head);
       

    }
}
