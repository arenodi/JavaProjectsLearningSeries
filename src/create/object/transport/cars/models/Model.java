package create.object.transport.cars.models;

import create.object.transport.cars.Car;

public class Model extends Car{
	
	String brandName;
	String modelName;
	
	public Model(){}
	
	public Model(String brandName){
		this.brandName = brandName;
	}
	
	public Model(String brandName, String modelName){
		this.brandName = brandName;
		this.modelName = modelName;
	}
	
	public Model(String vinNumber, String brandName, String modelName){
		super(vinNumber);
		this.brandName = brandName;
		this.modelName = modelName;
	}
	
	public Model(String vinNumber, String plateNumber, String brandName, String modelName){
		super(vinNumber, plateNumber);
		this.brandName = brandName;
		this.modelName = modelName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

}
