package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtBeforePrintEvent;

/**
 * Handler for {@link GwtBeforePrintEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtBeforePrintHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtBeforePrintEvent} that was fired.
   * @since 1.0.0
   */
  void onBeforePrint(GwtBeforePrintEvent event);
}
