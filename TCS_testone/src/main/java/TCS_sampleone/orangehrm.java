package TCS_sampleone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		WebElement user=dr.findElement(By.name("username"));
		user.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement pass=dr.findElement(By.name("password"));
		pass.sendKeys("admin123");
		/*WebElement button=dr.findElement(By.xpath("//button[@type='submit']"));
		button.click();*/
		dr.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
