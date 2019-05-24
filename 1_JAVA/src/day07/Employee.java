package day07;

class Employee extends Person {
	private String dep;
	public Employee() {
		super();
	}
	public Employee(String name, int age, String dep) {
		super(name, age);
		this.dep = dep;
	}
	
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getSubject() {
		return dep;
	}
	public void print() {
		super.print();
		System.out.printf("이름 : %s, 나이 : %d , 학번 : %s\n", 
				super.getName(), super.getAge(), dep);
	}
}