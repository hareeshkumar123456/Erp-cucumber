package CommonFunctions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class FunctionLibrary {
	public static Properties conpro;
	public static WebDriver driver;
	//method for launching the browser
	public static WebDriver startBrowser()throws Throwable
	{
		conpro = new Properties();
		//load property file
		conpro.load(new FileInputStream("./PropertyFiles/Environment.properties"));
		if (conpro.getProperty("Browser").equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (conpro.getProperty("Browser").equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else {
			Reporter.log("browser value is not matching");
		}
		return driver;
	}
	//method for launching Url
	public static void openUrl()
	{
		driver.get(conpro.getProperty("Url"));
	}
	//method for wait for any webelement
	public static void waitforelement(String LocatorType,String LocatorValue, String MyWait)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(Integer.parseInt(MyWait)));
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			//wait until element is visible
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocatorValue)));
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(LocatorValue)));
		}
		if(LocatorType.equalsIgnoreCase("id"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(LocatorValue)));
		}
	}
	//methods for buttons,radiobutton,checkbox and images
	public static void clickAction(String LocatorType,String Locatorvalue)
	{
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(Locatorvalue)).click();
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			driver.findElement(By.xpath(Locatorvalue)).click();
		}
		if(LocatorType.equalsIgnoreCase("id"))
		{
			driver.findElement(By.xpath(Locatorvalue)).sendKeys(Keys.ENTER);
		}
	}
	//method for any testbox
	public static void typeaction(String LocatorType, String LocatorValue,String TestData)
	{
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(LocatorValue)).clear();
			driver.findElement(By.xpath(LocatorValue)).sendKeys(TestData);
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(LocatorValue)).clear();
			driver.findElement(By.name(LocatorValue)).sendKeys(TestData);
		}
		if(LocatorType.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(LocatorValue)).clear();
			driver.findElement(By.id(LocatorValue)).sendKeys(TestData);
		}
	}
	//method for validate title
	public static void validatetitle(String Expected_Title)
	{
		String Actual_Title = driver.getTitle();
		try {
			Assert.assertEquals(Actual_Title, Expected_Title, "title is not matching");
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}
	//method for close browser
	public static void closeBrowser()
	{
		driver.quit();
	}
	//method for capture supplier number into notepad
	public static void capturesup(String LocatorType,String LocatorValue) throws Throwable
	{
		String suppliernum="";
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			suppliernum=driver.findElement(By.xpath(LocatorValue)).getAttribute("value");
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			suppliernum=driver.findElement(By.name(LocatorValue)).getAttribute("value");
		}
		if(LocatorType.equalsIgnoreCase("id"))
		{
			suppliernum=driver.findElement(By.id(LocatorValue)).getAttribute("value");
		}
		FileWriter fw = new FileWriter("./CaptureData/suppliernumber.txt"); 
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(suppliernum);
		bw.flush();
		bw.close();
}
	//method for verifying supplier number
	public static void supplierTable() throws Throwable
	{
		//readsupplier number from above note pad
		FileReader fr = new FileReader("./CaptureData/suppliernumber.txt");
		BufferedReader br = new BufferedReader(fr);
		String Exp_Data = br.readLine();
		//click search panel if search textdata not displayed
		if(!driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).isDisplayed())
			//click search panel button if not displayed
			driver.findElement(By.xpath(conpro.getProperty("search-panel"))).click();
		driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).clear();
		driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).sendKeys("Exp_Data");
		driver.findElement(By.xpath(conpro.getProperty("search-button"))).click();
		Thread.sleep(3000);
		String Act_Data = driver.findElement(By.xpath("//table[@class='table=ewTable']/tbody/tr[1]/td[6]/div/span/span")).getText();
		Reporter.log(Exp_Data+"========"+Act_Data,true);
		try {
			Assert.assertEquals(Act_Data, Exp_Data,"supplier number is not matching");
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
		
		}
	//method for capture customer number into notepad
		public static void capturecus(String LocatorType,String LocatorValue) throws Throwable
		{
			String customernum="";
			if(LocatorType.equalsIgnoreCase("xpath"))
			{
				customernum=driver.findElement(By.xpath(LocatorValue)).getAttribute("value");
			}
			if(LocatorType.equalsIgnoreCase("name"))
			{
				customernum=driver.findElement(By.name(LocatorValue)).getAttribute("value");
			}
			if(LocatorType.equalsIgnoreCase("id"))
			{
				customernum=driver.findElement(By.id(LocatorValue)).getAttribute("value");
			}
			FileWriter fw = new FileWriter("./CaptureData/customernumber.txt"); 
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(customernum);
			bw.flush();
			bw.close();
	}
		//method for verifying customer number
		public static void customerTable() throws Throwable
		{
			//read customer number from above note pad
			FileReader fr = new FileReader("./CaptureData/customernumber.txt");
			BufferedReader br = new BufferedReader(fr);
			String Exp_Data = br.readLine();
			//click search panel if search textdata not displayed
			if(!driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).isDisplayed())
				//click search panel button if not displayed
				driver.findElement(By.xpath(conpro.getProperty("search-panel"))).click();
			driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).clear();
			driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).sendKeys("Exp_Data");
			driver.findElement(By.xpath(conpro.getProperty("search-button"))).click();
			Thread.sleep(3000);
			String Act_Data = driver.findElement(By.xpath("//table[@class='table=ewTable']/tbody/tr[1]/td[5]/div/span/span")).getText();
			Reporter.log(Exp_Data+"========"+Act_Data,true);
			try {
				Assert.assertEquals(Act_Data, Exp_Data,"customer number is not matching");
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
			}
			
			}
}