package day02_driverMetodlari_WebElement_Locator;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.LocalTime;

public class C02_DriverManageWindowMetodlari {
    public static void main(String[] args) throws InterruptedException {


        LocalTime localTime1 = LocalTime.now();
        long baslangicSaniye = localTime1.toSecondOfDay();

        System.setProperty("Webdriver.chrome.driver","KurulumDosyalari/chromedriver1");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://www.testotomasyonu.com/");

        System.out.println("Maximize size: "+ driver.manage().window().getSize());
        System.out.println("Maximize konum: "+driver.manage().window().getPosition());

        //Fullscreen için
        driver.manage().window().fullscreen();
        System.out.println("Maximize size: "+ driver.manage().window().getSize());
        System.out.println("Maximize konum: "+driver.manage().window().getPosition());

        //konumu (200,200) ve boyutu da (800,500) yapın

        driver.manage().window().setPosition(new Point(200,200));
        driver.manage().window().setSize(new Dimension(800,500));
        System.out.println("Özel boyut size: "+driver.manage().window().getSize());
        System.out.println("Özel boyut konum: "+driver.manage().window().getPosition());
        Thread.sleep(2000);
        driver.quit();

        LocalTime localTime2 =LocalTime.now();
        long bitisSaniye = localTime2.toSecondOfDay();

        System.out.println("Süre: " + (bitisSaniye -baslangicSaniye));
    }
}
