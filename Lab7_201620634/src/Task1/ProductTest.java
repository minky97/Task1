package Task1;
public class ProductTest {

	public ProductTest(){
		
	}
	public void testProduct(Product p){
		
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
