package day10_collection;

public class Employee<P,T> {
	private P name;
	private T number;
	
	public Employee() {
		super();
	}

	public Employee(P name, T number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public P getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	
	public T getNumber() {
		return number;
	}
	public void setNumber() {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	
	
	
}
