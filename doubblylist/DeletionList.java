package doubblylist;

public class DeletionList {
    //delete at the head.
    public static Node deleteHead(Node head){
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        return head;
    }
    //delete at the tail.
    public static Node deleteTail(Node head){
        if(head.next==null || head==null){
            return null;
        }
        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }
        temp.prev.next=null;
        temp.prev = null;
        return head;
    }
    //delete given node.
    public static Node deleteGivenNode(Node head,int data){
        if(head.data==data && head.next ==null){
            return null;
        }
        if(head.data==data){
            head = head.next;
            head.prev.next = null;
            head.prev = null;
            return head;
        }
        Node temp = head;

        while(temp!=null){
            if(temp.data == data){
                if(temp.next==null){
                    temp.prev.next = null;
                    temp.prev = null;
                    return head;
                }else{
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    temp.next = null;
                    temp.prev = null;

                    // System.out.println(temp.next);
                    // System.out.println(temp.prev);
                    // System.out.println(temp.data);
                    // System.out.println(temp.prev.data);
                    // System.out.println(temp.next.data);
                    
                    return head;
                }
            }
            temp = temp.next;
        }
        System.out.println("Node doesn't exist in list");
        return head;
    }
    //delete at given position.
    public static Node deleteGivenPosition(Node head,int pos){
        
        if(pos==1 && head.next==null)
            return null;
        if(pos==1){
            head=head.next;
            head.prev.next=null;
            head.prev = null;
            return head;
        }

        Node temp = head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        //if node would be last node then
        if(temp.next.next==null){
            temp.next.prev = null;
            temp.next = null;
            return head;
        }
        temp.next.next.prev = temp;
        temp.next = temp.next.next;
        return head;
    }
}
