package com.vaadin.madepule.tutorial.crm.views.helloworld;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.madepule.tutorial.crm.views.MainLayout;
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        Button button = new Button("Clicar");
        DatePicker data = new DatePicker("Data");

        add(button, data);

        HorizontalLayout layout = new HorizontalLayout(button, data);
        add(layout);

    }

}
