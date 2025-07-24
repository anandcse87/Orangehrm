package TCS_sampleone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium_select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement All_dropdown_list=driver.findElement(By.id("searchDropdownBox"));
		All_dropdown_list.click();
		Select select_things=new Select(All_dropdown_list);
		Thread.sleep(2000);
		//select_things.selectByVisibleText("Music");
		select_things.selectByIndex(30);
		All_dropdown_list.click();
		Thread.sleep(2000);
		All_dropdown_list.submit();	
	}

}
