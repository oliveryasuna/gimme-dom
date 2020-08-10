package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.oliveryasuna.gimmedom.event.client.handler.GwtDurationChangeHandler;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

public class GwtDurationChangeEvent extends DomEvent<GwtDurationChangeHandler> {
  private static final Type<GwtDurationChangeHandler> TYPE = new Type<>(DomEventType.ondurationchange.getId(), new GwtDurationChangeEvent());

  public static Type<GwtDurationChangeHandler> getType() { return TYPE; }

  protected GwtDurationChangeEvent() {}

  @Override
  public Type<GwtDurationChangeHandler> getAssociatedType() { return TYPE; }

  @Override
  protected void dispatch(final GwtDurationChangeHandler handler) { handler.onDurationChange(this); }
}
