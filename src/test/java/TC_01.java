import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_01 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	    @Test
	    public static void test() 
	    {
		
	    WebDriver driver =new ChromeDriver();
	    driver.get("http://localhost:8888/");
	    System.out.println(driver.getTitle());
	    driver.close();
	    
	    
		

	}

}
