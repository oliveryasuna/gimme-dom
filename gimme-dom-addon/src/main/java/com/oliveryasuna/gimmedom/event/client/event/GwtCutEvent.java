package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtCutHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtCutEvent extends DomEvent<GwtCutHandler> {
  private static final Type<GwtCutHandler> TYPE = new Type<>(DomEventType.oncut.getId(), new GwtCutEvent());

  public static Type<GwtCutHandler> getType() { return TYPE; }

  protected GwtCutEvent() {}

  @Override
  public Type<GwtCutHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtCutHandler handler) { handler.onCut(this); }
}
