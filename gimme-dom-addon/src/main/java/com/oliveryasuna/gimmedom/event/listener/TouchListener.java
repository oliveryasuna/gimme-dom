package com.oliveryasuna.gimmedom.event.listener;

import com.oliveryasuna.gimmedom.event.event.TouchEvent;
import com.vaadin.util.ReflectTools;

import java.lang.reflect.Method;

public class TouchListener {
  private TouchListener() {
    throw new UnsupportedOperationException("Class cannot be instantiated.");
  }

  @FunctionalInterface
  public interface TouchCancel {
    Method METHOD = ReflectTools.findMethod(TouchCancel.class, "touchCancel", TouchEvent.TouchCancel.class);

    void touchCancel(TouchEvent.TouchCancel event);
  }

  @FunctionalInterface
  public interface TouchEnd {
    Method METHOD = ReflectTools.findMethod(TouchEnd.class, "touchEnd", TouchEvent.TouchEnd.class);

    void touchEnd(TouchEvent.TouchEnd event);
  }

  @FunctionalInterface
  public interface TouchMove {
    Method METHOD = ReflectTools.findMethod(TouchMove.class, "touchMove", TouchEvent.TouchMove.class);

    void touchMove(TouchEvent.TouchMove event);
  }

  @FunctionalInterface
  public interface TouchStart {
    Method METHOD = ReflectTools.findMethod(TouchStart.class, "touchStart", TouchEvent.TouchStart.class);

    void touchStart(TouchEvent.TouchStart event);
  }
}
