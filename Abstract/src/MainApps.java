import childs.Item;
import parents.Product;
import parents.Shape;
import childs.Circle;
import childs.Triangle;

public class MainApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//abstract class hanya bisa diakses melalui child class
		
		Product product1 = new Item();
		product1.setName("Roti");
		((Item)product1).setPrice(100000);

		product1.printInformation();
		
		Shape lingkaran = new Circle("Biru", 20);
		Shape segitiga = new Triangle(10, 15, "Merah");
		
		System.out.println("Luas lingkaran berwarna "+ lingkaran.getColor() + " adalah " + lingkaran.getArea());
		System.out.println("Luas Segitiga berwarna "+ segitiga.getColor() + " adalah " + segitiga.getArea());
	}

}
