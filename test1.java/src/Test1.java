import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.webdriver.support.select;

public class Test1 {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.id("APjFqb")).sendKeys("opica");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        driver.findElement(By.linkText("Slike")).click();

        List<WebElement> dynamicElement = driver
                .findElements(By.xpath("//*[@id=\"islrg\"]/div[1]/div[1]/a[1]/div[1]/img"));
        if (dynamicElement.size() != 0) {
            System.out.println("Test passed.");
        } else {
            System.out.println("Test failed");
        }

        driver.quit();
    }

}
