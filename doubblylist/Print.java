package doubblylist;

public class Print {

    //print in increasing order.
    public static void printInc(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    //print in decreasing order.
    public static void printDsc(Node head){
        while(head.next!=null){
            head = head.next;
        }
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.prev;
        }
        System.out.println();

    }
    
}
