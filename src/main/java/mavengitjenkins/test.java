package mavengitjenkins;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {

	

		
		@Test
		
		public void login(){
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.co.in/");
			
			driver.findElementByCssSelector("input#lst-ib").sendKeys("Kavin",Keys.TAB);
			
		
			driver.findElementByCssSelector("input[value='Google Search']").click();
			
		}

}
