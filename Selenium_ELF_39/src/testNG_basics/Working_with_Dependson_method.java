package testNG_basics;

import org.testng.annotations.Test;

public class Working_with_Dependson_method {

	@Test
	public void Register() {
		System.out.println("Executing Register TC");
	}
	
	@Test(dependsOnMethods = "Register" )
	public void Login() {
		System.out.println("Executing Login TC");
	}
	
	@Test(dependsOnMethods = "Login" )
	public void Search() {
		System.out.println("Executing Search TC");
	}
	
	@Test(dependsOnMethods = "Search" )
	public void Wishlist() {
		System.out.println("Executing Wishlist TC");
	}
	
	@Test(dependsOnMethods = "Wishlist" )
	public void AddToCart() {
		System.out.println("Executing AddToCart TC");
	}
	
	@Test(dependsOnMethods = "AddToCart" )
	public void Buy() {
		System.out.println("Executing Buy TC");
	}
	
	
	
	@Test(dependsOnMethods = "Buy" )
	public void Logout() {
		System.out.println("Executing Logout TC");
	}
	
	
}
