package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {

    //Her açtığımız class'da ilk işimiz WebDriver objesi oluşturmak olmalı

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","KurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getWindowHandle());
        /* 8568EF75E781AF8B1F1D050372F81776
         3774329B3AFAA6C80368E1ABEA0707F4
         Selenium WebDriver açtığı her browser için benzersiz bir handle
         değeri üretir. Eğer testimiz çalışırken driver objesi ile birden
         fazla pencere açıldı ise bu pencereler arasında geçişi
         windowHandle değerleri ile yapabiliriz.
         */
        System.out.println(driver.getWindowHandles());



        Thread.sleep(500);
        driver.quit();
    }
}
