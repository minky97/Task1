package Task1;
public class ProductTest {

	
	public ProductTest(){
		System.out.println("Constructor product test");
		
	}

	public void testProduct(Product p){
		System.out.println(p.getName());
		System.out.println(p.getPrice());
}
public void testDataStorage(DataStorage l){
		System.out.println(l.getFreeCapacity());
	}
	public void testNetworked(Networked n){
		System.out.println("Max speed is "+n.maxspeed());
		if(n.isconnected==true){
			System.out.println("Avaliable connect");
		}
		else if(n.isconnected==false){
			System.out.println("Inavaliable connect");
		}
	}
	public void testCooker(Cooker k){
		System.out.println("It prepared "+k.prepareFood());
	}
	public static void main(String[] args) {
		SmartTV s =new SmartTV ();
		Laptop l = new Laptop();
		Toaster t = new Toaster();
		ProductTest p = new ProductTest();
		
		
		p.testProduct(s);
		p.testNetworked(s);
		s.setChannel(3);
		System.out.println("Channel is "+s.getChannel());
		
	
		p.testProduct(l);
		p.testDataStorage(l);
		p.testNetworked(l);
		
		p.testProduct(t);
		p.testCooker(t);
		
	}

}

