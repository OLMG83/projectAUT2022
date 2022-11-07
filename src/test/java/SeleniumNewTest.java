import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNewTest {
    @Test
    public void openHomePageCheck() {
        System.setProperty("webdriver.chrom.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://www.discovercars.com/");

        By.id("element-id");
        By.name("input-filed-name");
        By.xpath(".//img[@alt='Best car hire prices from Discover Cars']");

        By.xpath(".//div [@class='home-caption']");

        By.xpath("//*[@id=\"pick-date-ui\"]");

        By.xpath(".//span[@class='sb-residence-text']");

        By.xpath(".//button[@id='location-submit']");

        By.xpath(".//div[@class= 'tp-widget-review']");

        By.xpath("//*[@id='currentCurrency']");

        By.xpath(".//a[@data-label= 'Navigation']");

        By.xpath("//*[@id= 'location-submit']");
    }
}

