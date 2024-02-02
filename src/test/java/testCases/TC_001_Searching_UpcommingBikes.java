package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import testBase.BaseClass;

public class TC_001_Searching_UpcommingBikes extends BaseClass{

@Test(priority=1, groups={"regression","masters"})
   public void searchUpcommingBikes() throws IOException, InterruptedException  {
		HomePage ob=new HomePage(driver);
		
	    //loger.debug("application logs...");
		
	    loger.info("Hovering to NewBikes");
		ob.HoverNewBikes();
	    
		loger.info("Clicking on Upcomming Bikes");
		ob.clickUpcommingBikes();
	
}

}
