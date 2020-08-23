package com.oliveryasuna.gimmedom.source;

import com.vaadin.server.AbstractExtension;
import com.vaadin.ui.AbstractComponent;

/**
 * An extension to manipulate DOM source.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public class GimmeSource extends AbstractExtension {
  protected final AbstractComponent component;

  public GimmeSource(final AbstractComponent component) {
    extend(this.component = component);
  }
}
