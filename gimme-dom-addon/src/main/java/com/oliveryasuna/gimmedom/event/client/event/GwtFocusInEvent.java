package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtFocusInHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtFocusInEvent extends DomEvent<GwtFocusInHandler> {
  private static final Type<GwtFocusInHandler> TYPE = new Type<>(DomEventType.onfocusin.getId(), new GwtFocusInEvent());

  public static Type<GwtFocusInHandler> getType() { return TYPE; }

  protected GwtFocusInEvent() {}

  @Override
  public Type<GwtFocusInHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtFocusInHandler handler) { handler.onFocusIn(this); }
}
