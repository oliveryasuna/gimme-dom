package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtInvalidEvent;

/**
 * Handler for {@link GwtInvalidEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtInvalidHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtInvalidEvent} that was fired.
   * @since 1.0.0
   */
  void onInvalid(GwtInvalidEvent event);
}
