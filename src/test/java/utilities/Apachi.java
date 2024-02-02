package utilities;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class Apachi {
	      
		static List<String>BikesName;
		static List<String>BikesPrice;
		static List<String>BikesLaunch;
		static List<WebElement>PopularModel;
		WebDriver driver;
		public Apachi(WebDriver driver, List<String> BikesName, List<String>BikesPrice, List<String>BikesLaunch, List<WebElement>PopularModel) {
			this.driver=driver;
			this.BikesName=BikesName;
			this.BikesPrice=BikesPrice;
			this.BikesLaunch=BikesLaunch;
			this.PopularModel=PopularModel;
			
		}
		
	 
		//Writing data in excel file
		public void writeData() throws IOException {
		 
		 FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\src/main/resources\\testdat.xlsx");
		 
		 
		 XSSFWorkbook workbook = new XSSFWorkbook();
		 
		 
		 XSSFSheet sheet1 = workbook.createSheet();
		 {
			 for(int i=0; i<BikesName.size(); i++) {
			XSSFRow row = sheet1.createRow(i);
			for(int j=0; j<3; j++) {
				XSSFCell cell=row.createCell(j);
			
				if(j==0) {
					cell.setCellValue(BikesName.get(i));	
				}
				
				else if(j==1) {
				
					cell.setCellValue(BikesPrice.get(i));
				}
				
				else {
					cell.setCellValue(BikesLaunch.get(i));
				}
			}
			
		}
			 
	    XSSFSheet sheet2= workbook.createSheet();
	    
	    for(int i=0; i<PopularModel.size(); i++) {
			XSSFRow row = sheet2.createRow(i);
			String s=PopularModel.get(i).getText();
			XSSFCell cell=row.createCell(0);
			cell.setCellValue(s);
			
		}
	    
		 workbook.write(file);
		 workbook.close();
		 file.close();
		 
	}
	  }


		
	     }


		






