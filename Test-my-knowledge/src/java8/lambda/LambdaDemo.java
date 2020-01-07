package java8.lambda;

import java.util.function.Consumer;
import java.util.function.Function;

import java8.util.Comparator;

public class LambdaDemo {

	public static void main(String ar[]){
		
		Person p1= new Person("Pankaj","Jha",33);
		Person p2= new Person("Mukund","Jha",28);
//		Person p3= new Person("Kushal","Verma",31);
//		Person p4= new Person("Dhruval","Patel",33);
//		Person p5= new Person("Ankit","Jha",04);
		
//		Comparator<Person> cmpAge = (person1,person2)->person1.getAge()-person2.getAge();
//		Comparator<Person> cmpFirstName = (person1,person2)->person1.getFirstName().compareTo(person2.getFirstName());
//		Comparator<Person> cmpLastName = (person1,person2)->person1.getLastName().compareTo(person2.getLastName());
	
//		Function<Person ,Integer> f1= p->p.getAge();
//		Function<Person ,String> f2= p->p.getFirstName(); 
//		Function<Person ,String> f3= p->p.getLastName();
		
		
		Comparator<Person> cmpPersonAge= Comparator.comparing(Person::getAge);
//		Comparator<Person> cmpPersonFirst= Comparator.comparing(Person::getFirstName);
//		Comparator<Person> cmpPersonLast= Comparator.comparing(Person::getLastName);
		
		Comparator<Person> comparing= cmpPersonAge.thenComparing(Person::getFirstName).thenComparing(Person::getLastName);
		
		
	}
}

class Person{
	private int age;
	private String firstName;
	private String lastName;
	Person(String firstName,String lastName,int age){
		this.age=age;
		this.firstName= firstName;
		this.lastName=lastName;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}