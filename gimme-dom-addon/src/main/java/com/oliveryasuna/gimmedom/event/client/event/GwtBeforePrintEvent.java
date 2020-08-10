package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtBeforePrintHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtBeforePrintEvent extends DomEvent<GwtBeforePrintHandler> {
  private static final Type<GwtBeforePrintHandler> TYPE = new Type<>(DomEventType.onbeforeprint.getId(), new GwtBeforePrintEvent());

  public static Type<GwtBeforePrintHandler> getType() { return TYPE; }

  protected GwtBeforePrintEvent() {}

  @Override
  public Type<GwtBeforePrintHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtBeforePrintHandler handler) { handler.onBeforePrint(this); }
}
