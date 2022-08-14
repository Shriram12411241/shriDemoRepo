import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class test1234 {

	public static void main(String[] args) throws InterruptedException {
		
		 /*setproperty(“webdriver.gecko.driver”,Path_of_Firefox_Driver.exe”); 
		  WebDriver driver = new FirefoxDriver();
		 To Execute on Firefox Browser
		 */
		
		
		 /*System.setProperty("webdriver.ie.driver", "Path_of_InternetExplorer Driver.exe");       
	       WebDriver driver=new InternetExplorerDriver(); 
	       To Execute on InternetExplorer Browser
		*/
		
		
		/*
		System.setProperty("webdriver.opera.driver", "Path_of_Firefox_DriverPath_of_opera Driver.exe");
        WebDriver driver = new OperaDriver();
        To Execute on opera Browser
        */
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\shriram\\automation framework new\\TestAutomationFramework\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//After Browser name give a path of webdriver
		//To Execute the script on chrome Browser
		
		
		
		driver.get("https://prueba.undostres.com.mx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String parentWindow = driver.getWindowHandle();
		WebElement Operator =driver.findElement(By.xpath("//input[@name=\"operator\"]"));
		//WebElement Operator =driver.findElement(By.name("operator"));
		Operator.click();
		driver.findElement(By.xpath("//b[contains(text(),'Telcel')]")).click();
		
		
		WebElement NumberText =driver.findElement(By.xpath("//input[@oninput=\"mobileFieldInputHandler(event)\"]"));
		NumberText.sendKeys("8465433546");
		
		WebElement AmountText =driver.findElement(By.xpath("//input[@name='amount']"));
		AmountText.click();
		

		Actions action =new Actions(driver);
		WebElement price =driver.findElement(By.xpath("//div[contains(text(),'$10 saldo +$2 de regalo y 500 MB gratis para redes')]"));
		
		action.moveToElement(price).click().perform();
		
		
		WebElement Submit = driver.findElement(By.xpath("//button[@perform=\"payment\"]"));
		 Submit.click();
		
		WebElement TarjetaClick = driver.findElement(By.xpath("//p[contains(text(),'Tarjeta')]"));
		
		TarjetaClick.click();
		
		WebElement UsarnuevatarjetaClick = driver.findElement(By.xpath("//tbody/tr[@id='radio-n']/td[1]/label[1]"));
		UsarnuevatarjetaClick.click();
		Thread.sleep(5000);
		UsarnuevatarjetaClick.click();
	
	
		WebElement CardTextFiled = driver.findElement(By.xpath("//input[@id='cardnumberunique']"));
		CardTextFiled.click();
		Thread.sleep(5000);
		CardTextFiled.sendKeys("4111111111111111");
		
		WebElement DateTextFiled  = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
		DateTextFiled.click();
		DateTextFiled.sendKeys("11");
	
		
		
		WebElement YearTextFiled  = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[3]/input[1]"));
		YearTextFiled.sendKeys("25");
		
		WebElement cvvTextFiled  = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[2]/div[1]/input[1]"));
		cvvTextFiled.sendKeys("111");
		
		WebElement EmailTextFiled  = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/input[1]"));
		EmailTextFiled.sendKeys("test@test.com"); 
	
		WebElement PaySubmitClick = driver.findElement(By.xpath("//body/div[34]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]"));
		PaySubmitClick.click();
	
		
		
		
		WebElement PopEmail = driver.findElement(By.xpath("//input[@id='usrname']"));
		PopEmail.sendKeys("automationUDT1@gmail.com");
		
		WebElement PopPass = driver.findElement(By.xpath("//input[@id='psw']"));
		 PopPass.sendKeys("automationUDT123");
		 
		 WebElement CapchaClick = driver.findElement(By.xpath("//body"));
		 CapchaClick.click();
		
		// 
		WebElement PopClick = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/form[1]/div[4]"));
		PopClick.click();
		
		
		
		 WebElement PopClick2 =driver.findElement(By.id("loginBtn"));
		PopClick2.click();
		
		Thread.sleep(10000);
		WebElement Message =driver.findElement(By.cssSelector("div.visual-message"));
		Message.getText();
		System.out.println("recharge Status ="+Message.getText());
		driver.close();
	}
					
}


