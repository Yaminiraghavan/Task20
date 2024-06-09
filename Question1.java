package Task20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement datepicker=driver.findElement(By.id("datepicker"));
        datepicker.click();
        driver.findElement(By.xpath("//a[@title='Next']")).click();
        WebElement date =driver.findElement(By.xpath("//a[text()='22']"));
        date.click();
        String selectedDate = datepicker.getAttribute("value");
        System.out.println("Selected date: " + selectedDate);
        driver.quit();
    }

}
