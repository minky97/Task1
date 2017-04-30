package Task1;

public class ProductTest {

	public ProductTest() {
		System.out.println("Product test");

	}

	public void testProduct(Product p) {
		System.out.println(p.getName());
		System.out.println("Price is "+p.getPrice());
	}

	public void testDataStorage(DataStorage l) {

		System.out.println("Free Capacity is " + l.getFreeCapacity());
	}

	public void testNetworked(Networked n) {
		System.out.println("Max speed is " + n.maxSpeed());
		if (n.isConnected() == true) {
			System.out.println("Avaliable connect");
		} else if (n.isConnected() == false) {
			System.out.println("Inavaliable connect");
		}
	}

	public void testCooker(Cooker k) {
		System.out.println("It prepared " + k.prepareFood());
	}

	public static void main(String[] args) {
		SmartTV s = new SmartTV();
		Laptop l = new Laptop();
		Toaster t = new Toaster();
		ProductTest p = new ProductTest();

		p.testProduct(s);
		p.testNetworked(s);
		s.setChannel(3);
		System.out.println("Channel is " + s.getChannel());
		System.out.println();
		l.setTotalCapacity(100);
		l.setUsedCapacity(50);
		p.testProduct(l);
		p.testDataStorage(l);
		p.testNetworked(l);
		System.out.println();
		p.testProduct(t);
		p.testCooker(t);

	}

}
