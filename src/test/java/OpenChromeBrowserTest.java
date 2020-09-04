import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class OpenChromeBrowserTest {
    WebDriver wd;


   // @BeforeMethod
    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.navigate().to("https://www.google.com/");

    }

    @Test
    public void searchTest(){
        System.out.println("Google.com opened");
        wd.findElement(By.name("q")).click();
        wd.findElement(By.name("q")).clear();
        wd.findElement(By.name("q")).sendKeys("Selenium WebDriver"+ Keys.ENTER);
        wd.findElement(By.cssSelector("[href='/login']")).click();

    }

    @Test
    public void clickOnAvatar(){
      //  wd.findElement(By.id("gb_70")).click();
    }

    public void changeLanguage(){

     }

   // @AfterMethod(enabled = false)
    //stop
    @AfterClass(enabled = false)
    public void tearDown(){
        wd.quit();
    }
}
