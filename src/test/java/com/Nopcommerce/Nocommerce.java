package com.Nopcommerce;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nocommerce {
	
	public static void main(String[] args) {
		
		 WebDriver driver;
		//Browser opening and URL loading
		driver = WebDriverManager.chromedriver().create(); 
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Register Functionality
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Mansi");
		driver.findElement(By.id("LastName")).sendKeys("Sharma");
		
		WebElement drpbday= driver.findElement(By.name("DateOfBirthDay"));
		Select drpbirthday = new Select(drpbday);
		drpbirthday.selectByVisibleText("7");
		
		WebElement drpmonth= driver.findElement(By.name("DateOfBirthMonth"));
		Select drpbirthmonth = new Select(drpmonth);
		drpbirthmonth.selectByVisibleText("May");
		
		WebElement drpyear= driver.findElement(By.name("DateOfBirthYear"));
		Select drpbirthyear = new Select(drpyear);
		drpbirthyear.selectByIndex(5);

		driver.findElement(By.id("Email")).sendKeys("abc1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		driver.findElement(By.id("register-button")).click();
		
		//product ordering
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")).click();
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Cell phones']")).click();
		driver.findElement(By.linkText("HTC One M8 Android L 5.0 Lollipop")).click();
		driver.findElement(By.xpath("(//button[@id='add-to-cart-button-18'])[1]")).click();
		driver.findElement(By.linkText("Shopping cart")).click();
		driver.findElement(By.name("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.className("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.className("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		//Wishlisting the items
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")).click();
		driver.findElement(By.xpath("//a[@title='Show products in category Clothing'][normalize-space()='Clothing']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Custom T-Shirt']")).click();
		driver.findElement(By.xpath("(//button[@id='add-to-wishlist-button-29'])[1]")).click();
		
		
		
		driver.quit();
	}

}
