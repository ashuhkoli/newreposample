package sampletest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforeafftr {
	@BeforeMethod
	  public void enterappUrl() {
		  System.out.println("enter app url");
	  }
	  @Test(priority=1)
	  public void log() {
		  System.out.println("login");
	  }

	  @AfterMethod
	  public void logout() {
		  System.out.println("logout");
	  }
	  @Test(priority=2)
	  public void task() {
		  System.out.println("task created");
	  }

	  
	  @BeforeTest
	  public void openB() {
		  System.out.println("browser open");
	  }
	 
	  @AfterTest
	  public void closeb () {
		  System.out.println("close Browser");
	  }

}
