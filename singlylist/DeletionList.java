package singlylist;

public class DeletionList {
    //delete at the head
    public static Node deleteHead(Node head){
        Node temp = head;
        head = head.next;
        temp.next = null;
        return head;
    }

    //delete at the end
    public static Node deleteTail(Node head){
        if(head.next==null || head==null){
            return null;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    //delete a given node
    public static Node deleteGivenNode(Node head,int node){
        Node temp = head;
        Node follow = temp;
        if(temp.data==node){
            head = head.next;
            temp.next = null;
        }else{temp = temp.next;
            while(temp.next!=null){
                follow = follow.next;
                if(temp.data==node){
                    temp.data = temp.next.data;
                    temp.next = temp.next.next;
                    return head;
                }
                temp = temp.next;
            }
            if(temp.next==null && temp.data==node){
                follow.next = null;
                return head;
            }
        }
        System.out.println("Given node is not present in list!!!");
        return head;
        
    }



    //delete at given position
    public static Node deleteAtGivenPos(Node head,int pos){
        Node temp = head;
        if(pos==1){
            head = head.next;
            temp.next = null;
            return head;
        }else{
            for(int i=1;i<pos-1&&temp!=null;i++){
                temp = temp.next;
            }
            if(temp==null){
                System.out.println("you are out of range, we can't delete it");
                return null;
            }else{
                temp.next = temp.next.next;
            }
        }
        return head;
    }

}
