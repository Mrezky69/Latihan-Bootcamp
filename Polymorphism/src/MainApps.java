
public class MainApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Programmer("Rizky","Bandung",".Net Core");
		person1.greeting();
		
		System.out.println();
		
		System.out.println(((Programmer)person1).technology); //untuk memakai field teknologi harus di konversi (casts) variable person 1 menjadi tipe data programmer
		
		Person person2 = new Teacher("Joko","Tegal","Matematika");
		Person person3 = new Doctor("Eko","Surabaya","Pedistrician");
		
		System.out.println();
		
		sayHello(person1);
		sayHello(person2);
		sayHello(person3);
		
	}
	
	static void sayHello(Person person) {
		String message;
		if(person instanceof Programmer) {
			Programmer programmer = (Programmer) person;
			message = "Hello, " + programmer.name + ". Seorang Programmer " + programmer.technology + ".";
		}else if(person instanceof Teacher) {
			Teacher teacher = (Teacher) person;
			message = "Hello, " + teacher.name + ". Seorang Guru " + teacher.subject + ".";
		}else if(person instanceof Doctor) {
			Doctor doctor = (Doctor) person;
			message = "Hello, " + doctor.name + ". Seorang Dokter " + doctor.specialist + ".";
		}else {
			message = "Hello, " + person.name + ".";
		}
	System.out.println(message);	
	}
}
