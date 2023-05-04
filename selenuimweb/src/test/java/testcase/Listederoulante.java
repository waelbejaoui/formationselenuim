package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listederoulante {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://demoqa.com/select-menu");
        WebElement liste;
        liste=driver.findElement(By.id("oldSelectMenu"));
        Select listeD=new Select(liste);
        listeD.selectByValue("5");
       // Select listeDD =new Select(liste);
        //listeDD.selectByValue("8");
        System.out.println("test ok");
        driver.close();
        }

}
