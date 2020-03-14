package collections;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
		int[] a= {10,20,30,40};
		ar.add("Java");
		ar.add("DotNet");
		ar.add("Selenium");
		ar.add(10);
		ar.add(null);
		ar.add(true);
		ar.add("Java");
		ar.forEach(System.out::println);
		ArrayList ar1 = new ArrayList();
		ar1.add("datascience");
		ar1.add("Python");
		ar1.add("BigData");
		
		ar.addAll(ar1);  // ar = ar+ar1
		
		System.out.println(ar);
		ar1.add("Ruby");
		if(ar.containsAll(ar1))
			System.out.println("Element found..");
		else
			System.out.println("Element not found..");
		ar.retainAll(ar1);
		System.out.println("After removal...");
		System.out.println(ar);
		
		

	}

}
