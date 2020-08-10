package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtFocusOutHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtFocusOutEvent extends DomEvent<GwtFocusOutHandler> {
  private static final Type<GwtFocusOutHandler> TYPE = new Type<>(DomEventType.onfocusout.getId(), new GwtFocusOutEvent());

  public static Type<GwtFocusOutHandler> getType() { return TYPE; }

  protected GwtFocusOutEvent() {}

  @Override
  public Type<GwtFocusOutHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtFocusOutHandler handler) { handler.onFocusOut(this); }
}
