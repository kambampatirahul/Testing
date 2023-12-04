package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class signin {
	public void selectlang(AndroidDriver<AndroidElement>driver) {
		WebDriverWait wait1=new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Continue in English\"]")));
		MobileElement el1 = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Continue in English\"]"));
		el1.click();
	}
	public void skip(AndroidDriver<AndroidElement>driver) {
		WebDriverWait wait2=new WebDriverWait(driver,30);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.amazon.mShop.android.shopping:id/skip_sign_in_button")));		
		MobileElement el2 = (MobileElement) driver.findElement(By.id("in.amazon.mShop.android.shopping:id/skip_sign_in_button"));
		el2.click();
	}
}
