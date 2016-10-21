package com.mycompany;

import org.apache.wicket.markup.html.border.Border;
import org.apache.wicket.markup.html.border.BoxBorder;

public class NavomaticBorder extends Border {
    public NavomaticBorder(final String componentName) {
        super(componentName);
        //addToBorder(new BoxBorder("navigationBorder"));
        //addToBorder(new BoxBorder("bodyBorder"));
        add(new BoxBorder("navigationBorder"));
        add(new BoxBorder("bodyBorder"));
    }
}
