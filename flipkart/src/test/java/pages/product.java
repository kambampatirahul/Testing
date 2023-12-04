package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class product {
	
	public void clickOnBuyNow(WebDriver driver) {
		WebElement el3 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button"));
		el3.click();
		System.out.println("clicked");
	}
	
	public void changePincode(WebDriver driver) {
		driver.findElement(By.xpath("//button[@class='_2MMH-I']")).click();
	}
	
	public void enterPincode(WebDriver driver) {
		driver.findElement(By.xpath("//input[@class='_3gwHKm']")).sendKeys("505502");
	}
	
	public void addToCart(WebDriver driver) {
		WebElement el3 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		el3.click();
		System.out.println("add to cart clicked");
	}
	
	public void openCart(WebDriver driver) {
		driver.findElement(By.xpath("//a[@class='_3SkBxJ']")).click();
	}
}