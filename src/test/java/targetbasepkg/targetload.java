package targetbasepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class targetload {
	public static WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		
	}

		
	}


