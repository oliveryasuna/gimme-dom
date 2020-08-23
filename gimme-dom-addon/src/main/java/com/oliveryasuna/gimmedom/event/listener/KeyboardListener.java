package com.oliveryasuna.gimmedom.event.listener;

import com.oliveryasuna.gimmedom.event.event.KeyboardEvent;

@FunctionalInterface
public interface KeyboardListener extends Listener<KeyboardEvent> {
  void onKeyboardEvent(final KeyboardEvent event);

  @Override
  default void dispatch(final KeyboardEvent event) { onKeyboardEvent(event); }

  @FunctionalInterface
  interface KeyDown extends Listener<KeyboardEvent.KeyDown> {
    void onKeyDownEvent(KeyboardEvent.KeyDown event);

    @Override
    default void dispatch(final KeyboardEvent.KeyDown event) { onKeyDownEvent(event); }
  }

  @FunctionalInterface
  interface KeyPress extends Listener<KeyboardEvent.KeyPress> {
    void onKeyPressEvent(KeyboardEvent.KeyPress event);

    @Override
    default void dispatch(final KeyboardEvent.KeyPress event) { onKeyPressEvent(event); }
  }

  @FunctionalInterface
  interface KeyUp extends Listener<KeyboardEvent.KeyUp> {
    void onKeyUpEvent(KeyboardEvent.KeyUp event);

    @Override
    default void dispatch(final KeyboardEvent.KeyUp event) { onKeyUpEvent(event); }
  }
}
