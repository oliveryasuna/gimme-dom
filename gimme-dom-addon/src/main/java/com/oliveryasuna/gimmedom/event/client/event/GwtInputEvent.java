package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtInputHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtInputEvent extends DomEvent<GwtInputHandler> {
  private static final Type<GwtInputHandler> TYPE = new Type<>(DomEventType.oninput.getId(), new GwtInputEvent());

  public static Type<GwtInputHandler> getType() { return TYPE; }

  protected GwtInputEvent() {}

  @Override
  public Type<GwtInputHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtInputHandler handler) { handler.onInput(this); }
}
