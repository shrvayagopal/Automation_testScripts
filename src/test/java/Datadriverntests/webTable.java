package Datadriverntests;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class webTable {
public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/html/html_tables.asp");
driver.manage().window().maximize();
System.out.println(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr")).getSize());

	}

}
//*[@id="customers"]/tbody
