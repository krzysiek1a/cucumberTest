import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class appAuto {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        System.out.println("wait 5s start");
        Thread.sleep(5000);


        System.out.println("use robot");
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_P);
        r.keyRelease(KeyEvent.VK_P);
        r.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(5000);

        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);

        System.out.println("wait 5s end");
        Thread.sleep(5000);
        driver.quit();
    }
}
