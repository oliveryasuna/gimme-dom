package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtFocusOutEvent;

/**
 * Handler for {@link GwtFocusOutEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtFocusOutHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtFocusOutEvent} that was fired.
   * @since 1.0.0
   */
  void onFocusOut(GwtFocusOutEvent event);
}
