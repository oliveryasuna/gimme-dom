package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtFullscreenChangeEvent;

/**
 * Handler for {@link GwtFullscreenChangeEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtFullscreenChangeHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtFullscreenChangeEvent} that was fired.
   * @since 1.0.0
   */
  void onFullscreenChange(GwtFullscreenChangeEvent event);
}
