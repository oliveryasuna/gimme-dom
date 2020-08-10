package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtMessageHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtMessageEvent extends DomEvent<GwtMessageHandler> {
  private static final Type<GwtMessageHandler> TYPE = new Type<>(DomEventType.onmessage.getId(), new GwtMessageEvent());

  public static Type<GwtMessageHandler> getType() { return TYPE; }

  protected GwtMessageEvent() {}

  @Override
  public Type<GwtMessageHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtMessageHandler handler) { handler.onMessage(this); }
}
