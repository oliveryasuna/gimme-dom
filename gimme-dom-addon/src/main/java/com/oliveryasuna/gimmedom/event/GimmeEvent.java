package com.oliveryasuna.gimmedom.event;

import com.oliveryasuna.gimmedom.event.shared.GimmeEventServerRpc;
import com.vaadin.server.AbstractExtension;
import com.vaadin.ui.AbstractComponent;

/**
 * The {@link GimmeEvent} extension.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public class GimmeEvent extends AbstractExtension {
  protected final AbstractComponent component;

  public GimmeEvent(final AbstractComponent component) {
    extend(this.component = component);

    registerRpc(new GimmeEventServerRpcImpl());
  }

  private final class GimmeEventServerRpcImpl implements GimmeEventServerRpc {
  }
}
