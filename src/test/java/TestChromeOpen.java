
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestChromeOpen {
    WebDriver wd;




    @Test
    public void testChrome(){
        wd = new ChromeDriver();
        wd.get("https://www.google.com/?hl=en-US");
        //wd.navigate().to("https://www.google.com/?hl=en-US");

        //wd.get("https:/");
      //  wd.get("");
    }


}

