
package com.mcms.selenium;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestWebApp {
    String username = "ravi";
    String password = "Welcome2IBM";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    @Test (priority = 1)
    public void test_Selenium_First() throws MalformedURLException {
    	DesiredCapabilities dc = DesiredCapabilities.chrome();
    	URL grid_url = new URL("http://10.171.97.175:4444/wd/hub");
    	RemoteWebDriver driver = new RemoteWebDriver(grid_url, dc);
		driver.get("http://mcms-webapp.apps.iscpocp-test.ocpdomain.local/mcms-webapp/");
		driver.manage().window().maximize();
		
		WebElement username_txt_box = driver.findElement(By.name("userName"));
		username_txt_box.sendKeys("ravi");
		driver.findElement(By.name("passName")).sendKeys("Welcome2IBM");

		driver.findElement(By.xpath("//input[@value = 'Python' and @name = 'favoriteLanguage']")).click();
		driver.findElement(By.xpath("//input[@value = 'Yes' and @name = 'interestDevsecops']")).click();
		driver.findElement(By.xpath("//input[@value = 'Submit' and @type = 'submit']")).click();
		
		String actual_title = driver.getTitle();
		String expected_title = "Simple Team Info App";
		Assert.assertEquals(actual_title, expected_title);
		driver.close();
    }
    
	@Test (priority = 2)
    public void test_Selenium_Second() throws MalformedURLException {
    	DesiredCapabilities dc = DesiredCapabilities.chrome();
    	URL grid_url = new URL("http://10.171.97.175:4444/wd/hub");
    	RemoteWebDriver driver = new RemoteWebDriver(grid_url, dc);
		driver.get("http://mcms-webapp.apps.iscpocp-test.ocpdomain.local/mcms-webapp/");
		driver.manage().window().maximize();
		WebElement username_txt_box = driver.findElement(By.name("userName"));
		username_txt_box.sendKeys("ravi");
		driver.findElement(By.name("passName")).sendKeys("Welcome2IBM");

		driver.findElement(By.xpath("//input[@value = 'Java' and @name = 'favoriteLanguage']")).click();
		driver.findElement(By.xpath("//input[@value = 'Yes' and @name = 'interestDevsecops']")).click();
		driver.findElement(By.xpath("//input[@value = 'Submit' and @type = 'submit']")).click();

		WebElement required_text = driver.findElement(By.xpath("//*/h3"));
		Assert.assertEquals(required_text.getText(), "Welcome to MCMS DevSecOps");
		driver.close();
	}

}
