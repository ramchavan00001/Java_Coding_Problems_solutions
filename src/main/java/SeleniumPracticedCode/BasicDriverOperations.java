package SeleniumPracticedCode;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.*;
import java.io.*;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.time.Duration;
public class BasicDriverOperations {
	private WebDriver driver;
	private WebDriverWait wait;
	@BeforeMethod
	public void openApplication() {
		
		driver = new ChromeDriver();
		
		//wait initialization
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.close();

	}
	
	@Test
	public void testLogoAndTitle()
	{
		System.out.println("--------------------TestCase Start: testLogoAndTitle----------------------");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//picture[@title='Flipkart']/img"))); //change this xpath
		boolean flag=driver.findElement(By.xpath("//picture[@title='Flipkart']/img")).isDisplayed();
		System.out.println(flag);
		Assert.assertTrue(flag, "Logo is not displayed");
		System.out.println("--------------------TestCase End: testLogoAndTitle ----------------------");
	}
	
	@Test
	public void findCountOfProduct()
	{
		System.out.println("--------------------Test case Start: findCountOfProduct----------------------");
		try
		{
		String product="Iphone";
		//followings are some of the xpaths that can be used
		//div[@class='_3NorZ0 _3jeYYh']/form/div/div/input[@class='Pke_EE']
		//input[@title='Search for Products, Brands and More']
		//input[normalize-space(@title)='Search for Products, Brands and More']
		//*starts-with(@title,'Search')]
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[starts-with(@title,'Search')])[2]")));
		WebElement searchBar=driver.findElement(By.xpath("(//*[starts-with(@title,'Search')])[2]"));
		searchBar.sendKeys(product);
		driver.findElement(By.xpath("(//*[starts-with(@title,'Search')])[1]")).click();
		
		//now extract all the searchResult in List of webElement
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='KzDlHZ']")));
		List<WebElement> iphoneList=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		System.out.println("Total Seach result found for "+product+" are "+iphoneList.size());
		for(WebElement ele:iphoneList)
		{
			String iphoneName=ele.getText();
			if(iphoneName.equals("Apple iPhone 16 Pro (Natural Titanium, 256 GB)"))
			{
				System.out.println("Product found: "+iphoneName);
				break;
			}
			System.out.println("Name: "+iphoneName);
		}
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception is occured:  "+e);
		}
		
		
		System.out.println("--------------------TestCase End: findCountOfProduct----------------------");
		
	}
	@Test
	public void findAllBrokenLinksPresent() throws MalformedURLException, IOException
	{
		System.out.println("--------------------TestCase Start: findAllBrokenLinksPresent----------------------");
		//find all the links present on the page by using tagname locator
		//all link present in anchor tag only
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links found: "+allLinks.size());
		int count=0;
		for(WebElement link:allLinks)
		{
			String url=link.getAttribute("href");
			System.out.println("Processing the URL >>>> : "+count+" >>> "+url);
			
			if(url!=null)
			{
				HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();
				
				if(conn.getResponseCode()>400)
				{
					System.out.println("The URL is broker: "+url);
				}
			}
			
			String target=link.getAttribute("target");
			System.out.println("Target "+target+" for link "+url);
			if(target.equals("_blank"))
			{
				link.click();
				System.out.println("Link is opened in new tab");
			}
			
			if(count==50)
			{
				break;
			}
			count++;
		}
		
		
		
		
		System.out.println("--------------------TestCase End: findAllBrokenLinksPresent----------------------");
	}
	
	
	@Test
	public void findAllBrokenLinksPresentnew()
	{
		System.out.println("--------------------TestCase Start: findAllBrokenLinksPresent----------------------");
		
		
		
		System.out.println("--------------------TestCase End: findAllBrokenLinksPresent----------------------");
	}
	
	@AfterMethod
	public void closeApplications() throws IOException
	{
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./Screenshots/Flipkart.png"));
			driver.quit();
	}

}
