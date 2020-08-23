package com.oliveryasuna.gimmedom.event.listener;

import com.oliveryasuna.gimmedom.event.event.MouseEvent;
import com.vaadin.util.ReflectTools;

import java.lang.reflect.Method;

public class MouseListener {
  private MouseListener() {
    throw new UnsupportedOperationException("Class cannot be instantiated.");
  }

  @FunctionalInterface
  public interface Click {
    Method METHOD = ReflectTools.findMethod(Click.class, "click", MouseEvent.Click.class);

    void click(MouseEvent.Click event);
  }

  @FunctionalInterface
  public interface ContextMenu {
    Method METHOD = ReflectTools.findMethod(ContextMenu.class, "contextMenu", MouseEvent.ContextMenu.class);

    void contextMenu(MouseEvent.ContextMenu event);
  }

  @FunctionalInterface
  public interface DoubleClick {
    Method METHOD = ReflectTools.findMethod(DoubleClick.class, "doubleClick", MouseEvent.DoubleClick.class);

    void doubleClick(MouseEvent.DoubleClick event);
  }

  @FunctionalInterface
  public interface MouseDown {
    Method METHOD = ReflectTools.findMethod(MouseDown.class, "mouseDown", MouseEvent.MouseDown.class);

    void mouseDown(MouseEvent.MouseDown event);
  }

  @FunctionalInterface
  public interface MouseMove {
    Method METHOD = ReflectTools.findMethod(MouseMove.class, "mouseMove", MouseEvent.MouseMove.class);

    void mouseMove(MouseEvent.MouseMove event);
  }

  @FunctionalInterface
  public interface MouseOver {
    Method METHOD = ReflectTools.findMethod(MouseOver.class, "mouseOver", MouseEvent.MouseOver.class);

    void mouseOver(MouseEvent.MouseOver event);
  }

  @FunctionalInterface
  public interface MouseOut {
    Method METHOD = ReflectTools.findMethod(MouseOut.class, "mouseOut", MouseEvent.MouseOut.class);

    void mouseOut(MouseEvent.MouseOut event);
  }

  @FunctionalInterface
  public interface MouseUp {
    Method METHOD = ReflectTools.findMethod(MouseUp.class, "mouseUp", MouseEvent.MouseUp.class);

    void mouseUp(MouseEvent.MouseUp event);
  }
}
