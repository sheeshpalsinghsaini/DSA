package circularlist;

public class Deletion {
    //delete  head
    public static Node deleteHead(Node head){
        if(head==null || head.next==head)
            return null;

        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
    //delete tail 
    public static Node deleteTail(Node head){
        Node temp = head;

        while(temp.next.next!=head){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    //delete a given node
    public static Node deleteGivenNode(Node head,int node){
        Node temp = head;

        if(temp.data == node){
            head.data = head.next.data;
            head.next = head.next.next;
            return head;
        }
        temp = temp.next;
        while(temp!=head){
            if(temp.data == node){
                if(temp.next==head){
                    temp.data = head.data;
                    temp.next = temp.next.next;
                    return temp;
                }else{
                    temp.data = temp.next.data;
                    temp.next = temp.next.next;
                    return head;
                }
            }

            temp = temp.next;
        }
        
        System.out.println("Given node doesn't exist!!!");
        return head;
    }

}
