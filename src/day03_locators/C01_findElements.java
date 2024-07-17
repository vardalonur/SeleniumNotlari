package d03_locators;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_findElements {
    public static void main(String[] args) throws InterruptedException {
        /*
        testotpmasyonu anasayfaya gidin
        phone için arama yapın
        arama sonucunda urun bulunabildiğini test edin
        bulunan tüm ürünlerin isimlerini yazdırın
        ilk ürünü tıklayın
        ilk ürün sayfasında, ürün isminde case sensitive olmadan "phone"
        bulunduğunu test edin
         */

        //System.setProperty("webdriver.chrome.driver","KurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //testotpmasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        //phone için arama yapın
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone"+ Keys.ENTER);

        //arama sonucunda urun bulunabildiğini test edin
        /*
        By.className kullanıldığında
        Eğer class attribute'unun value'su space içeriyorsa (bu birden fazla class anlamına gelir)
        By.classname çalışmayabilir
         */
        List<WebElement> bulunanUrunElementleriList = driver.findElements(By.className("prod-img"));
        if (bulunanUrunElementleriList.size()>0) {
            System.out.println("ürün sayısı testi passed");
        }else System.out.println("ürün sayısı testi failed");

        //bulunan tüm ürünlerin isimlerini yazdırın

        //System.out.println(bulunanUrunElementleriList);

        /*
        findelements() bize web elementlerden oluşan bir liste getirir
        bu listeyi yazdırmak istediğimizde direkt yazdırırsak, liste
        webElementlerden oluştuğundan referanslarını yazdırır
        eğer her bir webelement'in üzerindeki text'i almak istersek
        her elemanı tek tek ele alıp getText() ile üzerindeki yazıyı
        kullanabiliriz.
         */

        for (WebElement eachElement : bulunanUrunElementleriList) {
            System.out.println(eachElement.getText());

            /*
            Her webElement yazı içermeyebilir
            ürün ismini içeren webElement'lerin class attribute değerleri
            space içerdiğinde bu maddeyi xPath ile yapmak üzere şimdilik
            pass geçiyoruz
             */

            // ilk ürünü seçiyoruz
            // tüm ürünleri liste olarak kaydettirdiğimiz için
            // listedeki ilk ürüne tıklamamız yeterli olacaktır

            bulunanUrunElementleriList.get(0).click();

            Thread.sleep(2000);
            driver.quit();


        }
    }
}
