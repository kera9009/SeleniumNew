package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        String baseURL="https://google.com";
        String expectedTitle="google";

        String actualTitle="";

        driver.get(baseURL);

        actualTitle=driver.getTitle();
        System.out.print(actualTitle);

        if (actualTitle.contentEquals(expectedTitle)){

            System.out.println("Test Pass");

        } else{
            System.out.println("Test Fail");
        }


    }
}

