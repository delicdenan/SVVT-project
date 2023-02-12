package adi1;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.openqa.selenium.support.ui.FluentWait;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class Profile {
	
	private static WebDriver webDriver;
	private static String baseUrl;
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selma\\Desktop\\chromedriver.exe");
		webDriver = new ChromeDriver();
		baseUrl = "https://www.blitz-cinestar-bh.ba/";
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		webDriver.close();
	}

	@Test
	
	void testRegistration() throws InterruptedException {
	webDriver.get("https://karte3.cinestarcinemas.ba/WebTicketNet/Performancelist.aspx");
	webDriver.manage().window().maximize();
	Thread.sleep(1000);
	webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_btnLoginPop_CD']/span")).click();
	webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_cpLoginPopup_Login1_rpLogin_lklRegister']")).click();
		webDriver.findElement(By.xpath("//*[@id='ctl00_ctl00_cp1_rp_cp1_Register1_txtBenutzername_I']")).sendKeys("Adi_Dzumhur");
		webDriver.findElement(By.xpath("//*[@id='ctl00_ctl00_cp1_rp_cp1_Register1_txtPassword_I']")).sendKeys("testing123");
		webDriver.findElement(By.xpath("//*[@id='ctl00_ctl00_cp1_rp_cp1_Register1_txtPasswordWdh_I']")).sendKeys("testing123");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Register1_cbAGB_S_D\"]")).click();
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Register1_txtVorname_I\"]")).sendKeys("Adi");
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Register1_txtNachname_I\"]")).sendKeys("Dzumhur");
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Register1_txtOrt_I\"]")).sendKeys("Sarajevo");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Register1_txtEmail_I\"]")).sendKeys("adi.dzumhur@stu.ibu.edu.ba");
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Register1_txtEmailConfirm_I\"]")).sendKeys("adi.dzumhur@stu.ibu.edu.ba");
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Register1_deGeburtstag_I\"]")).sendKeys("04.12.2000.");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Register1_btnRegistrieren_CD\"]/span")).click();
		Thread.sleep(2000);
	}

	@Test
	
	void testLogIn() throws InterruptedException {
	webDriver.get("https://karte3.cinestarcinemas.ba/WebTicketNet/Performancelist.aspx");
	webDriver.manage().window().maximize();
	Thread.sleep(1000);
	webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_btnLoginPop_CD']/span")).click();
		webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_cpLoginPopup_Login1_rpLogin_UserName_I']")).sendKeys("Selma_Vreto");
		webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_cpLoginPopup_Login1_rpLogin_Password_I']")).sendKeys("testing123");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_cpLoginPopup_Login1_rpLogin_cbRememberMe_S_D']")).click();
		webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_cpLoginPopup_Login1_rpLogin_LoginButton_CD']/span")).click();
		Thread.sleep(2000);
	}
	
	@Test

	void testLogOut() throws InterruptedException {
		webDriver.get("https://karte3.cinestarcinemas.ba/WebTicketNet/Performancelist.aspx");
		webDriver.manage().window().maximize();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_btnLoginPop_CD']/span")).click();
			webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_cpLoginPopup_Login1_rpLogin_UserName_I']")).sendKeys("Selma_Vreto");
			webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_cpLoginPopup_Login1_rpLogin_Password_I']")).sendKeys("testing123");
			webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_cpLoginPopup_Login1_rpLogin_LoginButton_CD']/span")).click();
			Thread.sleep(2000);
		    webDriver.findElement(By.xpath("//*[@id=\"ctl00_Logout_btnLogout1_CD\"]")).click();		
		    Thread.sleep(2000);
	}	
	
}
