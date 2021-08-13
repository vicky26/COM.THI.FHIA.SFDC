package COM.FHIA.PAGES;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Library {

	 WebDriver driver;



	public Library(WebDriver ldriver){

		this.driver = ldriver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

	}

	public void scrollDown() throws Throwable {

		//Scroll down

		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);	

	}

	public void scrollUP() throws Throwable {

		//Scroll up

		JavascriptExecutor js1 = (JavascriptExecutor)driver;

		js1.executeScript("window.scrollBy(0,-10000)");

		Thread.sleep(5000);	

	}

	public String todaysDateTime()  {

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mmddyyHHmm");  

	 LocalDateTime now = LocalDateTime.now();

	 String date = dtf.format(now);

	 return date;

	}

	public String todaysDate() throws Throwable {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  

		 LocalDateTime now = LocalDateTime.now();

		 String date = dtf.format(now);

		 System.out.println(date);

		 return date;

		}

	public  String fewDaysFromTodaysDate(int days)

	{

		

		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

		//date = new Date();

		Calendar calendar= Calendar.getInstance();

		calendar.add(Calendar.DATE, days);

		Date date = calendar.getTime();

		String formattedDate = dateFormat.format(date);

		System.out.println(date);

		return formattedDate;

	}

	

	public void UploadAFile(String FilePath) throws Throwable

	{

	Thread.sleep(1000);

	driver.getWindowHandle();

	Thread.sleep(1000);

	

	

	//Copy the file to Clipboard

	StringSelection ss = new StringSelection(FilePath);

	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

			

	//Paste the file in the File Name field on the dialog box

	Robot robot = new Robot();

	robot.keyPress(KeyEvent.VK_CONTROL);

	robot.keyPress(KeyEvent.VK_V);

	robot.keyRelease(KeyEvent.VK_V);

	robot.keyRelease(KeyEvent.VK_CONTROL);

	robot.keyPress(KeyEvent.VK_ENTER);

	robot.keyRelease(KeyEvent.VK_ENTER);

	

	}

	

	public void implicitwait(int Seconds)

	{

		driver.manage().timeouts().implicitlyWait(Seconds, TimeUnit.SECONDS);

	}

	

	public void explicitwait(int Seconds)

	{

		driver.manage().timeouts().implicitlyWait(Seconds, TimeUnit.SECONDS);

	}

	



}