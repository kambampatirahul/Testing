package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class home {
	//AndroidDriver driver;
	public void searchbar(AndroidDriver<AndroidElement>driver) {
		WebDriverWait wait1=new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text")));
		MobileElement el3 = (MobileElement) driver.findElement(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text"));
		el3.click();
	}	
	public void searchproduct(AndroidDriver<AndroidElement>driver) {	
		WebDriverWait wait2=new WebDriverWait(driver,30);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text")));		
		MobileElement el4 = (MobileElement) driver.findElement(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text"));
		el4.sendKeys("phones");
		
		//WebDriverWait wait3=new WebDriverWait(driver,30);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@resource-id='in.amazon.mShop.android.shopping:id/iss_search_suggestions_list_view']//*[@resource-id='in.amazon.mShop.android.shopping:id/iss_search_dropdown_item_suggestions'][1]")));
		MobileElement el5 = (MobileElement) driver.findElement(By.xpath("//*[@resource-id='in.amazon.mShop.android.shopping:id/iss_search_suggestions_list_view']//*[@resource-id='in.amazon.mShop.android.shopping:id/iss_search_dropdown_item_suggestions'][1]"));
		el5.click();
	}
}
