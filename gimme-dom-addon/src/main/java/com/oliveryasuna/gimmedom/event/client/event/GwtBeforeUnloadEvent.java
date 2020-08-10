package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtBeforeUnloadHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtBeforeUnloadEvent extends DomEvent<GwtBeforeUnloadHandler> {
  private static final Type<GwtBeforeUnloadHandler> TYPE = new Type<>(DomEventType.onbeforeunload.getId(), new GwtBeforeUnloadEvent());

  public static Type<GwtBeforeUnloadHandler> getType() { return TYPE; }

  protected GwtBeforeUnloadEvent() {}

  @Override
  public Type<GwtBeforeUnloadHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtBeforeUnloadHandler handler) { handler.onBeforeUnload(this); }
}
