package java8.lambda;

import java8.util.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Person p1= new Person("Pankaj","Jha",33);
		Person p2= new Person("Mukund","Jha",1);
		
		Predicate<Person> pred1= (p)->p.getAge()>20;
		Predicate<Person> pred2= (p)->p.getAge()>50;
		
		Predicate<Person> pred3= pred1.and(pred2);
		Predicate<Person> pred4= pred1.or(pred2);
		
		System.out.println("Pankaj age is greater then 20 ? " + pred1.test(p1));
		System.out.println("Pankaj age is greater then 20 and Mukund age is greater than 50 ?  " + pred3.test(p1));
		System.out.println("Pankaj age is greater then 20 or Mukund age is greater than 50 ?  " + pred4.test(p1));
		

	}

}
