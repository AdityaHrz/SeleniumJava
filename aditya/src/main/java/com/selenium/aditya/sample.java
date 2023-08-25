package com.selenium.aditya;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		//browser setup
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.linkedin.com/feed/");
		//Maximize the window
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com/");
		//back
//		driver.navigate().back();
//		
////		Thread.sleep(3000);
////		
//		driver.get("https://trailhead.com/");
//		//forward 
//		driver.navigate().forward();
//		//refresh the page
//		driver.navigate().refresh();
//		
//		//get title and print
//		String title=driver.getTitle();
//		System.out.println(title);
//		//gets url
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
//		//page source
//		String source=driver.getPageSource();
//		System.out.println(source);
//		
//		//close only current tab
//		driver.close();
//		
//		//quit it closes all tabs
//		driver.quit();
		
		Set<String> handles=driver.getWindowHandles();
		for (String h: handles) {
			System.out.println(driver.switchTo().window(h));
			System.out.println();
			
		}
		//quit it closes all tabs
		driver.quit();
	}
	

}
