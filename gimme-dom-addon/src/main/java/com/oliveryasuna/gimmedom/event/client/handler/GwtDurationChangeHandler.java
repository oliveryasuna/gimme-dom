package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtDurationChangeEvent;

/**
 * Handler for {@link GwtDurationChangeEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtDurationChangeHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtDurationChangeEvent} that was fired.
   * @since 1.0.0
   */
  void onDurationChange(GwtDurationChangeEvent event);
}
