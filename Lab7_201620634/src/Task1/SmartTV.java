package Task1;
public class SmartTV extends Product implements Networked{

	private int channel;
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		if(channel<=0) System.out.println("Error!");
		this.channel = channel;
	}
	
	public SmartTV(){
		double price=12.0;
		super.setPrice(price);
	}
	
	public boolean isConnected(){
		return true;
	}
	@Override
	public double maxSpeed(){
		double max=14.0;
		return max;
	}
	
	@Override
	public String getName(){
		String product ="SmartTV";
		return product;
	}
	
}
