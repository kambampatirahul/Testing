package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class location {
	public void india(AndroidDriver<AndroidElement>driver) throws InterruptedException {
		WebDriverWait wait1=new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("in.amazon.mShop.android.shopping:id/loc_ux_gps_enter_pincode")));
		MobileElement el3 = (MobileElement) driver.findElement(By.id("in.amazon.mShop.android.shopping:id/loc_ux_gps_enter_pincode"));
		el3.click();
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("in.amazon.mShop.android.shopping:id/loc_ux_pin_code_text_pt1")));
		MobileElement el4 = (MobileElement) driver.findElementById("in.amazon.mShop.android.shopping:id/loc_ux_pin_code_text_pt1");
		el4.clear();
		Thread.sleep(100);
		el4.sendKeys("505502");
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("in.amazon.mShop.android.shopping:id/loc_ux_update_pin_code")));
		MobileElement el5 = (MobileElement) driver.findElementById("in.amazon.mShop.android.shopping:id/loc_ux_update_pin_code");
		el5.click();
	}
}
