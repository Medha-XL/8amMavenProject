package commonMethods;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BaseMethods {
	
	public WebDriver driver;
	
	public void openBrowser(String browserType) {
		if(browserType.equals("chrome")) {
		  System.setProperty("webdriver.chorme.driver",  "chormedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		} else {
			System.out.println("Invalid Browser Type..");
		}
	}
	
	public void launchERP(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void loginERP(String username, String password) {
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='btnsubmit']")).click();
		String actResult = driver.findElement(By.xpath("//span[@id='ewPageCaption']")).getText();
		Assert.assertEquals(actResult, "Dashboard");
	}
	
	public void accessToStockItemsPage() {
		driver.findElement(By.id("mi_a_stock_items")).click();
		String pageName = driver.findElement(By.id("ewPageCaption")).getText();
		Assert.assertTrue(pageName.equals("Stock Items"));
	}
	
	public void addStockItem()  {
		
		WebElement addStock = driver.findElement(By.xpath("(//span[@data-caption='Add'])[1]"));
		addStock.click();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Select category = new Select(driver.findElement(By.id("x_Category")));
		category.selectByVisibleText("mobiles");
		
		Select supplierNumber = new Select(driver.findElement(By.id("x_Supplier_Number")));
		supplierNumber.selectByVisibleText("NEXA");
		
		WebElement stockName = driver.findElement(By.xpath("//input[@id='x_Stock_Name']"));
		stockName.sendKeys("Samsung Galaxy S21");
		
		Select uom = new Select(driver.findElement(By.id("x_Unit_Of_Measurement")));
		uom.selectByVisibleText("units");
		
		WebElement purchasePrice = driver.findElement(By.xpath("//input[@id='x_Purchasing_Price']"));
		purchasePrice.sendKeys("100000");
		
		WebElement sellingPrice = driver.findElement(By.xpath("//input[@id='x_Selling_Price']"));
		sellingPrice.sendKeys("125000");
		
		WebElement notes = driver.findElement(By.xpath("//input[@id='x_Notes']"));
		notes.sendKeys("Samsung Galaxy S21");
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String alertWindow = driver.getWindowHandle();	
		driver.switchTo().window(alertWindow);
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		WebElement confirm = driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']"));
		confirm.click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		accessToStockItemsPage();
		
	}

}
