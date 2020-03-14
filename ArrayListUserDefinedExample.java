package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Predicate;

class Student implements Comparable<Student>{
	String htno;
	String name;
	Student(String htno, String name){
		this.name=name;
		this.htno=htno;
	}
	@Override
	public String toString() {
		return "htno=" + htno + ", name=" + name ;
	}
	@Override
	public int compareTo(Student student){
		if(htno.compareTo(student.htno)<0)
			return -1;
		else if(htno.compareTo(student.htno)>0)
			return 1;
		else
			return 0;
	}
}
class Employee implements Comparable<Employee>{
	String eid;
	String name;
	public Employee(String eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "eid=" + eid + ", name=" + name;
	}
	
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		if(name.compareTo(emp.name)<0)
			return 1;
		else if(name.compareTo(emp.name)>0)
			return -1;
		else
			return 0;
	}
	
}
public class ArrayListUserDefinedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("123","Praveen");
		Student s2 = new Student("345","KUmar");
		Student s3 = new Student("456","Anil");
		Student s4 = new Student("786","balu");
		//ArrayList<Student> ar = new ArrayList<Student>();
		LinkedList ar = new LinkedList();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		System.out.println(ar);
		Collections.sort(ar);
		ar.forEach(System.out::println);
		Collections.reverse(ar);
		System.out.println("After Reverse");
		ar.forEach(System.out::println);
			

	}

}
