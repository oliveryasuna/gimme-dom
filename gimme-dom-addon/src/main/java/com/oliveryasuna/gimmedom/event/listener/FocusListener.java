package com.oliveryasuna.gimmedom.event.listener;

import com.oliveryasuna.gimmedom.event.event.FocusEvent;

@FunctionalInterface
public interface FocusListener extends Listener<FocusEvent> {
  void onFocusEventBase(FocusEvent event);

  @Override
  default void dispatch(final FocusEvent event) { onFocusEventBase(event); }

  @FunctionalInterface
  interface Blur extends Listener<FocusEvent.Blur> {
    void onBlurEvent(FocusEvent.Blur event);

    @Override
    default void dispatch(final FocusEvent.Blur event) { onBlurEvent(event); }
  }

  @FunctionalInterface
  interface Focus extends Listener<FocusEvent.Focus> {
    void onFocusEvent(FocusEvent.Focus event);

    @Override
    default void dispatch(final FocusEvent.Focus event) { onFocusEvent(event); }
  }
}
