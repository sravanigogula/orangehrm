package testngpractise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//advantages  ==llel testing is possible,we can test many test cases,in difrnt browsers as well,assign priorities,data provider,
public class Annotations {
	@BeforeSuite
public void startup() {
	System.out.println("started..");
}
	@AfterSuite
public void enter() {
	System.out.println("entered..");
}
	@BeforeTest
	public void login() {
		System.out.println("logged in.");
}
	@AfterTest
	public void username() {
		System.out.println("username is entered..");
}
	@BeforeClass
	public void password() {
		System.out.println("password is entered..");
	}
	@AfterClass
	public void LoginButton() {
		System.out.println("login button is clicked..");
	}
	@BeforeMethod
	public void EnterIntoLoginPage() {
		System.out.println("Entered IntoLoginPage..");
	}
	@AfterMethod
	public void Functionality() {
		System.out.println("perform functionality..");
	}
	@Test
	public void logout() {
		System.out.println("logged out..");
	}
	
	
}