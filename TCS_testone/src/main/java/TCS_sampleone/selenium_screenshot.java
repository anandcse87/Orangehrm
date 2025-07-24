package TCS_sampleone;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://letcode.in/alert");
		driver.get("https://www.amazon.in/");
		//driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		File screen_shot=driver.getScreenshotAs(OutputType.FILE);
		File saved_img=new File("./screen_shot/save_img.png");
		//File saved_img=new File("./screen_shot/test_file.png");
		FileHandler.copy(screen_shot, saved_img);

	}

}
