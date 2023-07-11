
public class MainApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Person person1 = new Person();
//		person1.name = "Hendra";
//		person1.address = "Garut";
//		
//		Teacher teacher1 = new Teacher();
//		teacher1.name = "Budi";
//		teacher1.address = "Bandung";
//		teacher1.subject = "Matematika";
		
		Doctor doctor1 = new Doctor();
		doctor1.name = "Elis";
		doctor1.address = "Jakarta";
		doctor1.specialist = "Dentist";
		
		Doctor doctor2 = new Doctor("Joko","Tegal","Cardiologist");
		
//		Programmer programmer1 = new Programmer();
//		programmer1.name = "Rizki";
//		programmer1.address = "Surabaya";
//		programmer1.technology = "Javascript";
		
//		person1.greeting();
//		System.out.println();
//
//		teacher1.greeting();
//		System.out.println();
//		
		doctor1.greeting();
		System.out.println();
		doctor2.greeting();
		
//		programmer1.greeting();
	}

}
