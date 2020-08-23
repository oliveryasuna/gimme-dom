package com.oliveryasuna.gimmedom.event.event;

import com.oliveryasuna.gimmedom.event.shared.event.DomTouchEvent;
import com.vaadin.ui.Component;

public class TouchEvent extends UIEvent {
  public TouchEvent(final Component source, final DomTouchEvent domEvent) {
    super(source, domEvent);
  }

  @Override
  public DomTouchEvent getDomEvent() {
    return (DomTouchEvent)super.getDomEvent();
  }

  public static class TouchCancel extends TouchEvent {
    public TouchCancel(final Component source, final DomTouchEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class TouchEnd extends TouchEvent {
    public TouchEnd(final Component source, final DomTouchEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class TouchMove extends TouchEvent {
    public TouchMove(final Component source, final DomTouchEvent domEvent) {
      super(source, domEvent);
    }
  }

  public static class TouchStart extends TouchEvent {
    public TouchStart(final Component source, final DomTouchEvent domEvent) {
      super(source, domEvent);
    }
  }
}
