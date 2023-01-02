package testNG_basics;

import org.testng.annotations.Test;

public class Working_With_Groups {
	
	@Test(groups = "SmokeTest",priority = 1)
	public void Register() {
		System.out.println("Executing Register TC");
	}
	
	@Test(groups = "SmokeTest",priority = 2)
	public void Login() {
		System.out.println("Executing Login TC");
	}
	
	@Test(groups = "SmokeTest",priority = 3)
	public void search() {
		System.out.println("Executing Search TC");
	}
	
	@Test
	public void Wishlist() {
		System.out.println("Executing Wishlist TC");
	}
	
	@Test
	public void AddToCart() {
		System.out.println("Executing AddToCart TC");
	}
	
	@Test
	public void Buy() {
		System.out.println("Executing Buy TC");
	}
	
		@Test
	public void Logout() {
		System.out.println("Executing Logout TC");
	}
	

}
