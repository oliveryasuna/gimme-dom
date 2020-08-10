package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtLoadedDataHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtLoadedDataEvent extends DomEvent<GwtLoadedDataHandler> {
  private static final Type<GwtLoadedDataHandler> TYPE = new Type<>(DomEventType.onloadeddata.getId(), new GwtLoadedDataEvent());

  public static Type<GwtLoadedDataHandler> getType() { return TYPE; }

  protected GwtLoadedDataEvent() {}

  @Override
  public Type<GwtLoadedDataHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtLoadedDataHandler handler) { handler.onLoadedData(this); }
}
