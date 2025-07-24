package TCS_sampleone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium_navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);		
		WebElement search_box=driver.findElement(By.id("twotabsearchtextbox"));
		search_box.sendKeys("iphone");		
		WebElement search_icon=driver.findElement(By.id("nav-search-submit-button"));
		search_icon.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//driver.close();
		driver.manage().window().minimize();
		//driver.quit();
	}

}
