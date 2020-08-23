package com.oliveryasuna.gimmedom.event.event;

import com.oliveryasuna.gimmedom.event.shared.event.DomFocusEvent;
import com.vaadin.ui.Component;

/**
 * For {@link DomFocusEvent}s.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public class FocusEvent extends UIEvent {
  public FocusEvent(final Component source, final DomFocusEvent domEvent) {
    super(source, domEvent);
  }

  @Override
  public DomFocusEvent getDomEvent() {
    return (DomFocusEvent)super.getDomEvent();
  }

  public static class Blur extends FocusEvent {
    public Blur(final Component source, final DomFocusEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class Focus extends FocusEvent {
    public Focus(final Component source, final DomFocusEvent domEvent) {
      super(source, domEvent);
    }
  }
}
