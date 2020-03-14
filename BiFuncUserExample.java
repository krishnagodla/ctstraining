package collections;
import java.util.function.*;
public class BiFuncUserExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String,String,Student> bi= (htno,name)->new Student(htno,name);
		Student s1 = bi.apply("1001", "Kishore");
		Student s2 = bi.apply("1002", "anil");
		System.out.println(s2);
		
		BiConsumer<String,String> c1 =(a,b)->System.out.println(a+b); 
		c1.accept("Hello", "Hai");		
		System.out.println("Another line added");

	}

}
