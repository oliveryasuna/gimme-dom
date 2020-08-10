package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtAnimationIterationEvent;

/**
 * Handler for {@link GwtAnimationIterationEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtAnimationIterationHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtAnimationIterationEvent} that was fired.
   * @since 1.0.0
   */
  void onAnimationIteration(GwtAnimationIterationEvent event);
}
