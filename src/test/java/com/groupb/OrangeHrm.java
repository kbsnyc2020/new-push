package com.groupb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // System Property for Chrome Driver   
     System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");  
       
          // Instantiate a ChromeDriver class.     
     WebDriver driver=new ChromeDriver();  
       
    
     driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
     driver.manage().window().maximize();
       
		
		
		
	}

}
