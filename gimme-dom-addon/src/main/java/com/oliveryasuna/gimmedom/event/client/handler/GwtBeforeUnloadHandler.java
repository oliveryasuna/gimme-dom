package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtBeforeUnloadEvent;

/**
 * Handler for {@link GwtBeforeUnloadEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtBeforeUnloadHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtBeforeUnloadEvent} that was fired.
   * @since 1.0.0
   */
  void onBeforeUnload(GwtBeforeUnloadEvent event);
}
