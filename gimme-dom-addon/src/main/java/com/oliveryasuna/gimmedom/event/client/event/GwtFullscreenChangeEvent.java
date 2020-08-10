package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtFullscreenChangeHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtFullscreenChangeEvent extends DomEvent<GwtFullscreenChangeHandler> {
  private static final Type<GwtFullscreenChangeHandler> TYPE = new Type<>(DomEventType.onfullscreenchange.getId(), new GwtFullscreenChangeEvent());

  public static Type<GwtFullscreenChangeHandler> getType() { return TYPE; }

  protected GwtFullscreenChangeEvent() {}

  @Override
  public Type<GwtFullscreenChangeHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtFullscreenChangeHandler handler) { handler.onFullscreenChange(this); }
}
