package myPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
 public static WebDriver driver;

 @Test
 public void f() {
  driver.get("http://www.google.com");
  System.out.println(driver.getCurrentUrl());
 }

 @BeforeMethod
 public void beforeMethod() {
  System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
  driver = new FirefoxDriver();
 }

 @AfterMethod
 public void afterMethod() {
  driver.quit();
 }
}