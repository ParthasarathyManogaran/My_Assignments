package seleniumMarathon;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com/");
		WebElement bus = driver.findElement(By.id("pills-home-tab"));
		bus.click();
		WebElement leavingFrom = driver.findElement(By.id("source"));
		leavingFrom.sendKeys("chennai");
		WebElement chennai = driver.findElement(By.xpath("(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'])[1]/li[1]"));
		chennai.click();
		WebElement goingTo = driver.findElement(By.id("destination"));
		goingTo.sendKeys("Bangalore");
		WebElement bangalore = driver.findElement(By.xpath("(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'])[2]/li[1]"));
		bangalore.click();
		WebElement dateOfJourney = driver.findElement(By.xpath("//input[@id='datepicker1']"));
		dateOfJourney.click();
        WebElement date = driver.findElement(By.linkText("26"));
        date.click();
        WebElement searchBus = driver.findElement(By.linkText("Search"));
        searchBus.click();
        String title = driver.getTitle();
        WebElement busName = driver.findElement(By.xpath("(//h2[@class = 'TravelAgntNm ng-binding'])[1]"));
        String nameOfbus = busName.getText();
        System.out.println(nameOfbus);
        WebElement seatNum = driver.findElement(By.xpath("(//p[@class = 'noseats AvailSts ng-binding'])[1]"));
        String seat = seatNum.getText();
        System.out.println(seat);
        WebElement selectSeat = driver.findElement(By.xpath("(//a[@class = 'btn-seatselect book1'])[1]"));
        selectSeat.click();
        WebElement seatSelection =driver.findElement(By.xpath("//a[@id = 'UO4-1ZZ']"));
        seatSelection.click();
        String seatSelected = driver.findElement(By.xpath("//span[@id = 'seatnos']")).getText();
        WebElement totalFare = driver.findElement(By.xpath("//span[@id = 'ticketfare']"));
        String fare = totalFare.getText();
        System.out.println(fare);
        System.out.println(seatSelected);
        WebElement boardingPoint = driver.findElement(By.xpath("//select[@id = 'boardingpoint_id']"));
        Select poonamalle = new Select(boardingPoint);
        poonamalle.selectByIndex(10);
        WebElement droppingPoint = driver.findElement(By.xpath("//select[@id = 'droppingpoint_id']"));
        Select majestic = new Select(droppingPoint);
        majestic.selectByIndex(10);
        System.out.println(title);
        driver.close();
	}

}
