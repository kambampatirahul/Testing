package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.product;
import pages.signin;

public class makingorders {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setup(){
		try {
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/realme-9-sunburst-gold-128-gb/p/itm73722a6d35d36?pid=MOBGDYSHHVWMECHS&lid=LSTMOBGDYSHHVWMECHSTFXBTZ&marketplace=FLIPKART&q=mobiles&store=tyy%2F4io&srno=s_1_1&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&fm=organic&iid=3f741f24-e375-4226-8a4f-42662c2c3fee.MOBGDYSHHVWMECHS.SEARCH&ppt=hp&ppn=homepage&ssid=1iw6zp1kn40000001668952816882&qH=eb4af0bf07c16429");
		driver.manage().window().maximize();
		}catch(Exception e){
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void test1() throws InterruptedException {
		signin s = new signin();
		s.clickloginButton(driver);
		s.enternumber(driver);
		s.enterpassword(driver);
		s.clicksignin(driver);
		product p = new product();
		p.addToCart(driver);
		p.openCart(driver);
		p.changePincode(driver);
		p.enterPincode(driver);
	}
	
	@AfterClass
	public void teardown() {
		//driver.quit();
	}
	
}

//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import pages.product;
//
//public class makingorders {
//	
//	public static void main(String[] args) {
//		try {
//		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
//		WebDriver d=new ChromeDriver();
//		d.get("https://www.flipkart.com/realme-9-sunburst-gold-128-gb/p/itm73722a6d35d36?pid=MOBGDYSHHVWMECHS&lid=LSTMOBGDYSHHVWMECHSTFXBTZ&marketplace=FLIPKART&q=mobiles&store=tyy%2F4io&srno=s_1_1&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&fm=organic&iid=3f741f24-e375-4226-8a4f-42662c2c3fee.MOBGDYSHHVWMECHS.SEARCH&ppt=hp&ppn=homepage&ssid=1iw6zp1kn40000001668952816882&qH=eb4af0bf07c16429");
//		d.manage().window().maximize();
//		new product().clickOnBuyNow(d);
//		d.quit();
//		}catch(Exception e){
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//	}
//	
//}
