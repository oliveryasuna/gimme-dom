package com.oliveryasuna.gimmedom.event.listener;

import com.oliveryasuna.gimmedom.event.event.FocusEvent;
import com.vaadin.util.ReflectTools;

import java.lang.reflect.Method;

public class FocusListener {
  private FocusListener() {
    throw new UnsupportedOperationException("Class cannot be instantiated.");
  }

  @FunctionalInterface
  public interface Blur {
    Method METHOD = ReflectTools.findMethod(Blur.class, "blur", FocusEvent.Blur.class);

    void blur(FocusEvent.Blur event);
  }

  @FunctionalInterface
  public interface Focus {
    Method METHOD = ReflectTools.findMethod(Focus.class, "focus", FocusEvent.Focus.class);

    void focus(FocusEvent.Focus event);
  }
}
