package com.oliveryasuna.gimmedom.event.listener;

import com.oliveryasuna.gimmedom.event.event.KeyboardEvent;
import com.vaadin.util.ReflectTools;

import java.lang.reflect.Method;

public class KeyboardListener {
  private KeyboardListener() {
    throw new UnsupportedOperationException("Class cannot be instantiated.");
  }

  @FunctionalInterface
  public interface KeyDown {
    Method METHOD = ReflectTools.findMethod(KeyDown.class, "keyDown", KeyboardEvent.KeyDown.class);

    void keyDown(KeyboardEvent.KeyDown event);
  }

  @FunctionalInterface
  public interface KeyPress {
    Method METHOD = ReflectTools.findMethod(KeyPress.class, "keyPress", KeyboardEvent.KeyPress.class);

    void keyPress(KeyboardEvent.KeyPress event);
  }

  @FunctionalInterface
  public interface KeyUp {
    Method METHOD = ReflectTools.findMethod(KeyUp.class, "keyUp", KeyboardEvent.KeyUp.class);

    void keyUp(KeyboardEvent.KeyUp event);
  }
}
