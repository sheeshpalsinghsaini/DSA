package compare;

public class Employee implements Comparable<Employee> {
	private String name;
	private String phone;
	private int empId;
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empId-o.empId;
	}
	public Employee(String name, String phone, int empId) {
		super();
		this.name = name;
		this.phone = phone;
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", empId=" + empId + "]";
	}
	
	
	
}
