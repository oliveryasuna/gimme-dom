package com.oliveryasuna.gimmedom.event.event;

import com.oliveryasuna.gimmedom.event.shared.event.DomDragEvent;
import com.vaadin.ui.Component;

/**
 * For {@link DomDragEvent}s.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public class DragEvent extends MouseEvent {
  public DragEvent(final Component source, final DomDragEvent domEvent) {
    super(source, domEvent);
  }

  @Override
  public DomDragEvent getDomEvent() {
    return (DomDragEvent)super.getDomEvent();
  }

  public static class Drag extends DragEvent {
    public Drag(final Component source, final DomDragEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class DragEnd extends DragEvent {
    public DragEnd(final Component source, final DomDragEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class DragEnter extends DragEvent {
    public DragEnter(final Component source, final DomDragEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class DragLeave extends DragEvent {
    public DragLeave(final Component source, final DomDragEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class DragOver extends DragEvent {
    public DragOver(final Component source, final DomDragEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class DragStart extends DragEvent {
    public DragStart(final Component source, final DomDragEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class Drop extends DragEvent {
    public Drop(final Component source, final DomDragEvent domEvent) {
      super(source, domEvent);
    }
  }
}
