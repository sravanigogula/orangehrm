package testngpractise;


import org.testng.annotations.Test;


//grouping test cases =eg = regression,sanity ,smoke ==we can group regression as 1 gropu,smoke as 1 group

//syntax=@Test(priority=1,groups= {"smoke"})
public class GroupingTestCases {

	@Test(priority=1,groups= {"regression"})
	public void startup() {
		System.out.println("started..");
	}
	@Test(priority=2,groups= {"sanity"})
	public void enter() {
		System.out.println("entered..");
	}
		@Test(priority=3,groups= {"smoke"})
		public void login() {
			System.out.println("logged in.");
	}
		@Test(priority=4,groups= {"regression"})
		public void username() {
			System.out.println("username is entered..");
	}
		@Test(priority=5,groups= {"smoke"})
		public void password() {
			System.out.println("password is entered..");
		}
		@Test(priority=6,groups= {"regression"})
		public void LoginButton() {
			System.out.println("login button is clicked..");
		}
		@Test(priority=7,groups= {"sanity"})
		public void EnterIntoLoginPage() {
			System.out.println("Entered IntoLoginPage..");
		}
		@Test(priority=8,groups= {"smoke"})
		public void Functionality() {
			System.out.println("perform functionality..");
		}
		@Test(priority=9,groups= {"smoke"})
		public void logout() {
			System.out.println("logged out..");
		}
}
