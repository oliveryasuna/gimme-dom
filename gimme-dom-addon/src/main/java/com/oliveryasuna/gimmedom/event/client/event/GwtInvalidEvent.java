package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtInvalidHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtInvalidEvent extends DomEvent<GwtInvalidHandler> {
  private static final Type<GwtInvalidHandler> TYPE = new Type<>(DomEventType.oninvalid.getId(), new GwtInvalidEvent());

  public static Type<GwtInvalidHandler> getType() { return TYPE; }

  protected GwtInvalidEvent() {}

  @Override
  public Type<GwtInvalidHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtInvalidHandler handler) { handler.onInvalid(this); }
}
