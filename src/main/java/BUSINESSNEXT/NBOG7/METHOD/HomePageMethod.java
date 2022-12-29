package BUSINESSNEXT.NBOG7.METHOD;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import BUSINESSNEXT.NBOG7.COMMON.*;
import BUSINESSNEXT.NBOG7.METHOD.*;
import BUSINESSNEXT.NBOG7.OBJECT.*;

public class HomePageMethod extends LoginPageMethod{

	//quick link and sales widget
   public void ClickOnLeadswidget()

	{
	HomePageObject.clk_leadpanesaleswidget.click();;

	}

   public void clk_leadobject() throws InterruptedException

	{

		   Actions quick1 = new Actions(driver);
		   quick1.moveToElement(HomePageObject.clk_salesObject).perform();
		   Thread.sleep(150);
		   HomePageObject.clk_leadobject.click();

	       //CaseStagePageObject.clk_caseobject4.click();
	}





 


   public void ClickOnLoanJouney()

 	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   HomePageObject.clk_leadpaneLoanJourney.click();
 	}
   public void ClickOnCaseJouney()

  	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   HomePageObject.clk_leadpaneCasejourney.click();
  	}
   public void scrolldown()



   {
    // scroll down by 500 pixels with Javascript Executor
       JavascriptExecutor js = (JavascriptExecutor) driver;
      // js.executeScript("window.scrollBy(0,500)");
       // identify element
       System.out.println("scrolling down:");
       // scroll down up 500 pixels with Javascript Executor
      // js.executeScript("window.scrollBy(0,500)");


       //till page end
       js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       }


   public void scrollup()



   {
    // scroll down by 500 pixels with Javascript Executor
       JavascriptExecutor js = (JavascriptExecutor) driver;
      // js.executeScript("window.scrollBy(0,500)");
       // identify element
       System.out.println("scrolling down:");
       // scroll down up 500 pixels with Javascript Executor
       //js.executeScript("window.scrollBy(0,500)");

      //till page end
       js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       }


   public void CheckRole() throws InterruptedException
   {
	   HomePageObject.Clk_CheckRole.click();
	   Thread.sleep(1500);


   }



public void scrollBy()



   {
    // scroll down by 500 pixels with Javascript Executor
       JavascriptExecutor js = (JavascriptExecutor) driver;
      // js.executeScript("window.scrollBy(0,500)");
       // identify element
       // scroll down up 500 pixels with Javascript Executor
       js.executeScript("window.scrollBy(0,500)");


       //till page end
       //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       }


}