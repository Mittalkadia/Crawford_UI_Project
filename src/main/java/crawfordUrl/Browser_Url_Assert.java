package crawfordUrl;

import org.example.Utils;
import org.openqa.selenium.By;


public class Browser_Url_Assert extends Utils {
    private By _menu = By.cssSelector("ul.c-topbar__menu");


    public void browser_OPen() {
        //print output
        System.out.println("Browser open");
    }

    public void browser_Url_Assert() {
        //print TopBar menu list
        System.out.println("Homepage TopBar Menu List:" + " " + get_Text_From_Element(_menu));


    }
}
