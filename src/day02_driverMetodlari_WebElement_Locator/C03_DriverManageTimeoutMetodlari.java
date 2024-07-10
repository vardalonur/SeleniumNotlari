package day02_driverMetodlari_WebElement_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManageTimeoutMetodlari {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","KurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*
        Thread.sleep() java'dan gelir
        ve kodların çalışmasını bizim belirlediğimiz müddetçe durdurur.

        Testi ilk defa yazarken test adımlarını daha rahat görebilmek
        veya bir sunum yaptığımızda sunum yaptığımız kişilere adımları
        gösterebilmemiz açısından kullanımı uygundur.

        Bazen de bilgisyarımızın veya internetin hızından dolayı kodlar
        hızlı ilerlediğinde istediğimiz adımları gerçekleştiremeyebiliriz
        bu durumda mecbur kalırsak Thread.sleep kullanabiliriz.

        Eğer testi hazırlamayı bitirdik ve hız açısından da beklemeyi mecbur
        kılan bir durum yoksa Thread.sleep'leri silmekte fayda vardır.
         */

        /*
        implicitlyWait farklı olarak göreve dayalı beklemeyi yapar.
        biz 10 saniye tanımladığımızda görevi yapmak için max 10sn
        bekler, daha erken biterse yoluna devam eder. 10sn'nin dolmasını
        beklemez.
        Ancak, 10sn dolmasına rağmen görev bitmediyse exception fırlatır
        ve çalışmayı durdurur.

        implicitlyWait iki temel görev için bekleme yapar
        1- Sayfanın açılıp ögelerin yüklenmesi
        2- Herhangi bir web ögesini kullanmamız gerektiğinde o ögeyi bulmak

         */

        driver.quit();
    }
}
