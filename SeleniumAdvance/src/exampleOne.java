import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleOne {

	public static void main(String[] args) {
		System.out.println("Selenium Advance");
		System.setProperty("webdriver.chrome.driver", "C:/Users/HP/Downloads/selenium-java-3.141.59/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.co.in/");
	}
	
}
