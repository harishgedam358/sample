package sample;

import java.util.Objects;

public class Employee {

	private Integer sid;
	private String Sname;
	private Integer salary;
	
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getSalary() {
		return salary;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer sid, String sname, Integer salary) {
		super();
		this.sid = sid;
		this.Sname = sname;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Sname, salary, sid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Sname, other.Sname) && Objects.equals(salary, other.salary)
				&& Objects.equals(sid, other.sid);
	}
	
	
}
