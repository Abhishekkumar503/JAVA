package collection.Comparable;

import java.util.ArrayList;
import java.util.List;

import CommonClass.Student;



public class Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> student = new ArrayList<>();
		student.add(new Student ("Abhishek",7.8));
		student.add(new Student ("Udai",7.7));
		student.add(new Student ("Nitin",8.8));
		student.add(new Student ("Ram",6.8));
		student.add(new Student ("Anurag",6.2));
		
//		student.sort();
		
		System.out.println(student);
	}

}
