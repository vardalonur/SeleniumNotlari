package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {

    //Her açtığımız class'da ilk işimiz WebDriver objesi oluşturmak olmalı

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","KurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");
        System.out.println(driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getWindowHandle());
        /*
         Selenium WebDriver açtığı her browser için benzersiz bir handle
         değeri üretir. Eğer testimiz çalışırken driver objesi ile birden
         fazla pencere açıldı ise bu pencereler arasında geçişi
         windowHandle değerleri ile yapabiliriz.
         */
        System.out.println(driver.getWindowHandles());



        Thread.sleep(500);
        //driver.quit();
    }
}
