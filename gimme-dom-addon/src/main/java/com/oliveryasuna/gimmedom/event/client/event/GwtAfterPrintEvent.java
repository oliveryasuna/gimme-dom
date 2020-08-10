package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtAfterPrintHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtAfterPrintEvent extends DomEvent<GwtAfterPrintHandler> {
  private static final Type<GwtAfterPrintHandler> TYPE = new Type<>(DomEventType.onafterprint.getId(), new GwtAfterPrintEvent());

  public static Type<GwtAfterPrintHandler> getType() { return TYPE; }

  protected GwtAfterPrintEvent() {}

  @Override
  public Type<GwtAfterPrintHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtAfterPrintHandler handler) { handler.onAfterPrint(this); }
}
