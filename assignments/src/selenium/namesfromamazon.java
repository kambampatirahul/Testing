package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class namesfromamazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/s?k=phones&ref=nb_sb_noss_2");
		d.manage().window().maximize();
		List<WebElement> x=d.findElements(By.xpath("//a//span[@class='a-size-medium a-color-base a-text-normal']"));
		for(WebElement i:x) {
			System.out.println(i.getText()+"\n\n");
		}
		d.quit();
	}

}
