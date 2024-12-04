package mavenproject.mavenproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.google.com/";
		Driver.get(url);
		String title = Driver.getTitle();
		System.out.println(title);

	}

}
