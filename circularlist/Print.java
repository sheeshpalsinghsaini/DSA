package circularlist;

public class Print {
    public static void print(Node head){
        if(head==null)
            return;

        Node temp = head;
        while(temp.next!=head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data+" ");
        System.out.println();
    }
}
