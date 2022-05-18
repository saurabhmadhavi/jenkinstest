package mindflur2;

import java.time.Duration;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazassigment {

	// @SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
				// --------------login ------------//
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("javascript:window.scrollBy(250,350);");


		driver.findElement(By.id("ap_email")).sendKeys("valid email id");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("valid password");
		driver.findElement(By.id("signInSubmit")).click();
		///------------------------ finding product --------------------//
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("rubix");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("D ETERNAL MoYu Mofang Jiaoshi 3x3 Speed Cube")).click();
		
//		Thread.sleep(5000);
//		 Select quantity = new
//		 Select(driver.findElement(By.xpath("(//select[@id='quantity'])[7]")));
//		 quantity.selectByIndex(2);
		// Select dropdown;
	//	dropdown.selectByIndex(2);
	//	Select quantity = new Select(driver.findElement(By.xpath("//select[@id='quantity']")));
		//driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_DOWN);
		
		//quantity.selectByIndex(2);
		// quantity.selectByVisibleText("2");
		// driver.findElement(By.id("add-to-cart-button")).click();
						//----------------- add to cart-----------//
		Thread.sleep(5000);
		Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
      driver.switchTo().window(childId);
       driver.findElement(By.id("add-to-cart-button")).click();
       
       Thread.sleep(5000);
       //------------------2nd product -----------//
       driver.get("https://www.amazon.in/ref=nav_logo");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Apple iPhone 11 (64GB) - (Product) RED")).click();
		Thread.sleep(5000);
	
	//	WebDriverWait wait = new WebDriverWait(driver,30);// WebDriverWait(driver,30);
 		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")).click();
 	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='buy-now-button']"))).click();
		//driver.findElement(By.id("add-to-wishlist-button-submit")).click();
	//	driver.findElement(By.xpath("//*[@id=\'add-to-cart-button\']")).click();

		Thread.sleep(5000);
		Set<String> ids1 = driver.getWindowHandles();
        Iterator<String> it1 = ids1.iterator();
        String parentId1 = it1.next();
        String childId1 = it1.next();
        String childId2 = it1.next();
      driver.switchTo().window(childId2);
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
      //------------------ 3rd product ----------------//  
        Thread.sleep(3000);
        driver.get("https://www.amazon.in/ref=nav_logo");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Apple iPhone 12 (128GB) - Blue")).click();
		
		Thread.sleep(3000);
		Set<String> ids2 = driver.getWindowHandles();
        Iterator<String> it2 = ids2.iterator();
        String parentId2 = it2.next();
        String childId3 = it2.next();
        String childId4 = it2.next();
      driver.switchTo().window(childId4);
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        // --------------------- payment------------------//
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
         driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
         
         Thread.sleep(2000);
         JavascriptExecutor js1 = (JavascriptExecutor)driver;
 		js1.executeScript("javascript:window.scrollBy(250,350);");
 			
 		
 		
 		
 		//* ---------new address --------------*//
//         Select country = new Select(driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-countryCode\"]/span/span")));
//         country.selectByVisibleText("India");
//         driver.findElement(By.name("address-ui-widgets-enterAddressFullName")).sendKeys("saurabh madhavi");
//         driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("8652586420");
//         driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("400701");
//         driver.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("afkjanslnclkansknc");
//         driver.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("afkjanslnclkansknc");
//         driver.findElement(By.id("address-ui-widgets-landmark")).sendKeys("ghansoli Dmart");
//         driver.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("ghansoli");
//         
//         Select state = new Select(driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressStateOrRegion\"]/span/span")));
//         country.selectByValue("MAHARASHTRA");
//         
         
 							//--------------- select address--------//
driver.findElement(By.xpath("//*[@id=\"address-book-entry-0\"]/div[2]/span/a")).click();
 		//driver.findElement(By.name("ppw-instrumentRowSelection")).click();
// 		WebElement radio1 =driver.findElement(By.id("pp-hre45w-106"));
// 		radio1.click();
					//--------rupay radio button--------//
	Thread.sleep(3000);
	driver.findElement(By.name("ppw-instrumentRowSelection")).click();
	driver.findElement(By.id("pp-U7RYt3-116")).sendKeys("123");	
	
	//--------------------another payment methord----------//
        //driver.findElement(By.id("pp-KztFzR-206")).click();
        
        //---------continue with payment------------//
	driver.findElement(By.name("ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")).click();
	
	}

}

