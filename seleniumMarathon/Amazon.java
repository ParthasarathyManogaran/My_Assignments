package seleniumMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox' ]"));
		search.sendKeys("Bags");
        WebElement bagsForBoys = driver.findElement(By.xpath("//div[@aria-label='bags for boys']"));
        bagsForBoys.click();
        WebElement totalResults = driver.findElement(By.xpath("(//div[@class = 'a-section a-spacing-small a-spacing-top-small']/span)[1]"));
        String results = totalResults.getText();
        System.out.println("Total number of results are:" + results);
        WebElement firstBag = driver.findElement(By.xpath("(//i[@class = 'a-icon a-icon-checkbox'])[4]"));
        firstBag.click();
        WebElement secondBag = driver.findElement(By.xpath("(//i[@class = 'a-icon a-icon-checkbox'])[4]"));
        secondBag.click();
        WebElement sort = driver.findElement(By.xpath("//span[@class = 'a-dropdown-prompt']"));
        sort.click();
        WebElement newestArrivals = driver.findElement(By.linkText("Newest Arrivals"));
        newestArrivals.click();
        String title = driver.getTitle();
        System.out.println(title);
        WebElement firstResultName = driver.findElement(By.xpath("(//span[@class = 'a-size-base-plus a-color-base a-text-normal'])[1]"));
        String nameOfBag = firstResultName.getText();
        System.out.println("The name of Bag is " + nameOfBag);
        WebElement discountedPrice = driver.findElement(By.xpath("(//div[@class = 'a-row a-size-base a-color-base'])[1]//span"));
        String priceOfBag = discountedPrice.getText();
        System.out.println("The Price of Bag is " + priceOfBag);
        driver.close();
        
        

		

	}

}
