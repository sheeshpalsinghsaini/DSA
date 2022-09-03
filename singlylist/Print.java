package singlylist;

public class Print {
    
    public static void print(Node head){
        if(head==null)
            return;

        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}
