package targettestpkg;

import targetbasepkg.targetload;
import targetpagepkg.targetloginpage;

public class logintest extends targetload {
	public void urlverification() {
		targetloginpage p2= new targetloginpage(driver);

		
		p2.signin();
	
		p2.siginbutton();
		
		String currenturl=driver.getCurrentUrl();
		String expectedurl=("https://www.target.com/login?client_id=ecom-web-1.0.0&ui_namespace=ui-default&back_button_action=browser&keep_me_signed_in=true&kmsi_default=false&actions=create_session_signin");
		if(currenturl.equals(expectedurl))
		{
			System.out.println("url verified");
		}
		else
		{
			System.out.println("url is incorrect:");
		}
	
p2.inputs();
p2.loginbutton();
}
}
