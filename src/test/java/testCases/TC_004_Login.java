package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.HondaBikes;
import pageObject.Login;
//import pageObject.LoginTest;
import pageObject.UsedCars;

public class TC_004_Login extends TC_003_UsedCars {
@Test(priority=4, groups={"sanity","masters"})
public void login() throws InterruptedException, IOException {
	
	Login o= new Login(driver);
		
		loger.info("Clicking on login button and switching to google Window");
		String s=o.login();
		
		loger.info("Clicking on google option");
		o.google(s);
		
		loger.info("Passing wrong email address to email box");
		String s1=p.getProperty("email");
		o.email(s1);
		
		loger.info("Capturing the error message and printing on consol");
		o.mssg();
		

		
	}
}
