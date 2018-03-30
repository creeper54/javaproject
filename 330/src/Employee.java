import javax.print.DocFlavor.STRING;

public class Employee {
	public String name;
	private int rrn;
	String address;
	protected int salary;

	public Employee(String name, int rrn, String address, int salary) {
		this.name = name;
		this.rrn = rrn;
		this.address = address;
		this.salary = salary;
	}

	// @override
	public String toString() {
		return "Employee [name=" + name + ",address=" + address + ",salary=" + salary + ",rrn=" + rrn + "]";
	}
}

class Manager extends Employee {

	private int bouse;

	public Manager(String name, int rrn, String address, int salary, int bouse) {
		super(name, rrn, address, salary);
		this.bouse = bouse;
	}

	void test() {
		System.out.println("name=" + name);
		System.out.println("address=" + address);
		System.out.println("salary=" + salary);
		// System.out.println("rrn"+rrn);
	}
}
