package testNG_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_With_DataProvider {
	
	@DataProvider(name="TestData")
	public Object[][] testdata(){
		Object[][] data = new Object[5][2];
		data[0][0]="Somashekar";
		data[0][1]="N";
		data[1][0]="Chickpete";
		data[1][1]="Chetu";
		data[2][0]="Kempnalli";
		data[2][1]="Keerthana";
		data[3][0]="Dasarahalli";
		data[3][1]="Darshan";
		data[4][0]="Sanku";
		data[4][1]="Manku";
		
		return data;
			
	}
	
	@DataProvider(name="soma")
	public int hi() {
		int a=10,b=20,c;
		c=a+b;
		return c;
	}

	/*@Test(dataProvider ="TestData")
	public void testdatademo(String firstname, String lastname) {
		System.out.println(firstname +" "+lastname);
		//System.out.println(lastname);
		
	}*/
	@Test(dataProvider="soma")
	public void testdatademo(int a) {
		System.out.println(a);
	}
	

}
