package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtCutEvent;

/**
 * Handler for {@link GwtCutEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtCutHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtCutEvent} that was fired.
   * @since 1.0.0
   */
  void onCut(GwtCutEvent event);
}
