package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class authentificationtest {

	public static void main(String[] args) throws InterruptedException {
		// intialisation de chemin chrome
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		// ouverture navigateur chrome
		WebDriver driver=new ChromeDriver();
		//a grandir la fenetre de navigateur
		driver.manage().window().maximize();
		//ouverture de lien
		driver.get("https://www.facebook.com/");
		//pour eviter le temps de reponse 
		Thread.sleep(5000);
		//declaration des webelement
		WebElement user,pass,bouton;
		
	    user=driver.findElement(By.id("email"));
	    user.sendKeys("bewael@hotmail.fr");
	    pass=driver.findElement(By.id("pass"));
	    pass.sendKeys("chahdouda04032015");
	    bouton=driver.findElement(By.name("login"));
	    bouton.click();

	}

}
