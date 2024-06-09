package Task20;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Question2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guvi.in/");
        driver.findElement(By.linkText("Sign up")).click();
        driver.findElement(By.id("name")).sendKeys("Test User");
        driver.findElement(By.id("email")).sendKeys("testuser143@example.com");
        driver.findElement(By.id("password")).sendKeys("StrongPassword123!");
        driver.findElement(By.id("mobileNumber")).sendKeys("1234567890");
        driver.findElement(By.id("signup-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("laterBtn")).click();
        if (driver.getTitle().contains("Dashboard")) {
            System.out.println("User registered in successfully.");
        } else {
            System.out.println("User registered  failed.");
        }

        driver.navigate().refresh();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("email")).sendKeys("yaminiraghavan1998@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Yamini241098$");
        driver.findElement(By.id("login-btn")).click();
        Thread.sleep(2000);
        String text=driver.findElement(By.xpath("//h1[text()='Online Courses']")).getText();
        Assert.assertEquals(text,"Online Courses");
        driver.close();
    }
}

