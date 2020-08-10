package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtInputEvent;

/**
 * Handler for {@link GwtInputEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtInputHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtInputEvent} that was fired.
   * @since 1.0.0
   */
  void onInput(GwtInputEvent event);
}
