package testNG_basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Working_With_PropertyFile {
	@Test
	public void propertydemo() throws IOException {
		String filepath ="./Test_Configuration/TestConfiguration.properties";
		FileInputStream fis= new FileInputStream(filepath);
		
		//Creating an object for object class
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("Firstname")+"."+prop.getProperty("Lastname"));
		System.out.println(prop.getProperty("URL"));
		
	}
	

}
