package day02_driverMetodlari_WebElement_Locator;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_LocatorVeWebElementKullanimi {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","KurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //testotomasynu.com anasayfaya gidin
        driver.get("https://testotomasyonu.com");


        //arama kutusunu locate edin
            /*id'si global-search olan webelement dediğimizde unique
            değere ulaşıyoruz
            locator olarak By.id() kullanabiliriz.
            locate etme, belirlenen unique adresi ve locator'ı kullanarak
            istenen web elementi içinde bulunduğumuz class'dan kullanılır
            hale getirmektir.
             */
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));


        //arama kutusuna "phone" yazdırın
        aramaKutusu.sendKeys("phone");

        //enter'a basarak aramayı yaptırın

        aramaKutusu.submit();

        //sayfayı kapatın

        driver.quit();

    }
}
