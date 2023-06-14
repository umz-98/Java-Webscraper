import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Java_scraper {
    public static void main(String[] args) throws Exception {
        //System.setProperty("webdriver.chrome.driver", "/Users/FKhan/Downloads/miniconda3/chromedriver.exe");
        //Users/FKhan/Documents/Aicore/Java_webscraper/Scraper/src/
        System.out.println("k.");
        //ChromeDriver driver = new ChromeDriver();E:\\
        //IwebDriver driver = new ChromeDriver("chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver(chromeOptions);
        //WebDriver driver = new ChromeDriver();
        //new WebDriverWait(driver, Duration.ofSeconds(10));
        //driver.manage().window().maximize();
        
        driver.get("https://www.gucci.com/uk/en_gb/");
        driver.quit();
        //driver.navigate().to("https://www.gucci.com/uk/en_gb/");
        //driver.close();

    }
}