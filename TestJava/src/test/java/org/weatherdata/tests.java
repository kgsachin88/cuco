package org.weatherdata;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class tests extends baseclass {

	@Test
	public void getData() throws InterruptedException {

		WebElement weather = driver.findElement(By.xpath("//a[@href='/weather/']"));
		WebElement worldwide = driver.findElement(By.xpath("//a[text()='Worldwide']"));
		

		Actions action = new Actions(driver);

		action.moveToElement(weather).perform();
		Thread.sleep(3000);
		action.moveToElement(worldwide).click().perform();
		Thread.sleep(3000);

		WebElement sel = driver.findElement(By.xpath("//select[@id=\"pop\"]"));
		Select s = new Select(sel); 
		s.selectByValue("c"); 
		Thread.sleep(5000);
		List<WebElement> cont = driver.findElements(By.xpath("//table[@class = 'zebra fw tb-theme']/tbody/tr/td[1]"));
	     int rows = cont.size();
		
	 	List<WebElement> cont1 = driver.findElements(By.xpath("//table[@class = 'zebra fw tb-theme']/tbody/tr[1]/td"));
		int col = cont1.size();
		//String txt= driver.findElement(By.xpath("//table[@class = 'zebra fw tb-theme']/tbody/tr[1]/td[1]")).getText();
		System.out.println(rows+" "+col);
		//System.out.println(txt);
		
		
		  for (int i = 1; i <=rows ; i++) { for (int j = 1; j <= col ; j++) {
		  
		  String txtval = driver.findElement(By.xpath("//table[@class = 'zebra fw tb-theme']/tbody/tr["+i+"]/td["+j+"]")).getText();
		  
		  System.out.println(txtval.trim());
		  
		  }
		  
		  }
		 
		
		  
		 

	}

}
