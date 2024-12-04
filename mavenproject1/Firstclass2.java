package mavenproject.mavenproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String url = "https://www.selenium.dev/";
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.selenium.dev/");
		driver.navigate().back();
				

	}

}
