package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginmail {

	public static void main(String[] args) throws InterruptedException {
		// intialisation de chemin chrome
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		// ouverture navigateur chrome
		WebDriver driver=new ChromeDriver();
		//a grandir la fenetre de navigateur
		driver.manage().window().maximize();
		//ouverture de lien
		driver.get("https://www.google.com/");
		//pour eviter le temps de reponse 
		Thread.sleep(5000);
		//declaration des webelement
		WebElement labelrecherche;
		
	    labelrecherche=driver.findElement(By.id("APjFqb"));
	    labelrecherche.sendKeys("cours istqb grauit");
	    WebElement Bouton = driver.findElement(By.name("btnK"));
	    //WebElement searchButton = driver.findElement(By.name("btnK"));
	    //bouton.click();
	   // labelrecherche.submit();
		Thread.sleep(5000);

	      Bouton.click();

	}

}
