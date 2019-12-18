package springsample;

public class Person {
String firstName;
int age;
	
	public Person() {
	
	}
	
	public Person(int personAge,String personName) {
		this.age=personAge;
		this.firstName=personName;
	}
	
	public void showMessage() {
		System.out.println("I am a person , My name is "+this.firstName+" And I am "+this.age+" years old...");
	}
}
