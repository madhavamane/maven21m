package com.projectname.qa.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {
 
	 //-----------------------Java script methode---------------------------
		//1.Drawing Border around element
		public static void BorderbyJs(WebDriver driver,WebElement element) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'",element);
		}
		//2.Capture title of webpage
		public static String TitlebyJs(WebDriver driver) {
	    JavascriptExecutor js=((JavascriptExecutor)driver);
	    String Title = js.executeScript("return document.title").toString();
	    return Title;
		}
		//3.Click on some element
		public static void ClickbyJs(WebDriver driver,WebElement Element) {
		JavascriptExecutor js=((JavascriptExecutor)driver);	
		js.executeScript("arguments[0].click();",Element);
		}
		//4.Generate alert
		public static void AlertbyJs(WebDriver driver,String message) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
		}
		//5.Refresh webpage
		public static void refreshbyJs(WebDriver driver) {
	    JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
		}
		//6.scroll page
		public static void scrollbyJs(WebDriver driver,int x,int y) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("scroll("+x+","+y+")");
		}
		//7.scroll into view
		public static void scrollintoview(WebDriver driver,WebElement element) {
	    JavascriptExecutor js=((JavascriptExecutor)driver);	
	    js.executeScript("arguments[0].scrollIntoView(true);",element);
		}
		//-----------------------Take Screenshot--------------------------------------
		public static void getscreenshot(WebDriver driver) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		Date d=new Date();	
		System.out.println(d);	
		String filename = d.toString().replace(" ","_").replace(":","_")+".jpg";
		File dest=new File("C:\\Users\\madha\\Desktop\\Screenshot selenium\\drama_"+filename);
		FileUtils.copyFile(src, dest);
		}
		//---------------------------Handle Basic Excel---------------------------------
		public static void getexceldata(int x,int y) throws EncryptedDocumentException, IOException {
			FileInputStream file=new FileInputStream("");
	        String value = WorkbookFactory.create(file).getSheet("TestData").getRow(x).getCell(y).getStringCellValue();
	        System.out.println(value);	
		}	
}
