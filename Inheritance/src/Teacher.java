
public class Teacher extends Person {

	String subject;
	
	public Teacher() {
		
	}
	
	public Teacher(String name, String address, String subject) {
		super(name, address);
		this.subject = subject;
	}
	
	void teaching() {
		System.out.println("I can teach "+ subject +", So anyone how wants to learns can talk to me.");
	}
	
	@Override
	void greeting() {
		super.greeting();
		System.out.println("My job is a "+ subject + " teachter.");
	}
}
