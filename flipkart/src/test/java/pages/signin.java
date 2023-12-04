package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signin {
	
	public void clickloginButton(WebDriver driver) {
		driver.findElement(By.linkText("Login")).click();
	}
	
	public void enternumber(WebDriver driver) {
		WebElement e =driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		e.sendKeys("9573521474");
	}

	public void enterpassword(WebDriver driver) {
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Rahul@1234");
	}
	
	public void clicksignin(WebDriver driver) {
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	}
	
}
