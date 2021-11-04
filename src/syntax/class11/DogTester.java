package syntax.class11;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog luissDog= new Dog(); // creating an object of dog class
		luissDog.name= " Casper";
		luissDog.breed= " American Eskimo";
		luissDog.color= " White";
		luissDog.height=  5.5;
		luissDog.age= 11;
		luissDog.gender= 'M';
		
		System.out.println(" My dog name is "+luissDog.name);
		System.out.println(" Breed is "+luissDog.breed);
		System.out.println(" Color is "+luissDog.color);
		System.out.println(" Height is "+luissDog.height);
		System.out.println(" Age is "+luissDog.age+ " years old ");

		Dog castrosDog= new Dog();
		castrosDog.name=" jR";
		castrosDog.breed=" Husky";
		castrosDog.color=" Black";
		castrosDog.height= 4;
		castrosDog.age= 2;
		castrosDog.gender='M';

		System.out.println(" My dog name is "+castrosDog.name);
		System.out.println(" Breed is "+castrosDog.breed);
		System.out.println(" Color is "+castrosDog.color);
		
		
	}

}
