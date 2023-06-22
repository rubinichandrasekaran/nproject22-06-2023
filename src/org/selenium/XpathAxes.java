package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\rubin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.iplt20.com/points-table/men/2023");
		
		String team = "GT";
		
		WebElement element = driver.findElement
				(By.xpath("//h2[text()='"+team+"']//ancestor::td/preceding-sibling::td[@class='table-qualified ng-binding']"));
		
		String text = element.getText();
		
		System.out.println("Position of "+team+":"+text);
		
		WebElement ele2 = driver.findElement(By.xpath("//h2[text()='"+team+"']//following::td[1]"));
		
		String text2 = ele2.getText();
		
		System.out.println("Total of "+team+":"+text2);
		
		WebElement ele3 = driver.findElement(By.xpath("//h2[text()='"+team+"']//following::td[2]"));
		
		String text3 = ele3.getText();
		
		System.out.println("W of "+team+":"+text3);
		
		WebElement ele4 = driver.findElement(By.xpath("//h2[text()='"+team+"']//following::td[3]"));
		
		String text4 = ele4.getText();
		
		System.out.println("L of "+team+":"+text4);
		
		WebElement ele5 = driver.findElement(By.xpath("//h2[text()='"+team+"']//following::td[4]"));
		
		String text5 = ele5.getText();
		
		System.out.println("NR of "+team+":"+text5);
		
		WebElement ele6 = driver.findElement(By.xpath("//h2[text()='"+team+"']//following::td[5]"));
		
		String text6 = ele6.getText();
		
		System.out.println("NRR of "+team+":"+text6);
		
		WebElement ele7 = driver.findElement(By.xpath("//h2[text()='"+team+"']//following::td[6]"));
		
		String text7 = ele7.getText();
		
		System.out.println("FOR of "+team+":"+text7);
		
		WebElement ele8 = driver.findElement(By.xpath("//h2[text()='"+team+"']//following::td[7]"));
		
		String text8 = ele8.getText();
		
		System.out.println("AGAINST of "+team+":"+text8);
		
		WebElement ele9 = driver.findElement(By.xpath("//h2[text()='"+team+"']//following::td[8]"));
		
		String text9 = ele9.getText();
		
		System.out.println("NR of "+team+":"+text9);
		
		
		
		
		
	}
	
}
