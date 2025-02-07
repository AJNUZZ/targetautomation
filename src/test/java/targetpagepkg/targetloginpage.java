package targetpagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class targetloginpage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"account-sign-in\"]/span")
	WebElement siginin;
	@FindBy(xpath="/html/body/div[9]/div/div/div[2]/ul/div/button[1]")
	WebElement sigininbutton;
	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"login\"]/span")
	WebElement loginbutton;
	{
		
	}
	public targetloginpage(WebDriver driver) {
    	this.driver=driver;
		PageFactory.initElements(driver, this);
    }


public void signin() {
	siginin.click();
}
public void siginbutton() {
	sigininbutton.click();
}
public void inputs() {
	email.sendKeys("muhammedzameel@gmail.com");
	password.sendKeys("zameel@007");
}
public void loginbutton() {
	loginbutton.click();
}
}