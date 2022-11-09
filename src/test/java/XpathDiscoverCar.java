import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDiscoverCar {
    @Test
    public void openHomePageCheck() {
        System.setProperty("webdriver.chrom.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://www.discovercars.com/");

        By.id("element-id");
        By.name("input-filed-name");
        By.xpath(".//img[@alt='Best car hire prices from Discover Cars']");

        By.xpath(".//div [@class='home-caption']");

        By.xpath("//*[@id='pick-date-ui']");

        By.xpath(".//span[@class='sb-residence-text']");

        By.xpath(".//button[@id='location-submit']");

        By.xpath(".//div[@class= 'tp-widget-review']");

        By.xpath("//*[@id='currentCurrency']");

        By.xpath(".//a[@data-label= 'Navigation']");

        By.xpath("//*[@id= 'location-submit']");

        By.xpath(".//div[@class='img small']");

        By.xpath(".//span[@class='category-label trend']");

        By.xpath(".//span[@class='min-price']");

        By.xpath(".//label[@for='fuel-type-ft-V']");

        By.xpath(".//label[@for='number-of-seats-seats-4']");

        By.xpath(".//a[@data-id='48-3BBG']");

        By.xpath(".//span[@aria-describedby='qtip-29']");

        By.xpath(".//div[@class='price-item-price-main']");

        By.xpath(".//div[@/div='$0']");

        By.xpath(".//div[@class='mb-8 text-24 text-bold text-center']");

        By.xpath(".//div[@class='mb-24 text-center']");


    }
}

