package Pages;

import Utilities.GWD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order extends Parent{

 public Order(){
        PageFactory.initElements(GWD.getDriver(),this);
    }



    @FindBy(xpath = "(//a[@title='Printed Summer Dress'])[4]")
    private WebElement blouse;

    @FindBy(xpath ="//button[@name='Submit']//span")
    private WebElement addToCartButton;

    @FindBy(xpath ="(//span[@class='title'])[1]")
    private WebElement validationAddToCart;
WebElement myElement;
    public void findAndClick(String strlement) {

        switch (strlement) {
            case "blouse": myElement = blouse;break;
            case "addToCartButton": myElement = addToCartButton;break;


        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strlement, String text)
    {
        switch (strlement)
        {
            case "validationAddToCart" : myElement=validationAddToCart;break;


        }

        verifyContainsTextFunction(myElement, text);
    }


}
