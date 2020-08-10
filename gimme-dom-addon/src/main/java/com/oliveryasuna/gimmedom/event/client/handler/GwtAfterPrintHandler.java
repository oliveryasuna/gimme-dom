package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtAfterPrintEvent;

/**
 * Handler for {@link GwtAfterPrintEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtAfterPrintHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtAfterPrintEvent} that was fired.
   * @since 1.0.0
   */
  void onAfterPrint(GwtAfterPrintEvent event);
}
