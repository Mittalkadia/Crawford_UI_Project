package CrawfordFacebook;

import org.example.Utils;

public class Facebook_Assert extends Utils {
    public void user_On_facebook() {
        //print output
        System.out.println("User on facebook page");
    }

    public void facebook_Assert() {
        //actual url
        String url = "https://www.facebook.com/crawfordandco";
        //expected url
        assertCurrentURL(url);
        //print output
        System.out.println("Crawford company facebook link page open");

    }
}
