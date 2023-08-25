package seleniumMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		WebElement menuBar = driver.findElement(By.xpath("//div[@class = 'nav-icon']"));
		menuBar.click();
		WebElement movielibrary = driver.findElement(By.xpath("//a[@class = 'ng-star-inserted']"));
		movielibrary.click();
		Thread.sleep(7000);
		WebElement selectCity = driver.findElement(By.xpath("//select[@name = 'city']"));
		selectCity.click();
		Select city = new Select(selectCity);
		city.selectByVisibleText("Chennai");
		WebElement selectGenres = driver.findElement(By.xpath("//select[@name = 'genre']"));
		Select genres = new Select(selectGenres);
		genres.selectByVisibleText("ANIMATION");
		WebElement selectlanguage = driver.findElement(By.xpath("//select[@name = 'lang']"));
		Select language = new Select(selectlanguage);
		language.selectByVisibleText("ENGLISH");
		WebElement submitButton = driver.findElement(By.xpath("//button[@class = 'btn btn-submit btn-primary']"));
		submitButton.click();
		Thread.sleep(7000);
		WebElement firstMovie = driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted']/img"));
		firstMovie.click();
		Thread.sleep(7000);
		WebElement proceedToBook = driver.findElement(By.xpath("(//button[@type = 'button'])[4]"));
		proceedToBook.click();
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys("Ashok");
		WebElement mobile = driver.findElement(By.xpath("//input[@name = 'mobile']"));
		mobile.sendKeys("8825964019");
		WebElement cinema = driver.findElement(By.xpath("//select[@name = 'cinemaName']"));
		cinema.click();
		Select cinemaName = new Select(cinema);
		cinemaName.selectByIndex(2);
		WebElement selectDate = driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']"));
		selectDate.click();
		WebElement date = driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']"));
		date.click();
		WebElement email = driver.findElement(By.xpath("//input[@name = 'email']"));
		email.sendKeys("ashokmano480@gmail.com");
		WebElement prefferedShowTime = driver.findElement(By.xpath("//select[@name = 'timings']"));
		prefferedShowTime.click();
		Select showTime = new Select(prefferedShowTime);
		showTime.selectByIndex(2);
		WebElement noOftickets = driver.findElement(By.xpath("//input[@name = 'noOfTickets']"));
		noOftickets.sendKeys("1");
		WebElement foodAndBevereges = driver.findElement(By.xpath("//select[@name='food']"));
		Select fAndB = new Select(foodAndBevereges);
		fAndB.selectByIndex(1);
		WebElement otherReq = driver.findElement(By.xpath("//input[@name='comment']"));
		otherReq.sendKeys("NA");
		WebElement copyToSelf = driver.findElement(By.xpath("//span[@class='display-block']"));
		copyToSelf.click();
		WebElement sendRequest = driver.findElement(By.xpath("//button[@class = 'btn btn-primary rightFloat']"));
		sendRequest.click();
		Thread.sleep(5000);
		WebElement cancelButton = driver.findElement(By.xpath("(//button[@class = 'btn already-member'])[4]"));
		cancelButton.click();
		Thread.sleep(5000);
		WebElement otpDialogClose = driver.findElement(By.xpath("//button[@class = 'swal2-close']"));
		otpDialogClose.click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		
		
		

	}

}
