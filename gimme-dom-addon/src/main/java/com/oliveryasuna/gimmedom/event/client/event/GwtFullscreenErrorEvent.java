package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtFullscreenErrorHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtFullscreenErrorEvent extends DomEvent<GwtFullscreenErrorHandler> {
  private static final Type<GwtFullscreenErrorHandler> TYPE = new Type<>(DomEventType.onfullscreenerror.getId(), new GwtFullscreenErrorEvent());

  public static Type<GwtFullscreenErrorHandler> getType() { return TYPE; }

  protected GwtFullscreenErrorEvent() {}

  @Override
  public Type<GwtFullscreenErrorHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtFullscreenErrorHandler handler) { handler.onFullscreenError(this); }
}
