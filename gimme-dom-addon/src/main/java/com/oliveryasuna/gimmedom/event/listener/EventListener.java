package com.oliveryasuna.gimmedom.event.listener;

import com.oliveryasuna.gimmedom.event.event.Event;
import com.vaadin.util.ReflectTools;

import java.lang.reflect.Method;

public class EventListener {
  private EventListener() {
    throw new UnsupportedOperationException("Class cannot be instantiated.");
  }

  @FunctionalInterface
  public interface CanPlayThrough {
    Method METHOD = ReflectTools.findMethod(CanPlayThrough.class, "canPlayThrough", Event.CanPlayThrough.class);

    void canPlayThrough(Event.CanPlayThrough event);
  }

  @FunctionalInterface
  public interface Change {
    Method METHOD = ReflectTools.findMethod(Change.class, "change", Event.Change.class);

    void change(Event.Change event);
  }

  @FunctionalInterface
  public interface Ended {
    Method METHOD = ReflectTools.findMethod(Ended.class, "ended", Event.Ended.class);

    void ended(Event.Ended event);
  }

  @FunctionalInterface
  public interface Error {
    Method METHOD = ReflectTools.findMethod(Error.class, "error", Event.Error.class);

    void error(Event.Error event);
  }

  @FunctionalInterface
  public interface Input {
    Method METHOD = ReflectTools.findMethod(Input.class, "input", Event.Input.class);

    void input(Event.Input event);
  }

  @FunctionalInterface
  public interface Load {
    Method METHOD = ReflectTools.findMethod(Load.class, "load", Event.Load.class);

    void load(Event.Load event);
  }

  @FunctionalInterface
  public interface LoadedMetadata {
    Method METHOD = ReflectTools.findMethod(LoadedMetadata.class, "loadedMetadata", Event.LoadedMetadata.class);

    void loadedMetadata(Event.LoadedMetadata event);
  }

  @FunctionalInterface
  public interface Progress {
    Method METHOD = ReflectTools.findMethod(Progress.class, "progress", Event.Progress.class);

    void progress(Event.Progress event);
  }

  @FunctionalInterface
  public interface Scroll {
    Method METHOD = ReflectTools.findMethod(Scroll.class, "scroll", Event.Scroll.class);

    void scroll(Event.Scroll event);
  }
}
