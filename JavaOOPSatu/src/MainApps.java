
public class MainApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// membuat object dari class person yang menggunakan construtor parameter
		Person person3 = new Person("Budi","Bandung");
		person3.sayHello("padepokan79");
		System.out.println(person3.sayAddress());
		
		// membuat object dari class person yang menggunakan construtor default
		Person person2 = new Person();
		person2.name = "Joko";
		person2.address = "Surabaya";
		person2.sayHello("Padepokan 79");
		System.out.println(person2.sayAddress());
		
		// membuat object dari class person yang menggunakan construtor satu parameter
		Person person1 = new Person();
		person1.name = "Eko";
		person1.address = "Tegal";
//		System.out.println(person1.name);
//		System.out.println(person1.address);
//		System.out.println(person1.Country);
		person1.sayHello("Padepokan 79");
		System.out.println(person1.sayAddress());
		
	}

}
