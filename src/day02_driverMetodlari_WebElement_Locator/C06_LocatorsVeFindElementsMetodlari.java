package day02_driverMetodlari_WebElement_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class C06_Locators {
    public static void main(String[] args) {





// arama sonucunda 3'den fazla urun bulunabildigini test edin

// sayfayi kapatin

        System.setProperty("webdriver.chrome.driver","KurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com/");

        // arama kutusuna phone yazip aratin
        // aşama aşama yazmak daha anlaşılır olabilir fakat istersek
        // aşağıdaki gibi tek seferde de yazabiliriz
        driver.findElement(By.id("global-search"))
                .sendKeys("phone" + Keys.ENTER);

        //arama sonucunda 3'den fazla ürün bulunabildiğini test edin
            /*1.yöntem arama sonuç yazısı olan "4 products found" yazısındaki
            4'ü sayı olarak kaydedip, 3'ten büyük olduğunu test edelim
            */
        WebElement aramaSonucElementi =
                driver.findElement(By.className("product-count-text"));

        //System.out.println(aramaSonucElementi.getText());

        String aramaSonucYazisi = aramaSonucElementi.getText(); //"4 Products Found"

        aramaSonucYazisi = aramaSonucYazisi.replaceAll("\\D",""); //4

        int actualAramaSonucSayisi = Integer.parseInt(aramaSonucYazisi);
        int expectedMinSonucSayisi = 3;

        if (actualAramaSonucSayisi>expectedMinSonucSayisi) {
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");


        //2.Yöntem: bulunan ürünleri bir liste olarak kaydedip
        //listenin size'inin 3'ten büyük olduğunu test edebiliriz



        driver.quit();
    }

}
