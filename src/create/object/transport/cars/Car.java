package create.object.transport.cars;

public class Car {
	
	String vinNumber;
	String plateNumber;
	
	protected Car (){}
	
	protected Car (String vinNumber){
		this.vinNumber = vinNumber;
	}
	
	protected Car (String vinNumber, String plateNumber){
		this.vinNumber = vinNumber;
		this.plateNumber = plateNumber;
	}

	public String getVinNumber() {
		return vinNumber;
	}

	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	

}
