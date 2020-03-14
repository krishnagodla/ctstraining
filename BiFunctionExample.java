package collections;
import java.util.function.*;
public class BiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer,Integer,Integer> add = (a,b)-> (a+b);
		BiFunction<Integer,Integer,Integer> sub = (a,b)-> (a-b);
		BiFunction<Integer,Integer,Integer> prod = (a,b)-> (a*b);
		
		System.out.println("The sum is :"+add.apply(10,20));
		System.out.println("Ths difference is :"+sub.apply(10,4));
		System.out.println("The Product:"+ prod.apply(3,5));
	
	}

}
