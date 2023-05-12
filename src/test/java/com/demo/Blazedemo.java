package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Parent.Baseclass;

public class Blazedemo extends Baseclass {

	@Test
	public void login() {
		Loginpage lp = new Loginpage();
		chrome();
		implicitwait();
		url("https://blazedemo.com/index.php");
		clickbutton(lp.getLink());
	//	WebElement link = driver.findElement(By.xpath("//a[text()='destination of the week! The Beach!']"));
		//clickbutton(link);
System.out.println("Dog");


	}
private void sdf() {
	System.out.println("Master");

}
}
