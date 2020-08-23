package com.oliveryasuna.gimmedom.event.event;

import com.oliveryasuna.gimmedom.event.shared.event.DomUIEvent;
import com.vaadin.ui.Component;

/**
 * For {@link DomUIEvent}s.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public class UIEvent extends Event {
  public UIEvent(final Component source, final DomUIEvent domEvent) {
    super(source, domEvent);
  }

  @Override
  public DomUIEvent getDomEvent() {
    return (DomUIEvent)super.getDomEvent();
  }
}
