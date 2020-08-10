package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtMessageEvent;

/**
 * Handler for {@link GwtMessageEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtMessageHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtMessageEvent} that was fired.
   * @since 1.0.0
   */
  void onMessage(GwtMessageEvent event);
}
