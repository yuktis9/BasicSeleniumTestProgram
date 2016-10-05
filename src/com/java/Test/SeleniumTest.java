/**
 * 
 */
package com.java.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * @author yuktisarwadia
 *
 */
public class SeleniumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invokes FireFox browser
		WebDriver driver = new SafariDriver();
		
		//Goes to the specified URL
		driver.get("http://www.google.com");
		
		//Finds element by Xpath and enter the following details to search for Firefox
//		driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("facebook");
//		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		
		//For Safari
		driver.findElement(By.name("q")).sendKeys("facebook");
		driver.findElement(By.name("btnK")).click();
		

	}

}
