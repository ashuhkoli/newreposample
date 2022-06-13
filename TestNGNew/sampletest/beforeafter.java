package sampletest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class beforeafter {
 
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
  
  @BeforeMethod
  public void openB() {
	  System.out.println("browser open");
  }
  @Test(priority=2)
  public void task() {
	  System.out.println("task created");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("close Browser");
  }


}
