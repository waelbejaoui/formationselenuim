package testcase;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Actualitéyoutube {

	 
		public static void main(String[] args) throws InterruptedException {
			// chemin de chrome driver(path)
					System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
					// ouverture chrome
					WebDriver driver=new ChromeDriver();
					// maximiser la fenetre
					driver.manage().window().maximize();
					//ouvrir url
					driver.get("https://www.youtube.com/");
					//pause de 5 secondes pour eviter le temps de reponse 
					Thread.sleep(5000);
					//declaration des webelements
					WebElement recherche; 
					//intialisation 
					recherche =driver.findElement(By.name("search_query"));
					//action ecrire tunsie
					recherche.sendKeys("tunisie");
					
					//identification boutton avec xpath a partir d'inspectcer
					WebElement bouton;
					
					bouton = driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon"));
					bouton.click();
					//assert
					Thread.sleep(5000);

					String URL;
					URL=driver.getCurrentUrl();
					Assert.assertEquals("https://www.youtube.com/results?search_query=tunisie", URL);
		            System.out.println("test ok");
		            driver.close();
		}



	}


