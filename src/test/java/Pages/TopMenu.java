package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu extends Parent {


    public TopMenu() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(xpath = "(//div[@id='block_top_menu']//li//a)[1]")
    private WebElement women;

    @FindBy(xpath = "(//a[@title='Summer Dresses'])[1]")
    private WebElement summerDress;

    WebElement myElement;
    WebElement myElement2;

//   public void findAndClick(String strlement) {
//
//        switch (strlement) {
//            case "summerDress":
//                myElement = summerDress;
//                break;
//
//
//        }
//
//        clickFunction(myElement);
//    }

//    public void findHoverOver(String strlement) {
//
//        switch (strlement) {
//            case "women": myElement =women ;break;
//
//
//        }
//        actionHoverOver(myElement);
//    }

    public void findActionClick(String strlement) {
        switch (strlement) {
            case "summerDress":
                myElement = summerDress;
                break;
        }
        actionClick(myElement);
    }


    public void findHoverOver2(String strlement){

        switch (strlement) {
            case "women": myElement =women ;break;

            case "summerDress":
                myElement2= summerDress;
                break;

        }
        actionHoverOver2(myElement,myElement2);
    }




}