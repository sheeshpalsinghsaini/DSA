package prints;

import Node.NumberNode;
import Node.StudentNode;

public class PrintList {
	public static void printNumbers(NumberNode head) {
		if(head==null) return;
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	public static void printStudents(StudentNode head) {
		if(head==null) return;
		while(head!=null) {
			System.out.println(head.name);
			System.out.println(head.rollNo);
			System.out.println(head.address);
			System.out.println("--------------------");
			head = head.next;
		}
	}
}
