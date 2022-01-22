package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws Throwable  {

		System.setProperty("webdriver.chrome.driver", "E:\\Dinesh\\Selenium\\browserserver\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	
		driver.findElement(By.xpath("//div[@class='taskRowsTableContainer']/descendant::table/tbody/tr[4]/td[1]/div/div")).click();
		driver.findElement(By.xpath("//div[@class='delete button']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='You are about to delete a task']")));
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
	}

}
