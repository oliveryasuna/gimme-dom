package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtAnimationEndHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtAnimationEndEvent extends DomEvent<GwtAnimationEndHandler> {
  private static final Type<GwtAnimationEndHandler> TYPE = new Type<>(DomEventType.onanimationend.getId(), new GwtAnimationEndEvent());

  public static Type<GwtAnimationEndHandler> getType() { return TYPE; }

  protected GwtAnimationEndEvent() {}

  @Override
  public Type<GwtAnimationEndHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtAnimationEndHandler handler) { handler.onAnimationEnd(this); }
}
