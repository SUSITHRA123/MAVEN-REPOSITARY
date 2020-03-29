import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink
{
	static

{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws IOException
	{
	   WebDriver driver =new ChromeDriver();
      //driver.manage().window().maximaize();
      driver.get("file:///D:/html/brokenlink.html");
       List<WebElement> links = driver.findElements(By.tagName("a"));
       for(WebElement ele:links)
       {
    	   String link=ele.getAttribute("href");
    	   URL u=new URL(link);
    	   HttpURLConnection conn=(HttpURLConnection)u.openConnection();
    	   System.out.println(conn.getURL());
    	   if(conn.getResponseCode()==200)
    	   {
    		   System.out.println(conn.getResponseCode());
    		   System.out.println(conn.getResponseMessage());
    		   System.out.println("Link is not broken");
    		   
    	   }
    	   else
    	   {
    		   System.out.println(conn.getResponseCode());
    		   System.out.println(conn.getResponseMessage());
    		   System.out.println("Link is  broken");
    		   
    		   System.out.println("my name is susi");
    		   System.out.println("my name is divya");
    		   System.out.println("my name is sri");
    		   System.out.println("my name is aditya");
    		   
    		    
    	   }
    	   
       }
	}
	
       
}	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
       
       
    	   
    	   
    	   

