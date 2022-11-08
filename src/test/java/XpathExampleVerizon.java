import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExampleVerizon {
    @Test
    public void openHomePageCheck() {
        System.setProperty("webdriver.chrom.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.verizon.com/smartphones/");

        By.id("element-id");
        By.name("input-filed-name");

        By.xpath("//*[@id ='gnav20-eyebrow-link-Business']");

        By.xpath("//*[@id='gnav20-Shop-L1']");


    }
}
