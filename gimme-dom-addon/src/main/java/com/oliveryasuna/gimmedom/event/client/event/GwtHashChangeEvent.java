package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtHashChangeHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtHashChangeEvent extends DomEvent<GwtHashChangeHandler> {
  private static final Type<GwtHashChangeHandler> TYPE = new Type<>(DomEventType.onhashchange.getId(), new GwtHashChangeEvent());

  public static Type<GwtHashChangeHandler> getType() { return TYPE; }

  protected GwtHashChangeEvent() {}

  @Override
  public Type<GwtHashChangeHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtHashChangeHandler handler) { handler.onHashChange(this); }
}
