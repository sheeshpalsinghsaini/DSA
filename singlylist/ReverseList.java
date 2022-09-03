package singlylist;

public class ReverseList {

    //Recursive way
    public static Node reverseListRecursively(Node head){
        if(head == null || head.next == null)
            return head;

        Node smallList = reverseListRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return smallList;
    }

    //iterative way
    public static Node reverseListIteratevely(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
}
