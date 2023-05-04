package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateur {

	public static void main(String[] args) {
		// chemin de chrome driver(path)
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		// ouverture chrome
		WebDriver driver=new ChromeDriver();
		// maximiser la fenetre
		driver.manage().window().maximize();
		//ouvrir url
		driver.get("https://www.google.com/");
		// 2eme methode ouvir url 
		//delete cookies
		//driver.manage().deleteAllCookies();
		//driver.navigate().to("https://www.youtube.com/");

	}

}
