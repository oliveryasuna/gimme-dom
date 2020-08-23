package com.oliveryasuna.gimmedom.event.listener;

import com.oliveryasuna.gimmedom.event.event.TouchEvent;

@FunctionalInterface
public interface TouchListener extends Listener<TouchEvent> {
  void onTouchEvent(TouchEvent event);

  @Override
  default void dispatch(final TouchEvent event) { onTouchEvent(event); }

  @FunctionalInterface
  interface TouchCancel extends Listener<TouchEvent.TouchCancel> {
    void onTouchCancelEvent(TouchEvent.TouchCancel event);

    @Override
    default void dispatch(final TouchEvent.TouchCancel event) { onTouchCancelEvent(event); }
  }

  @FunctionalInterface
  interface TouchEnd extends Listener<TouchEvent.TouchEnd> {
    void onTouchEndEvent(TouchEvent.TouchEnd event);

    @Override
    default void dispatch(final TouchEvent.TouchEnd event) { onTouchEndEvent(event); }
  }

  @FunctionalInterface
  interface TouchMove extends Listener<TouchEvent.TouchMove> {
    void onTouchMoveEvent(TouchEvent.TouchMove event);

    @Override
    default void dispatch(final TouchEvent.TouchMove event) { onTouchMoveEvent(event); }
  }

  @FunctionalInterface
  interface TouchStart extends Listener<TouchEvent.TouchStart> {
    void onTouchStartEvent(TouchEvent.TouchStart event);

    @Override
    default void dispatch(final TouchEvent.TouchStart event) { onTouchStartEvent(event); }
  }
}
