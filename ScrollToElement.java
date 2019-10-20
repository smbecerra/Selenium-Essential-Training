import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/sebastianbecerra/Desktop/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Action(driver) {
            @Override
            public void perform() {

            }
        };
        actions.moveToElement(name);
        name.sendKeys(("Sebastian Becerra"));

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("09-09-2021");

        driver.quit();
    }
}
