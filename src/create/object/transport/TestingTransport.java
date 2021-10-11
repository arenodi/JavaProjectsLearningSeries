/* TestingTransport
 * Created by Andre Alves
 * GitHub /arenodi
 * Version: 0.1
 * Date: 2021-oct-11
 */
package create.object.transport;

import create.object.transport.cars.models.Model;

public class TestingTransport {
	public static void main(String[] args) {
		
		Model testingModel = new Model("FDS4654DAS654ADS", "ASD-6547", "FORD", "FIESTA");
		
		System.out.println(testingModel.getVinNumber());
		System.out.println(testingModel.getPlateNumber());
		System.out.println(testingModel.getBrandName());
		System.out.println(testingModel.getModelName());
		
		testingModel.setModelName("KA");
		
		System.out.println(testingModel.getModelName());
		
	}
}
