package com.oliveryasuna.gimmedom.event.event;

import com.oliveryasuna.gimmedom.event.shared.event.DomMouseEvent;
import com.vaadin.ui.Component;

/**
 * For {@link DomMouseEvent}s.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public class MouseEvent extends UIEvent {
  public MouseEvent(final Component source, final DomMouseEvent domEvent) {
    super(source, domEvent);
  }

  @Override
  public DomMouseEvent getDomEvent() {
    return (DomMouseEvent)super.getDomEvent();
  }

  public static class Click extends MouseEvent {
    public Click(final Component source, final DomMouseEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class ContextMenu extends MouseEvent {
    public ContextMenu(final Component source, final DomMouseEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class DoubleClick extends MouseEvent {
    public DoubleClick(final Component source, final DomMouseEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class MouseDown extends MouseEvent {
    public MouseDown(final Component source, final DomMouseEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class MouseMove extends MouseEvent {
    public MouseMove(final Component source, final DomMouseEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class MouseOver extends MouseEvent {
    public MouseOver(final Component source, final DomMouseEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class MouseOut extends MouseEvent {
    public MouseOut(final Component source, final DomMouseEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class MouseUp extends MouseEvent {
    public MouseUp(final Component source, final DomMouseEvent domEvent) {
      super(source, domEvent);
    }
  }
}
