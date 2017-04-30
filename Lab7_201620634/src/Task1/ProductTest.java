package Task1;
public class ProductTest {

	SmartTV s =new SmartTV ();
	Laptop l = new Laptop();
	Toaster t = new Toaster();
	
	public ProductTest(){
		
	}
	public void testProduct(String a){
		if(a.equals("SmartTV")) System.out.println("product name is"+s.getName());
		else if(a.equals("Laptop")) System.out.println("product name is"+l.getName());
		else if(a.equals("Toaster")) System.out.println("product name is"+t.getName());
		else System.out.println("Error!!!!1");
	}
	public void testDataStorage(DataStorage l){
		System.out.println("FreeCapacity");
	}
	public void testNetworked(Networked n){
		
	}
	public void testCooker(Cooker k){
		
	}
	public static void main(String[] args) {
		
		SmartTV s =new SmartTV ();
		Laptop l = new Laptop();
		Toaster t = new Toaster();
		ProductTest p = new ProductTest();
		
		p.testProduct(s);
		p.testProduct(l);
		p.testProduct(t);
		p.testDataStorage(l);
		p.testNetworked(s);
		p.testNetworked(l);
		p.testCooker(t);
		
	}

}
