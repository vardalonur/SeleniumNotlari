package d03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class C02_Locators {
    public static void main(String[] args) {
        /*  1- Bir test class’i olusturun ilgili ayarlari yapin
            2- http://zero.webappsecurity.com/ adresine gidin
            3- “ONLINE BANKING” linkine tiklayin
            4- Resim altinda 6 islem basligi oldugunu test edin
            5- Islem basliklari icinde “Pay Bills” oldugunu test edin
            6- Sayfayi kapatin
        */

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver", "KurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2- http://zero.webappsecurity.com/ adresine gidin
        driver.get("http://zero.webappsecurity.com/");

        //3- “ONLINE BANKING” linkine tiklayin
        driver.findElement(By.id("onlineBankingMenu")).click();

        //4-Resim altinda 6 islem basligi oldugunu test edin
        List<WebElement> islemBasliklariList = driver.findElements(By.className("headers"));

        if (islemBasliklariList.size() == 6) {
            System.out.println("başlık testi passed");
        } else {System.out.println("başlık testi failed");}

        //5-Islem basliklari icinde “Pay Bills” oldugunu test edin

            /*
            1.yöntem loop ile tüm webEleemntlerin üzerlerindeki
            yazıları alıp oluşturacağımız String bir listeye koyabilir
            ve contains() ile "Pay Bills" içeriyor mu try {
            test edilebilir
            */

            List<String> islemIsimleriListesi = ReusableMethods.getStringList(islemBasliklariList);
        System.out.println(islemIsimleriListesi);

        if (islemIsimleriListesi.contains("Pay Bills")) {
            System.out.println("pay bills testi passed");
        }else {System.out.println("pay bills testi failed");}
         /*
            2.yöntem, bir flag olıuşturalım ve boolean payBillVarMi=false;
            for each loop ile her webElementin yazısını kontrol edelim
            Pay Bills olan varsa flag'i true yapalım
            loop bitince flag true mu diye test edelim
            */
            boolean payBillsVarMi=false;
            for (WebElement eachElement : islemBasliklariList) {
                if (eachElement.getText().equals("Pay Bills")) {
                    payBillsVarMi=true;
                }
            }
            /*
            loop bittiğinde eğer listede
            pay bills varsa payBillsVarMi = true olur
            yoksa payBillsVarMi = false olur
            bizden isteneni bulmak için bunun true olup olmadığını test etmeliyiz
            */

            if (payBillsVarMi) {
                System.out.println("Pay Bills testi passed");
            }
            else {
                System.out.println("Pay bilss testi failed");
            }


        //6.Sayfayı kapatın

    }
}

