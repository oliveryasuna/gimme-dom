package com.oliveryasuna.gimmedom.event.event;

import com.oliveryasuna.gimmedom.event.shared.event.DomEvent;
import com.vaadin.ui.Component;

/**
 * For {@link DomEvent}s.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public class Event extends Component.Event {
  protected final DomEvent domEvent;

  public Event(final Component source, final DomEvent domEvent) {
    super(source);

    this.domEvent = domEvent;
  }

  public DomEvent getDomEvent() {
    return domEvent;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + '{' +
               "source=" + source +
               ", domEvent=" + domEvent +
               '}';
  }

  public static class CanPlayThrough extends Event {
    public CanPlayThrough(final Component source, final DomEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class Change extends Event {
    public Change(final Component source, final DomEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class Ended extends Event {
    public Ended(final Component source, final DomEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class Error extends Event {
    public Error(final Component source, final DomEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class Input extends Event {
    public Input(final Component source, final DomEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class Load extends Event {
    public Load(final Component source, final DomEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class LoadedMetadata extends Event {
    public LoadedMetadata(final Component source, final DomEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class Progress extends Event {
    public Progress(final Component source, final DomEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class Scroll extends Event {
    public Scroll(final Component source, final DomEvent domEvent) {
      super(source, domEvent);
    }
  }
}
