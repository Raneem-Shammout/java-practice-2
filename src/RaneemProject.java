import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RaneemProject {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\my new driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/index.html");
		driver.findElement(By.id("label-one")).getText();
		System.out.println(driver.findElement(By.id("label-one")).getText().toUpperCase());

		driver.findElement(By.id("email-input")).sendKeys("rneem.shammout@hotmail.com");
		driver.findElement(By.id("password-input")).sendKeys("rneem");
		driver.findElement(By.id("date-input")).sendKeys("11/29/1999");
		driver.findElement(By.id("mobile-input")).sendKeys("+962772380833");
		driver.findElement(By.tagName("button")).click();
	}

}
