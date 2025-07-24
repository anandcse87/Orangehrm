package TCS_sampleone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("accept")).click();
		Alert simple_alert=driver.switchTo().alert();
		String text1=simple_alert.getText();
		System.out.println(text1);
		Thread.sleep(2000);
		simple_alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.id("confirm")).click();
		Alert confirm_alert=driver.switchTo().alert();
		String text2=confirm_alert.getText();
		System.out.println(text2);
		Thread.sleep(2000);
		confirm_alert.accept();
		//confirm_alert.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.id("prompt")).click();
		Alert prompt_alert=driver.switchTo().alert();
		Thread.sleep(2000);		
		prompt_alert.sendKeys("java selenium");
		Thread.sleep(5000);
		prompt_alert.accept();
	}

}
