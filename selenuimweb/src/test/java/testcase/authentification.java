package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class authentification {

	public static void main(String[] args) throws InterruptedException {
		// chemin de chrome driver(path)
				System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
				// ouverture chrome
				WebDriver driver=new ChromeDriver();
				// maximiser la fenetre
				driver.manage().window().maximize();
				//ouvrir url
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				//pause de 5 secondes pour eviter le temps de reponse 
				Thread.sleep(5000);
				//declaration des webelements
				WebElement user,pass; 
				//intialisation de user 
				user =driver.findElement(By.name("username"));
				//action ecrire admin dans  la cellule admin
				user.sendKeys("Admin");
				//intialisation de pass
				pass=driver.findElement(By.name("password"));
				//action ecrire 
				pass.sendKeys("admin123");
				//identification boutton avec xpath a partir d'inspectcer
				WebElement bouton;
				
				bouton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
				bouton.click();
				Thread.sleep(5000);
				WebElement profil;
				profil=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
	            String text;
	            text=profil.getText();
	            Assert.assertEquals("Paul Collings", text);
	            System.out.println("test ok");
	}

}
