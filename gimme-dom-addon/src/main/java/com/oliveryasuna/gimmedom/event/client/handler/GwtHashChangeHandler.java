package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtHashChangeEvent;

/**
 * Handler for {@link GwtHashChangeEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtHashChangeHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtHashChangeEvent} that was fired.
   * @since 1.0.0
   */
  void onHashChange(GwtHashChangeEvent event);
}
