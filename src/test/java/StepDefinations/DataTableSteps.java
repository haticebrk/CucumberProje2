package StepDefinations;

import Pages.FormContent;
import Pages.Order;
import Pages.TopMenu;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTableSteps {

    FormContent fc=new FormContent();
    TopMenu tm=new TopMenu();

    Order or=new Order();
    @And("Click on the element in the Form")
    public void clickOnTheElementInTheForm(DataTable elemanlar ) {

        List<String> listElemanlar=elemanlar.asList(String.class);
        for(String eleman:listElemanlar) {

             fc.findAndClick(eleman);
        }

        
    }

    @And("User  sending the keys in the Form Content")
    public void userSendingTheKeysInTheFormContent(DataTable elemanlar) {

        List<List<String>> listElemanlar= elemanlar.asLists(String.class);

        for(int i=0;i< listElemanlar.size() ; i++ )
         fc.findAndSend(listElemanlar.get(i).get(0), listElemanlar.get(i).get(1) );

    }

    @And("HoverOver on the element in the top menu")
    public void hoveroverOnTheElementInTheTopMenu(DataTable elemanlar) {
        List<String> listElemanlar=elemanlar.asList(String.class);
        for(String eleman:listElemanlar) {

           // tm.findHoverOver(eleman);
        }
    }

    @And("Click on the element in the Top Menu")
    public void clickOnTheElementInTheTopMenu(DataTable elemanlar) {
        List<String> listElemanlar=elemanlar.asList(String.class);
        for(String eleman:listElemanlar) {

          //  tm.findAndClick(eleman);
        }

    }

    @And("Click on the element in the order")
    public void clickOnTheElementInTheOrder(DataTable elemanlar) {
        List<String> listElemanlar=elemanlar.asList(String.class);
        for(String eleman:listElemanlar) {

            or.findAndClick(eleman);
        }

    }

    @And("Action Click on the element in the Top Menu")
    public void actionClickOnTheElementInTheTopMenu(DataTable elemanlar) {

        List<String> listElemanlar=elemanlar.asList(String.class);
        for(String eleman:listElemanlar) {

            tm.findActionClick(eleman);
        }
    }

    @And("HoverOver on the element in the top")
    public void hoveroverOnTheElementInTheTop(DataTable elemanlar){
        List<String> listElemanlar=elemanlar.asList(String.class);
        for(String eleman:listElemanlar) {

            tm.findHoverOver2(eleman);
        }

    }
}












