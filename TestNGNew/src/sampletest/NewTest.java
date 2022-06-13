package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class NewTest extends SeleniumUtility {
  @Test(priority=1)
  public void test1() {
	  
	  System.out.println("hi am test 1");
  }
  @Test(priority=1) 
  public void test2()
  {
	  WebDriver driver = setUp("Chrome","https://demo.actitime.com/login.do");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	  Assert.assertEquals(driver.getTitle(),"actiTIME - Login","Either login page not opened or title got changed");
	  
  }
}
