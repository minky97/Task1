package Task1;

public class Toaster extends Product implements Cooker{

	public Toaster(){
		double price = 8.0;
		super.setPrice(price);
	}
	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		
		String food;
		food="It prepares bread.";
		return food;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		String product = "Toaster";
		return product;
	}

}
