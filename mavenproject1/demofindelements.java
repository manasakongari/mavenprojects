package mavenproject.mavenproject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;		

public class demofindelements {

	public static void main(String[] args) {
		
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.orangehrm.com/en/book-a-free-demo";
		Driver.get(url);
		List<WebElement> list = Driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0; i<=list.size(); i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		// TODO Auto-generated method stub

	}

}
