package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtCanPlayEvent;

/**
 * Handler for {@link GwtCanPlayEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtCanPlayHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtCanPlayEvent} that was fired.
   * @since 1.0.0
   */
  void onCanPlay(GwtCanPlayEvent event);
}
