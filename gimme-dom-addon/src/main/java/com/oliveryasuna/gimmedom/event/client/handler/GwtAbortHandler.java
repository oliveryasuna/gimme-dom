package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtAbortEvent;

/**
 * Handler for {@link GwtAbortEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtAbortHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtAbortEvent} that was fired.
   * @since 1.0.0
   */
  void onAbort(GwtAbortEvent event);
}
