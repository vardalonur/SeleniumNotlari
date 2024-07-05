package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkOtomasyon {

    public static void main(String[] args) throws InterruptedException {

                /*
            kurulum dosyalarini proje altina kopyalamak
            selenium ve chromedriver'i projeye eklemek icin yeterli degildir

            Selenium'u kurmak icin
            jar dosyalarini olusturdugumuz her projede bir kez
            projeye eklemeliyiz

            chromedriver.exe ise
            her class'da WebDriver objesi olusturulurken kullanilir
         */

        /*
            Selenium bizim istedigimiz tum otomasyonlari
            olusturacagimiz WebDriver objesi ile yapar

            Selenium ile bir otomasyon yapilacaksa
            once WebDriver objesi olusturulmalidir
         */


        System.setProperty("Webdriver.chrome.driver","KurulumDosyalari/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //WebDriver driver2 = new ChromeDriver(); //Oluşturacağımız yeni objeler farklı pencereler olarak çalışacaktır.
        //WebDriver driver3 = new ChromeDriver();

        //driver.get("https://www.testotomasyonu.com");
        //driver.get("testotomasyonu.com"); //gitmez
        //driver.get("www.testotomasyonu.com"); //gitmez
        //driver.get("https://www.testotomasyonu.com"); //gider
        //driver.get("http://testotomasyonu.com"); //gider
        driver.get("https://www.testotomasyonu.com"); //gider
        //başında https:// ya da http:// olmalı

        Thread.sleep(3000); //throws ile not edilmediği sürece "InterruptedException" fırlatacaktır.

        //driver.close();
        //driver oluşturulurken açılan pencereyi kapatır.
        driver.quit();
        //driver çalıştığı müddetçe açılan tüm pencereleri kapatır.
    }
}
