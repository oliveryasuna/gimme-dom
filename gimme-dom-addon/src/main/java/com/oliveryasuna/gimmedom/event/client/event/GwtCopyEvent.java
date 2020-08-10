package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtCopyHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtCopyEvent extends DomEvent<GwtCopyHandler> {
  private static final Type<GwtCopyHandler> TYPE = new Type<>(DomEventType.oncopy.getId(), new GwtCopyEvent());

  public static Type<GwtCopyHandler> getType() { return TYPE; }

  protected GwtCopyEvent() {}

  @Override
  public Type<GwtCopyHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtCopyHandler handler) { handler.onCopy(this); }
}
