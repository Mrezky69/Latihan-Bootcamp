import childs.Doctor;
import childs.Programmer;
import childs.Teacher;
import parents.Person;

public class MainApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Programmer();
		person1.setName("Rizky");
		person1.setAddress("Bandung");
		((Programmer)person1).setTechnology(".Net Core");
		
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
			message = "Hello, " + programmer.getName() + ". Seorang Programmer " + programmer.getTechnology() + ".";
		}else if(person instanceof Teacher) {
			Teacher teacher = (Teacher) person;
			message = "Hello, " + teacher.getName() + ". Seorang Guru " + teacher.getSubject() + ".";
		}else if(person instanceof Doctor) {
			Doctor doctor = (Doctor) person;
			message = "Hello, " + doctor.getName() + ". Seorang Dokter " + doctor.getSpecialist() + ".";
		}else {
			message = "Hello, " + person.getName() + ".";
		}
	System.out.println(message);	
	}
}
