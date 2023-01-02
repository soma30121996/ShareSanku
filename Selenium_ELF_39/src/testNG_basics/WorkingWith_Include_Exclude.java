package testNG_basics;

import org.testng.annotations.Test;

public class WorkingWith_Include_Exclude {

	@Test(priority = 1 )
	public void Register() {
		System.out.println("Executing Register TC");
	}
	
	@Test(priority = 2 )
	public void Login() {
		System.out.println("Executing Login TC");
	}
	
	@Test(priority = 3 )
	public void search() {
		System.out.println("Executing Search TC");
	}
	
	@Test(priority = 4 )
	public void Wishlist() {
		System.out.println("Executing Wishlist TC");
	}
	
	@Test(priority = 5 )
	public void AddToCart() {
		System.out.println("Executing AddToCart TC");
	}
	
	@Test(priority = 6)
	public void Buy() {
		System.out.println("Executing Buy TC");
	}
	
	
	
	@Test(priority = 7)
	public void Logout() {
		System.out.println("Executing Logout TC");
	}
	
}
