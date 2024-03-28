package BaiTapBuoi7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDangKi {

    EdgeDriver edgeDriver;

    @BeforeMethod
    public void init(){
        WebDriverManager.edgedriver().setup();
        edgeDriver = new EdgeDriver();
    }

    @Test
    public void run(){
        edgeDriver.get("https://sevenam.vn/");
        WebElement element = edgeDriver.findElement((By.linkText("/ Đăng ký")));
        element.click();

        edgeDriver.findElement((By.id("FirstName"))).sendKeys("Van");
        edgeDriver.findElement((By.id("LastName"))).sendKeys("Nguyen");
        edgeDriver.findElement((By.id("Email"))).sendKeys("Vanntph43399@fpt.edu.vn");
        edgeDriver.findElement((By.id("CreatePassword"))).sendKeys("Vannt333#");
        edgeDriver.findElement((By.className("btn--full"))).click();

    }
}
