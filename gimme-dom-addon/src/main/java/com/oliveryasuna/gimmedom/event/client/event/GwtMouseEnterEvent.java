package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.MouseEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtMouseEnterHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtMouseEnterEvent extends MouseEvent<GwtMouseEnterHandler> {
  private static final Type<GwtMouseEnterHandler> TYPE = new Type<>(DomEventType.onmouseenter.getId(), new GwtMouseEnterEvent());

  public static Type<GwtMouseEnterHandler> getType() { return TYPE; }

  protected GwtMouseEnterEvent() {}

  @Override
  public Type<GwtMouseEnterHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtMouseEnterHandler handler) { handler.onMouseEnter(this); }
}
