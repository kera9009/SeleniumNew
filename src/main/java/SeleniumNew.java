import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNew {

    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        String baseURL="https://www.instagram.com/";
        String expectedTitle="Instagram";

        String actualTitle="";

        driver.get(baseURL);
        actualTitle=driver.getTitle();
        System.out.println(actualTitle);

        if (actualTitle.contentEquals(expectedTitle)){

            System.out.println("Test Pass");

        } else{

            System.out.println("Test Fail");

        } driver.close();
    }

}
