package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtCanPlayHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtCanPlayEvent extends DomEvent<GwtCanPlayHandler> {
  private static final Type<GwtCanPlayHandler> TYPE = new Type<>(DomEventType.oncanplay.getId(), new GwtCanPlayEvent());

  public static Type<GwtCanPlayHandler> getType() { return TYPE; }

  protected GwtCanPlayEvent() {}

  @Override
  public Type<GwtCanPlayHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtCanPlayHandler handler) { handler.onCanPlay(this); }
}
