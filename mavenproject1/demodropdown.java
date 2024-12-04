package mavenproject.mavenproject1;

import org.bouncycastle.util.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demodropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.orangehrm.com/en/book-a-free-demo/";
		Driver.get(url);
		String title = Driver.getTitle();
		Select dropdowncountry = new Select(Driver.findElement(By.id("Form_getForm_Country")));
		dropdowncountry.selectByValue("United States");

	}

}
