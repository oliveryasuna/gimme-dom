package com.oliveryasuna.gimmedom.event.listener;

import com.oliveryasuna.gimmedom.event.event.DragEvent;
import com.vaadin.util.ReflectTools;

import java.lang.reflect.Method;

public class DragListener {
  private DragListener() {
    throw new UnsupportedOperationException("Class cannot be instantiated.");
  }

  @FunctionalInterface
  public interface Drag {
    Method METHOD = ReflectTools.findMethod(Drag.class, "drag", DragEvent.Drag.class);

    void drag(DragEvent.Drag event);
  }

  @FunctionalInterface
  public interface DragEnd {
    Method METHOD = ReflectTools.findMethod(DragEnd.class, "dragEnd", DragEvent.DragEnd.class);

    void dragEnd(DragEvent.DragEnd event);
  }

  @FunctionalInterface
  public interface DragEnter {
    Method METHOD = ReflectTools.findMethod(DragEnter.class, "dragEnter", DragEvent.DragEnter.class);

    void dragEnter(DragEvent.DragEnter event);
  }

  @FunctionalInterface
  public interface DragLeave {
    Method METHOD = ReflectTools.findMethod(DragLeave.class, "dragLeave", DragEvent.DragLeave.class);

    void dragLeave(DragEvent.DragLeave event);
  }

  @FunctionalInterface
  public interface DragOver {
    Method METHOD = ReflectTools.findMethod(DragOver.class, "dragOver", DragEvent.DragOver.class);

    void dragOver(DragEvent.DragOver event);
  }

  @FunctionalInterface
  public interface DragStart {
    Method METHOD = ReflectTools.findMethod(DragStart.class, "dragStart", DragEvent.DragStart.class);

    void dragStart(DragEvent.DragStart event);
  }

  @FunctionalInterface
  public interface Drop {
    Method METHOD = ReflectTools.findMethod(Drop.class, "drop", DragEvent.Drop.class);

    void drop(DragEvent.Drop event);
  }
}
