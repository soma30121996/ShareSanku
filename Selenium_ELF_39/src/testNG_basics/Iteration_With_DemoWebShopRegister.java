package testNG_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Iteration_With_DemoWebShopRegister {
	
	@DataProvider(name= "TestData")
	public Object[][] testdata(){
		Object[][]data= new Object[5][5];
		data[0][0]="Somashekar";
	    data[0][1]="N";
	    data[0][2]="Somashekar96@gmail.com";
	    data[0][3]="123soma";
	    data[0][4]	="123Soma"	;
	    
	    data[1][0]="Darshan";
	    data[1][1]="Gowda";
	    data[1][2]="Darshan96@gmail.com";
	    data[1][3]="123Darshan";
	    data[1][4]	="123Darshan"	;
	    
	    data[2][0]="Sanku";
	    data[2][1]="Gowda";
	    data[2][2]="Sanku96@gmail.com";
	    data[2][3]="123Sanku";
	    data[2][4]	="123Sanku"	;
	    
	    data[3][0]="Chetu";
	    data[3][1]="Gowda";
	    data[3][2]="Chetu96@gmail.com";
	    data[3][3]="123Chetu";
	    data[3][4]	="123Chetu"	;
	    
	    data[4][0]="Raj";
	    data[4][1]="Gowda";
	    data[4][2]="Raj96@gmail.com";
	    data[4][3]="123Raj";
	    data[4][4]	="123Raj"	;
	    
		
		return data;
	}
	@Test(dataProvider="TestData")
	
	
	public void register(String firstname, String lastname, String email, String password ,String confirmpassword) {
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/cart") ;
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("FirstName")).sendKeys(firstname);
		driver.findElement(By.name("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
		driver.findElement(By.name("register-button")).click();
		driver.quit();
		

	}
	
	
	
	
}



