package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtFullscreenErrorEvent;

/**
 * Handler for {@link GwtFullscreenErrorEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtFullscreenErrorHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtFullscreenErrorEvent} that was fired.
   * @since 1.0.0
   */
  void onFullscreenError(GwtFullscreenErrorEvent event);
}
