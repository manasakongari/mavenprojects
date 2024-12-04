package mavenproject.mavenproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo10selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.google.com/";
		Driver.get(url);
		String expectedtitle="Google";
		String actualTitle = Driver.getTitle();
		if(actualTitle.equals(expectedtitle))
		{
			System.out.println("title is matched");
		}
		else
		{
			System.out.println("not matched");
		}

	}

}
