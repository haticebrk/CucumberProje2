package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
    public void sendKeysFunction(WebElement element, String value)
    {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        waitUntilVisible(element); // gözükene kadar bekle
       scrollToelement(element);  // elemente kadar scroll yap (javascriptexecuter)
        element.clear();           //        temizle  (clear)
        element.sendKeys(value);//        değeri gönder (sendKeys)
    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element); // Clickable olana kadar bekle
        scrollToelement(element);  // elemente kadar scroll yap (javascriptexecuter)
        element.click();           //        click
    }

    public void waitUntilVisible(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToelement(WebElement element)
    {
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitUntilClickable(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsTextFunction(WebElement element, String value)
    {


        // waitUntilVisible(element);


        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"The text you searched could'nt be find");

        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();// burada acik olan  dialog kapansin diye esc tusuyla sayfayi kapattik manuel test ederken de bunlara dikkt et
    }


    public void waitUntilLoading()
    {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        // progressbar ın çocukları 0 olana kadar bekle
    }


    public void actionHoverOver(WebElement element){

        Actions aksiyonlar=new Actions(GWD.getDriver());
        aksiyonlar.moveToElement(element).build().perform();


    }
public void actionClick(WebElement element){

    Actions aksiyonlar=new Actions(GWD.getDriver());
    aksiyonlar.moveToElement(element).click().build().perform();
}


    public void actionHoverOver2(WebElement element,WebElement element2)  {

        Actions aksiyonlar = new Actions(GWD.getDriver());
        aksiyonlar.moveToElement(element).build().perform();
        waitUntilClickable(element2);
        aksiyonlar.moveToElement(element2).click().build().perform();
    }


}
