package com.oliveryasuna.gimmedom.event.event;

import com.oliveryasuna.gimmedom.event.shared.event.DomWheelEvent;
import com.vaadin.ui.Component;

/**
 * For {@link DomWheelEvent}s.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public class WheelEvent extends MouseEvent {
  public WheelEvent(final Component source, final DomWheelEvent domEvent) {
    super(source, domEvent);
  }

  @Override
  public DomWheelEvent getDomEvent() {
    return (DomWheelEvent)super.getDomEvent();
  }

  public static class MouseWheel extends WheelEvent {
    public MouseWheel(final Component source, final DomWheelEvent domEvent) {
      super(source, domEvent);
    }
  }
}
