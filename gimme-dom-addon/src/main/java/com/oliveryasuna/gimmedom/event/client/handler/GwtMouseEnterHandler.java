package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtMouseEnterEvent;

/**
 * Handler for {@link GwtMouseEnterEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtMouseEnterHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtMouseEnterEvent} that was fired.
   * @since 1.0.0
   */
  void onMouseEnter(GwtMouseEnterEvent event);
}
