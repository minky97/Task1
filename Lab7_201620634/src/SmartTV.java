
public abstract class SmartTV extends Product{

	private int channel;
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public SmartTV(){
		double price=12.0;
		super.setPrice(price);
	}
	
	public boolean isConnected(){
		return;
	}
	
	public double maxSpeed(){
		return;
	}
	
	@Override
	public String getName(){
		String product ="SmartTV";
		return product;
	}
	
}
