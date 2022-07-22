package Node;

public class StudentNode {
	public String name;
	public int rollNo;
	public String address;
	public StudentNode next;
	
	public StudentNode(String name,int rollNo,String address) {
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
	}
}
