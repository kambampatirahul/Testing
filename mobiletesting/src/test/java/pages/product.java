package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class product {
	//AndroidDriver driver;
	public void selectproduct(AndroidDriver<AndroidElement>driver) {
		WebDriverWait wait1=new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='android.view.View']//*[contains(@text,\"Redmi 9A (Nature Green, 2GB RAM, 32GB Storage) | 2GHz Octa-core Helio G25 Processor | 5000 mAh Battery\")])[2]")));
		MobileElement el6 = (MobileElement) driver.findElement(By.xpath("(//*[@class='android.view.View']//*[contains(@text,\"Redmi 9A (Nature Green, 2GB RAM, 32GB Storage) | 2GHz Octa-core Helio G25 Processor | 5000 mAh Battery\")])[2]"));
		el6.click();
	}
	public void printname(AndroidDriver<AndroidElement>driver) {
		WebDriverWait wait1=new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@resource-id='title_feature_div']//*[@class='android.view.View']")));
		MobileElement e=(MobileElement)driver.findElement(By.xpath("//*[@resource-id='title_feature_div']//*[@class='android.view.View']"));
		String s=e.getText();
		System.out.println(s);
	}
}
