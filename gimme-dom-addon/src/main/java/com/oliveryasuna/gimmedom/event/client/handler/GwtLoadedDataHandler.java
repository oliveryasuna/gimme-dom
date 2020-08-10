package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtLoadedDataEvent;

/**
 * Handler for {@link GwtLoadedDataEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtLoadedDataHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtLoadedDataEvent} that was fired.
   * @since 1.0.0
   */
  void onLoadedData(GwtLoadedDataEvent event);
}
