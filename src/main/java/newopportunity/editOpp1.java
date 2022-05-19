package newopportunity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class editOpp1 {

	public void edit_opportunity() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");





		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));





		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Tuna@123");
		driver.findElement(By.id("Login")).click();
		
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

	driver.findElement(By.xpath("//button[text()='View All']")).click();

	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	
	WebElement findElement = driver.findElement(By.xpath("//a[@title='Opportunities']"));
	Actions builder1 = new Actions(driver);
	builder1.moveToElement(findElement).click().perform();
	
	
	driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("New2");
	Thread.sleep(1000);

	driver.findElement(By.xpath("//div[@class='slds-grid ']")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("(//table/tbody/tr/td[8]/span/div/a/span/span)[1]")).click();

	driver.findElement(By.xpath("(//div[@class='forceActionLink']/parent::a)[1]")).click();
	driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	
    System.out.println("New2 is edited");
	
	
}
}
