
public class Person {
	String name;
	String address;
	final String Country = "Indonesia";
	
	//conctructor default
	Person(){
		
	}
	
	//Constructor dengan satu parameter
	Person(String paraName){
		name = paraName;
	}
	
	//Constructor dengan parameter
	Person(String name, String address){
		// gunakan this untuk membedakan paramter dengan field 
		this.name = name;
		this.address = address;
	}
	
	// method void
	void sayHello(String paramName) {
		System.out.println("Hello " + paramName + ", Myname is " + name + ".");
	}
	
	// method return value (mengembalikan nilai)
	String sayAddress() {
		return "I, come from " + address + ".";
	}
}

