package com.oliveryasuna.gimmedom.source;

import com.oliveryasuna.gimmedom.source.client.GimmeSourceClientRpc;
import com.oliveryasuna.gimmedom.source.shared.data.CssLengthUnit;
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

  protected final GimmeSourceClientRpc clientRpc = getRpcProxy(GimmeSourceClientRpc.class);

  public GimmeSource(final AbstractComponent component) {
    extend(this.component = component);
  }

  // TODO: Getters.

  public void setPropertyBoolean(final String name, final boolean value) { clientRpc.setPropertyBoolean(name, value); }
  public void setPropertyInteger(final String name, final int value) { clientRpc.setPropertyInteger(name, value); }
  public void setPropertyDouble(final String name, final double value) { clientRpc.setPropertyDouble(name, value); }
  public void setPropertyString(final String name, final String value) { clientRpc.setPropertyString(name, value); }
  public void setProperty(final String name, final Object value) { clientRpc.setProperty(name, value); }

  public void clearStyleProperty(final String name) { clientRpc.clearStyleProperty(name); }
  public void setStyleProperty(final String name, final String value) { clientRpc.setStyleProperty(name, value); }
  public void setStyleProperty(final String name, final double value, final CssLengthUnit unit) { clientRpc.setStyleProperty(name, value + unit.getSymbol()); }
}
