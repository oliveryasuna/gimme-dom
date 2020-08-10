package com.oliveryasuna.gimmedom.event.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.oliveryasuna.gimmedom.event.client.event.GwtAnimationEndEvent;

/**
 * Handler for {@link GwtAnimationEndEvent} events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GwtAnimationEndHandler extends EventHandler {
  /**
   * Called when a native abort event is fired.
   *
   * @param event The {@link GwtAnimationEndEvent} that was fired.
   * @since 1.0.0
   */
  void onAnimationEnd(GwtAnimationEndEvent event);
}
