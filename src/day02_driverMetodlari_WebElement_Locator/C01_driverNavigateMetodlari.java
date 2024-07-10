package day02_driverMetodlari_WebElement_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverNavigateMetodlari {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("WebDriver.chrome.driver","KurulumDosyalari/chromedriver.exe");

        /*
         9.satırın görevi, bilgisayarımızda fiziki olarak kullandığımız
         chrome versionuna uygun selenium.dev sitesinden
         indirdiğimiz ve kopya browser oluşturmamızı sağlayan
         chromedriver.exe dosyasını class'ımıza tanıtmaktır.

         Selenium 4.00 versionu ile kütüphanelerine tüm güncel
         browser'lara ait driver'ları yükledi.
         Böylece bir class oluşturduğumuzda:
         -Biz istersek kendi driver'ımızı 9.satırı kullanarak tanıtabilir
         veya istersek 9.satırı atlayıp selenium'un kendi driver'ını
         kullanabiliriz
        */

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        driver.navigate().to("https://www.google.com");
        //26. ve 28. satır işlev açısından aynıdır
        Thread.sleep(2000);

        //Tekrar testotomasyona dönün

        driver.navigate().back();

        Thread.sleep(2000);

        //bir daha google'a gidelim
        driver.navigate().forward();

        Thread.sleep(2000);

        //Sayfayı yenileyelim
        driver.navigate().refresh();

        Thread.sleep(2000);
        driver.quit();
    }
}
