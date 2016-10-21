package com.mycompany;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HelloWorld2 extends WebPage {
//public class HelloWorld2 extends BasePage {
    public HelloWorld2() {
        add(new Label("message", "Test2_1"));
        //add(new Label("message2", "Test2_2"));
        add(new Label("message3", "Test2_3"));
    }
}
