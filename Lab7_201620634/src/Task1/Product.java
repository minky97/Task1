package Task1;

public abstract class Product {

private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	
	if(price<0){
		System.out.println("Error !");
		price=0;
	}
	this.price = price;
	
}
public abstract String getName();


}
