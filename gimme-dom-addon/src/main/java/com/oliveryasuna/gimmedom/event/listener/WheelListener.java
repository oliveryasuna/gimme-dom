package com.oliveryasuna.gimmedom.event.listener;

import com.oliveryasuna.gimmedom.event.event.WheelEvent;
import com.vaadin.util.ReflectTools;

import java.lang.reflect.Method;

public class WheelListener {
  private WheelListener() {
    throw new UnsupportedOperationException("Class cannot be instantiated.");
  }

  @FunctionalInterface
  public interface MouseWheel {
    Method METHOD = ReflectTools.findMethod(MouseWheel.class, "mouseWheel", WheelEvent.MouseWheel.class);

    void mouseWheel(WheelEvent.MouseWheel event);
  }
}
