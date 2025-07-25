package TCS_sampleone;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amzon_maven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.in/");
		//dr.get("https://www.myntra.com/");
		dr.manage().window().maximize();
	}
}
