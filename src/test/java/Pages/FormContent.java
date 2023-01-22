package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent{

    public FormContent(){PageFactory.initElements(GWD.getDriver(),this);}


    @FindBy(xpath = "//a[@class='login']")
    private WebElement signIn;
    @FindBy(css = "[id='email_create']")
    private WebElement email;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement createAnAccount;

    @FindBy(id = "uniform-id_gender2")
    private WebElement female;

    @FindBy(css = "[id='customer_firstname']")
    private WebElement firstName;
    @FindBy(css = "[id='customer_lastname']")
    private WebElement lastName;

    @FindBy(css = "[id='passwd']")
    private WebElement password;

    @FindBy(xpath ="(//select/option[@value='8'])[1]")
    private WebElement days;



    @FindBy(xpath ="(//select/option[@value='8'])[2]")
    private WebElement months;


    @FindBy(xpath ="//select/option[@value='1990']")
    private WebElement years;


    @FindBy(xpath="//button[@name='submitAccount']")
    private WebElement register;

    @FindBy(xpath ="//p[contains(text(), 'created')]")
    private WebElement ValidationRegister;

    @FindBy(css ="[id='email']")
    private WebElement emailLogin;


    @FindBy(xpath = "//button[@id='SubmitLogin']")
    private WebElement signInButton;

    @FindBy(css ="[title='Log me out']")
    private WebElement validationLogin;


    @FindBy(xpath ="(//div[@class='alert alert-danger'])[1]")
    private WebElement invalidLogin;







    WebElement myElement;

    public void findAndSend(String element, String value) {

        switch (element) {
            case "email": myElement = email;break;
            case "firstName": myElement = firstName;break;
            case "lastName": myElement = lastName;break;
            case  "password": myElement = password;break;
            case  "emailLogin": myElement = emailLogin;break;


        }

        sendKeysFunction(myElement, value);
    }


    public void findAndClick(String strlement) {

        switch (strlement) {
            case "signIn": myElement = signIn;break;
            case "createAnAccount": myElement = createAnAccount;break;
            case "female": myElement = female;break;
            case "days": myElement = days;break;
            case "months": myElement = months;break;
            case "years": myElement = years;break;
            case "register": myElement = register;break;
            case "signInButton": myElement = signInButton;break;


        }

        clickFunction(myElement);
    }


    public void findAndContainsText(String strlement, String text)
    {
        switch (strlement)
        {
            case "ValidationRegister" : myElement=ValidationRegister;break;
            case "validationLogin" : myElement=validationLogin;break;
            case "invalidLogin" : myElement=invalidLogin;break;


        }

        verifyContainsTextFunction(myElement, text);
    }






}
