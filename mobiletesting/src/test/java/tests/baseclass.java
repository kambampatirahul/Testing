package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import pages.home;
import pages.product;
import pages.signin;
import pages.location;

public class baseclass {
	public static AndroidDriver<AndroidElement>driver;
	public DesiredCapabilities dc=new DesiredCapabilities();
	@BeforeClass
	public void setup(){
		try {
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "58416ab8");
			dc.setCapability("platformName", "android");
			dc.setCapability("appPackage", "in.amazon.mShop.android.shopping");
			dc.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
			URL url=new URL("http://127.0.0.1:4723/wd/hub");
			driver= new AndroidDriver<AndroidElement>(url, dc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void test1() throws InterruptedException {
		new signin().selectlang(driver);
		new signin().skip(driver);
		new home().searchbar(driver);
		new home().searchproduct(driver);
		new product().selectproduct(driver);
		new location().india(driver);
		new product().printname(driver);
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
}









