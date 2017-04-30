package Task1;

public class Laptop extends Product implements Networked, DataStorage{
	
	private double totalCapacity;
	private double usedCapacity;
	
	
	public Laptop() {
		double price = 10.0;
		super.setPrice(price);
	}
	
	@Override
	public double getFreeCapacity() {
		return totalCapacity - usedCapacity;
	}
	
	@Override
	public void format() {
		System.out.println("format!");
	}

	public double getTotalCapacity() {
		return totalCapacity;
	}

	
	public void setTotalCapacity(double totalCapacity) {
		
		if(totalCapacity <0) {
			System.out.println("ERROR!");
			totalCapacity = 0;
		}
		this.totalCapacity = totalCapacity;
	}

	public double getUsedCapacity() {
		return usedCapacity;
	}

	public void setUsedCapacity(double usedCapacity) {
		
		if(usedCapacity <0) {
			System.out.println("ERROR!");
			usedCapacity = 0;
		}
		this.usedCapacity = usedCapacity;
	}
	
	
	public String getName() {
		String name;
		name = "Mark";
		return name;
	}
	
	
	@Override
	public boolean isConnected() {
		int connected;
		connected  =1;
		if(connected == 0) {
			return false;
		}
		else {
			return true;
		}
	}

	
	@Override
	public double maxSpeed() {
		double speed;
		speed = 100.0;
		return speed;
	}
	

}