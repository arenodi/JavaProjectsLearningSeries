/*Calculator
 * Created by Andre Alves
 * GitHub /arenodi
 * Version: 0.1
 * Date: 2021-oct-11
 */

package different.types.handler;

import different.types.handler.operations.OperationsHandler;

public class Calculator {
	
	public static void main(String[] args) {
		
		OperationsHandler variableForTesting = new OperationsHandler();
		
		System.out.println("First Result = " + variableForTesting.addTwoNumbers(3,5));
		System.out.println("Second Result = " + variableForTesting.addTwoNumbers(3.0,5.0));
		System.out.println("Third Result = " + variableForTesting.subtractTwoNumbers(3,5));
		System.out.println("Fourth Result = " + variableForTesting.subtractTwoNumbers(3.0,5.0));
		System.out.println("Fifth Result = " + variableForTesting.multiplyTwoNumbers(3,5));
		System.out.println("Sixth Result = " + variableForTesting.multiplyTwoNumbers(3.0,5.0));
		System.out.println("Seventh Result = " + variableForTesting.divideTwoNumbers(3,5));
		System.out.println("Eighth Result = " + variableForTesting.divideTwoNumbers(3.0,5.0));
		
		
	}

}
