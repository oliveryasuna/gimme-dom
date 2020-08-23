package com.oliveryasuna.gimmedom.event.event;

import com.oliveryasuna.gimmedom.event.shared.event.DomKeyboardEvent;
import com.oliveryasuna.gimmedom.event.shared.event.DomUIEvent;
import com.vaadin.ui.Component;

/**
 * For {@link DomKeyboardEvent}s.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public class KeyboardEvent extends UIEvent {
  public KeyboardEvent(final Component source, final DomKeyboardEvent domEvent) {
    super(source, domEvent);
  }

  @Override
  public DomUIEvent getDomEvent() {
    return super.getDomEvent();
  }

  public static class KeyDown extends KeyboardEvent {
    public KeyDown(final Component source, final DomKeyboardEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class KeyPress extends KeyboardEvent {
    public KeyPress(final Component source, final DomKeyboardEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class KeyUp extends KeyboardEvent {
    public KeyUp(final Component source, final DomKeyboardEvent domEvent) {
      super(source, domEvent);
    }
  }
}
