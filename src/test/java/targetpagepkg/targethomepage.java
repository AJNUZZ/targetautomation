package targetpagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class targethomepage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"account-sign-in\"]/span")
    WebElement signinbutton;
	@FindBy(xpath="/html/body/div[9]/div/div/div[2]/ul/div/button[2]")
	WebElement createaccountbutton;
	@FindBy(xpath="//*[@id='username']")
	WebElement emailfield;
	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement firstname;
	@FindBy(xpath="//*[@id=\"lastname\"]")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"__next\"]/div/div/div/div[1]/div/div[2]/form/div[6]/div[2]/label")
	WebElement radiobutton;
	@FindBy(xpath="//*[@id=\"createAccount\"]")
	WebElement create;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement passkey;
	@FindBy(xpath="//*[@id=\"keepMeSignedIn\"]")
	WebElement checkboxsignin;
	  public targethomepage(WebDriver driver) {
	    	this.driver=driver;
			PageFactory.initElements(driver, this);
	    }
	  public void signin() {
		  signinbutton.click();
		  
	  }
	  public void createaccount() {
		  
		  createaccountbutton.click();
		  
	  }
	  public void inputs() {
		  System.out.println("in");
		  emailfield.sendKeys("muhammedzameel@gmail.com");
		  firstname.sendKeys("muhammed");
		  lastname.sendKeys("zameen");
	  }
	  public void radiobutton() {
		  if (!radiobutton.isSelected()) {
	            radiobutton.click();
		  }
		
		  }
	  public void password() {
		  passkey.sendKeys("zameel@007");
	  }
	  public void checkbox() {
		  checkboxsignin.click();
	  }

		  public void createbutton(){
			  create.click();
		  
	
	
	
}
}

