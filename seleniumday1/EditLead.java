package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.drawingml.x2006.chart.STRadarStyle;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		username.sendKeys("demosalesmanager");
		password.sendKeys("crmsfa");
		loginButton.click();
		String title = driver.getTitle();
		System.out.println(title);
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		String hometitle = driver.getTitle();
		System.out.println(hometitle);
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		String leadTitle = driver.getTitle();
		System.out.println(leadTitle);
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		WebElement phoneNum = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		WebElement createButton = driver.findElement(By.name("submitButton"));
		companyName.sendKeys("Xebia");
		firstName.sendKeys("Parthasarathy");
		lastName.sendKeys("Manogaran");
		email.sendKeys("ashokmano480@gmail.com");
		phoneNum.sendKeys("7358926482");
		createButton.click();
		String leadCreatedTitle = driver.getTitle();
		WebElement edit = driver.findElement(By.linkText("Edit"));
		edit.click();
		String editTitle = driver.getTitle();
		System.out.println(editTitle);
		WebElement editCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));
		editCompanyName.clear();
		editCompanyName.sendKeys("Testleaf");
		WebElement update = driver.findElement(By.name("submitButton"));
		update.click();
		String editedLead = driver.getTitle();
		driver.close();
		
	
	}

}
