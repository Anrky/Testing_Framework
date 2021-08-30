package task8;

import org.testng.annotations.DataProvider;

public class TestData {
	@DataProvider
	public Object [][] getData(){
		Object[][] data = new Object [3][2];
		
		
		data[0][0] = "mngr350315";
		data[0][1] = "udErAjA";
		
		data[1][0] = "mngr350315";
		data[1][1] = "udErAjA";
		
		data[2][0] = "mngr350315";
		data[2][1] = "udErAjA";
		
		
		return data;
	}

}
