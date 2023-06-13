package Shortcuts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class webElements {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569885%7Cb%7Cfb%20sign%20up%7C&placement=&creative=589460569885&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D9062140%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwmdGYBhDRARIsABmSEePLXQXMWbTp-OiPUEvz0CaoscoF-DJWaWRuSRK0HVui8Ff3uOhdWb0aAqDREALw_wcB");
		
		driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Chinnodu");
      Thread.sleep(1000);
        driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Venu");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("8367351203");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//*[@type='password'])")).sendKeys("Venugopal@5");
        Thread.sleep(1000);
        //DropDown Selection
		WebElement day=driver.findElement(By.id("day"));
		Select d=new Select(day);
		d.selectByIndex(7);     
		//d.selectByVisibleText("8");
		System.out.println(d.getOptions().size());
		 Thread.sleep(1000);
		WebElement Month=driver.findElement(By.id("month"));
		Select m=new Select(Month);
		//timedrp.selectByIndex(1);
		m.selectByVisibleText("Sep");
		System.out.println(m.getOptions().size());
		 Thread.sleep(1000);
		WebElement Year=driver.findElement(By.id("year"));
		Select y=new Select(Year);
		//timedrp.selectByIndex(1);
		y.selectByVisibleText("1997");
		System.out.println(y.getOptions().size());
		 Thread.sleep(1000);
		//Radio Button Selection
		System.out.println(driver.findElement(By.xpath("(//*[@type='radio'])[2]")).isSelected());
		driver.findElement(By.xpath("(//*[@type='radio'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("(//*[@type='radio'])[2]")).isSelected());
		//CheckBox Selection
		 Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@type='submit'])")).click();
}
}
