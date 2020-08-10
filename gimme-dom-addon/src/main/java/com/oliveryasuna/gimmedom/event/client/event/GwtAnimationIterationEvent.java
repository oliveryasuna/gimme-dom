package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtAnimationIterationHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtAnimationIterationEvent extends DomEvent<GwtAnimationIterationHandler> {
  private static final Type<GwtAnimationIterationHandler> TYPE = new Type<>(DomEventType.onanimationiteration.getId(), new GwtAnimationIterationEvent());

  public static Type<GwtAnimationIterationHandler> getType() { return TYPE; }

  protected GwtAnimationIterationEvent() {}

  @Override
  public Type<GwtAnimationIterationHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtAnimationIterationHandler handler) { handler.onAnimationIteration(this); }
}
