
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
 

	public static void main(String[] args) {
	}
    @Test (priority = 1)
    public void test_Selenium_First() throws MalformedURLException {
    	DesiredCapabilities dc = DesiredCapabilities.chrome();
    	URL grid_url = new URL("http://10.171.97.175:4444/wd/hub");
    	RemoteWebDriver driver = new RemoteWebDriver(grid_url, dc);
		driver.get("http://3.68.95.67:8080/jenkins_calci-1.0-SNAPSHOT/");
		driver.manage().window().maximize();
		
		String actual_title = driver.getTitle();
		String expected_title = "calculator";
		Assert.assertEquals(actual_title, expected_title);
		
		driver.close();
    }
    
	

}
