
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.python.modules.thread.thread;
import io.github.bonigarcia.wdm.WebDriverManager;
public class VerifyAmazonHeader {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement header= driver.findElement(By.xpath("(//*[@id='nav-xshop-container'])"));
List<WebElement>lists=header.findElements(By.tagName("a"));
System.out.println(lists.size());
for(int i=0;i<lists.size();i++)
{
	System.out.println(lists.get(i).getText());
}

}
}
