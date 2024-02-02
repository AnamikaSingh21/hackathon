package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import utilities.Apachi;
import pageObject.HomePage;
import pageObject.HondaBikes;
import pageObject.UsedCars;



public class TC_003_UsedCars extends TC_002_Search_Honda {
	@Test(priority=3, groups={"regression","masters"})
	public void usedCars() throws InterruptedException, IOException {
	
		UsedCars obj2= new UsedCars(driver);
		
		//obj2.switchWindow();
		loger.info("Hivering to Usedcars option");
		obj2.HoverUsedCars();
		
		loger.info("Clicking on chennai option from the usedcars");
		obj2.clickChennai();
		
		loger.info("Displaying all the Bikes from popularModels");
		obj2.displayPopularModel();
		
		loger.info("Navigating back to homepage");
		obj2.navigateToHomePage();
		
		Thread.sleep(5000);
		
	}
}



