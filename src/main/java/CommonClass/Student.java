package CommonClass;

import java.util.Objects;

public class Student {

	private String name;
	private double cgpa;
	@Override
	public int hashCode() {
		return Objects.hash(cgpa, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(cgpa) == Double.doubleToLongBits(other.cgpa) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", cgpa=" + cgpa + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public Student(String name, double cgpa) {
		super();
		this.name = name;
		this.cgpa = cgpa;
	}
	
	
	
}
