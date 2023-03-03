package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import javax.swing.plaf.TableHeaderUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.Driver;



/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {

        // first create driver instance
        WebDriver driver = new ChromeDriver();

        // go to the website
        driver.get("https://opensource-demo.orangehrmlive.com");

        // since execution of web is fast we need to delay it to fully load the webpage
        Thread.sleep(3000);
        // enter username
       driver.findElement(By.name("username")).sendKeys("Admin");

       //enter password

        driver.findElement(By.name("password")).sendKeys("admin123");

        // get the xpath of login and click log in button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        // we delay the execution till the webpage is fully loaded
        Thread.sleep(3000);

        // check and compare label with actual label.
        // we save the label in a string variable
        String act_label = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
        // save a expected label in another string so we can later compare them
        String exp_label = "Dashboard";

        // if actial label is equal to expected label - print test passed else "failed"

        if(act_label.equals(exp_label)){
            System.out.println("Test Passed");
        }else
        {
            System.out.println("Test Failed ");
        }
        Thread.sleep(5000);

        driver.quit();

    }
}

