package com.oliveryasuna.gimmedom.demo;

import com.oliveryasuna.gimmedom.event.GimmeEvent;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import javax.servlet.annotation.WebServlet;

public final class Demo extends UI {
  @Override
  protected void init(final VaadinRequest request) {
    final TextField a = new TextField();
    final TextField b = new TextField();

    final GimmeEvent gimmeEvent = new GimmeEvent(a);

    gimmeEvent.addClickListener(System.out::println);

    setContent(new VerticalLayout(a, b));
  }

  @WebServlet(value = "/*", asyncSupported = true)
  @VaadinServletConfiguration(productionMode = false, ui = Demo.class, resourceCacheTime = 0, widgetset = "com.oliveryasuna.gimmedom.demo.DemoWidgetset")
  public static final class Servlet extends VaadinServlet {
  }
}
