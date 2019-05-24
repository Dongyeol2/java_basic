package day09;

public class Employee extends Object {
	String name;
	String dep;
	
	public Employee() {
		super();
	}
	public Employee(String name, String dep) {
		super();
		this.name = name;
		this.dep = dep;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getDep() {
		return dep;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dep=" + dep + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if(obj != null && obj instanceof Employee) {
			Employee temp = (Employee)obj;
			if(name.equals(temp.name) && dep.equals(temp.dep)) {
				flag = true;
			}
		}
		return flag;
	}
	
	
}
