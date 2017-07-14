package GitHub_Test.GitHubTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
   
    public void testApp() throws InterruptedException{    
        System.setProperty("webdriver.chrome.driver","C://Selenium/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        String eTitle = "Meet Guru99";
        String aTitle = "";
        driver.get("http://www.XYZ.com");
        driver.manage().window().maximize();
        
        aTitle = driver.getTitle();
        
        if (aTitle.contentEquals(eTitle)){
        	System.out.println("Test Passed");
        }else{
        	System.out.println("Test Failed");	
        }
       driver.close();
    }
}
