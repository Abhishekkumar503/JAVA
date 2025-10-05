package collection.map;

import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEqualsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Person, String> map = new HashMap<Person, String>();
		
		map.put(new Person(1,"Abhishek"), "Engineer");
		map.put(new Person(1,"Abhishek"), "Manager");
		map.put(new Person(2,"Sandesh"), "Scientist");
		
		System.out.println("HashMap Size : " + map.size());
		System.out.println("Value of p1 : " + map.get(new Person(1,"Abhishek")));
		System.out.println("Value of p3 : " + map.get(new Person(2,"Sandesh")));
		
		
	}

}

class Person
{
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}