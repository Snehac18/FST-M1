package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity6 {
    @Test
    public void openBrowser() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
        String title=driver.findElement(By.xpath("//h1[contains(text(),'My Account')]")).getText();
        System.out.println(title);
        Assert.assertEquals(title,driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).getText());
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.name("wp-submit")).click();
        String user=driver.findElement(By.partialLinkText("Howd")).getText();
        String uname="root";
        if(user.contains(uname))
        System.out.println("logged successfully");
        driver.quit();
    }
}