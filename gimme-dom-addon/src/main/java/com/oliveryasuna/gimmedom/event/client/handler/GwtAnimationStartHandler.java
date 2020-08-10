package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtAnimationStartEvent;

/**
 * Handler for {@link GwtAnimationStartEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtAnimationStartHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtAnimationStartEvent} that was fired.
   * @since 1.0.0
   */
  void onAnimationStart(GwtAnimationStartEvent event);
}
