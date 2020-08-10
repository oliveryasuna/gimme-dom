package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtAnimationStartHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtAnimationStartEvent extends DomEvent<GwtAnimationStartHandler> {
  private static final Type<GwtAnimationStartHandler> TYPE = new Type<>(DomEventType.onanimationstart.getId(), new GwtAnimationStartEvent());

  public static Type<GwtAnimationStartHandler> getType() { return TYPE; }

  protected GwtAnimationStartEvent() {}

  @Override
  public Type<GwtAnimationStartHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtAnimationStartHandler handler) { handler.onAnimationStart(this); }
}
