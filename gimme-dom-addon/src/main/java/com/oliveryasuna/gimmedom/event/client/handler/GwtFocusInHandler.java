package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtFocusInEvent;

/**
 * Handler for {@link GwtFocusInEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtFocusInHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtFocusInEvent} that was fired.
   * @since 1.0.0
   */
  void onFocusIn(GwtFocusInEvent event);
}
