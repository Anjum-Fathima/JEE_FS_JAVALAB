package employee;

public class Employee {
	int empid;
	String name;
	double salary;
	String mgrname;
	String deptno;
	public Employee(int empid, String name, double salary, String mgrname, String deptno) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.mgrname = mgrname;
		this.deptno = deptno;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", mgrname=" + mgrname
				+ ", deptno=" + deptno + "]";
	}

	public double getsalary() {
		return salary;
	}
}
