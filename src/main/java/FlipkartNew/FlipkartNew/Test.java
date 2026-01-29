package FlipkartNew.FlipkartNew;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys("Subrota Das");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@placeholder='Enter Rediffmail ID']")).sendKeys("subrotadss");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Check availability']")).click();
		Thread.sleep(1000);
		
		String actualData = driver.findElement(By.className("msgSucc")).getText();
		String expectedData = "Yippie! The ID you've chosen is available.";
		
		if (actualData.equals(expectedData)) {
			System.out.println("Id Available");
		} else {
			System.out.println("Id Not Available");
		}
		
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Narayan");
		driver.findElement(By.xpath("//input[@placeholder='Retype password']")).sendKeys("Narayan");
		Thread.sleep(1000);
		
		 Select daydropDown = new Select(driver.findElement(By.className("day")));
		daydropDown.selectByVisibleText("23");
		
		Select monthdropDown = new Select(driver.findElement(By.xpath("//select[@class='middle month']")));
		monthdropDown.selectByVisibleText("JAN");
		
		Select yeardropDown = new Select(driver.findElement(By.className("year")));
		yeardropDown.selectByVisibleText("1984");
		 Thread.sleep(1000);
		 
		 WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='f']"));
		 femaleRadioButton.click();
		 
		 Select country = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		 country.selectByVisibleText("Canada");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@placeholder='Enter recovery email']")).sendKeys("Swastikdas@gmail.com");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("1234567890");
		 Thread.sleep(2000);
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)","");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[2]/p/a[1]")).click();
		
		driver.close();
	}
	
	

}