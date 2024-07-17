package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;
import java.util.List;

public class practice {
    public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("https://testotomasyonu.com/relativeLocators");
        //Actions actions = new Actions(driver);
        //actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(3000);

    WebElement canonEOS = driver.findElement(By.id("pic9_thumb"));

    canonEOS.click();

    driver.get("https://testotomasyonu.com/relativeLocators");
        Thread.sleep(3000);

       // actions.sendKeys(Keys.PAGE_DOWN).perform();

    WebElement smartWatch = driver.findElement(By.id("pic10_thumb"));
    WebElement appleWatch = driver.findElement(By.id("pic4_thumb"));
    WebElement infiniteSmart = driver.findElement(By.id("pic14_thumb"));
    WebElement panasonic = driver.findElement(By.id("pic16_thumb"));
    WebElement samsungWatch = driver.findElement(By.id("pic13_thumb"));
    WebElement hpVictus = driver.findElement(By.id("pic12_thumb"));
    WebElement galaxy = driver.findElement(By.id("pic11_thumb"));



    driver.findElement(RelativeLocator.with(By.id("pic9_thumb")).toLeftOf(smartWatch)).click();


    Thread.sleep(3000);
    driver.quit();


    }
}
