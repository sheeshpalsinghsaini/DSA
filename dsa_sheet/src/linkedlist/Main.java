package linkedlist;

import java.util.Scanner;

import Node.NumberNode;
import Node.StudentNode;
import prints.PrintList;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter size of list");
//		int size = scan.nextInt();
//		NumberNode []array = new NumberNode[size];
//		System.out.println("Enter Number of elements");
//		for(int i=0;i<array.length;i++) {
//			array[i] = new NumberNode(scan.nextInt());
//		}
//		NumberNode head = CreateLinkedLilst.createNumberList(array);
//		PrintList.printNumbers(head);
		
		
		System.out.println("Enter size of list");
		int size = scan.nextInt();
		StudentNode[] list = new StudentNode[size];
		for(int i=0;i<list.length;i++) {
			System.out.println("Enter "+(i+1)+" student details");
			String name = scan.next();
			int rollNo = scan.nextInt();
			String address = scan.next();
			list[i] = new StudentNode(name,rollNo,address);
		}
		StudentNode head = CreateLinkedLilst.createStudentList(list);
		PrintList.printStudents(head);
		
		
		scan.close();
	}
}
