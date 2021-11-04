package syntax.class11;

public class Human {

	String name;
	int age;
	double height;
	double weight;
	char gender;
	String bloodtype;
	
	
	void eat() {
		System.out.println(name+" eats a lot ");
	}
	
	void sleep() {
		System.out.println(name+" is sleeping");
	}
	
	void sendmemes() {
		if(name.equals("sebs")) {
			System.out.println("sending memes");
		}
	}
}
