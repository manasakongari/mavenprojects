package mavenproject.mavenproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.selenium.dev/";
		Driver.get(url);
		String title = Driver.getTitle();
		System.out.println(title);
		

	}

}
