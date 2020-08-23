package com.oliveryasuna.gimmedom.event.listener;

import com.oliveryasuna.gimmedom.event.event.WheelEvent;

@FunctionalInterface
public interface WheelListener extends Listener<WheelEvent> {
  void onWheelEvent(WheelEvent event);

  @Override
  default void dispatch(final WheelEvent event) { onWheelEvent(event); }

  @FunctionalInterface
  interface MouseWheel extends Listener<WheelEvent.MouseWheel> {
    void onMouseWheelEvent(WheelEvent.MouseWheel event);

    @Override
    default void dispatch(final WheelEvent.MouseWheel event) { onMouseWheelEvent(event); }
  }
}
