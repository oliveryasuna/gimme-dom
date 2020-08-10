package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtCopyEvent;

/**
 * Handler for {@link GwtCopyEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtCopyHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtCopyEvent} that was fired.
   * @since 1.0.0
   */
  void onCopy(GwtCopyEvent event);
}
