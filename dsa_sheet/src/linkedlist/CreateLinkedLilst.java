package linkedlist;

import Node.NumberNode;
import Node.StudentNode;

public class CreateLinkedLilst {
	/**
	 * create list only for numeric values
	 * 
	 * @param arr
	 * @return
	 */
	public static NumberNode createNumberList(NumberNode[]arr) {
		NumberNode head=null,temp=null;
		
		for(int i=0;i<arr.length;i++) {
			if(temp==null)
				{
					temp=arr[i];
					head=temp;
				}
			
			else {
				temp.next = arr[i];
				temp = temp.next;
			}
		}
		return head;
	}
	
	public static StudentNode createStudentList(StudentNode[] arr) {
		StudentNode head=null,temp=null;
		for(int i=0;i<arr.length;i++) {
			if(head==null) {
				head = arr[i];
				temp = head;
			}else {
				temp.next = arr[i];
				temp = temp.next;
			}
		}
		return head;
	}
}
