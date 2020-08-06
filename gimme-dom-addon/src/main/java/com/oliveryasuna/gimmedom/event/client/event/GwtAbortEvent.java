package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtAbortHandler;

public class GwtAbortEvent extends DomEvent<GwtAbortHandler> {
  private static final Type<GwtAbortHandler> TYPE = new Type<>("abort", new GwtAbortEvent());

  public static Type<GwtAbortHandler> getType() { return TYPE; }

  protected GwtAbortEvent() {}

  @Override
  public Type<GwtAbortHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtAbortHandler handler) { handler.onAbort(this); }
}
