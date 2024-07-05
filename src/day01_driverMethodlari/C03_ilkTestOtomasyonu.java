package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ilkTestOtomasyonu {
    public static void main(String[] args) {
/*   1. test otomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
     2. Sayfa basligini(title) yazdirin
     3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin
     4. Sayfa adresini(url) yazdirin
     5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.
     6. Sayfa handle degerini yazdirin
     7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
     8. Sayfayi kapatin.

*/

        System.setProperty("Webdriver.chrome.driver","KurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com");
        //     2. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        //     3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin
        String expectedTitleIcerik = "Test Otomasyonu";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("TITLE TEST PASSED");
        }else System.out.println("TITLE TEST FAILED");

        //4. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        //5. Sayfa url’inin https://testotomasyonu.com oldugunu test edin.
        String expectedURL = "https://testotomasyonu.com";
        String actualURL = driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)) {
            System.out.println("URL TEST PASSED");
        }else System.out.println("URL TEST FAILED");

        //     6. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //     7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
        String expectedHTMLContent = "otomasyon";
        String actualPageSource = driver.getPageSource();

        if (expectedHTMLContent.equals(actualPageSource)) {
            System.out.println("PAGE SOURCE TEST PASSED");
        }else System.out.println("PAGE SOURCE TEST FAILED");

        //      8. Sayfayi kapatin.
        driver.quit();
    }
}
