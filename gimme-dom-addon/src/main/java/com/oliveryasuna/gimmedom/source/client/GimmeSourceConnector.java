package com.oliveryasuna.gimmedom.source.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.Widget;
import com.oliveryasuna.gimmedom.source.GimmeSource;
import com.vaadin.client.ComponentConnector;
import com.vaadin.client.ServerConnector;
import com.vaadin.client.extensions.AbstractExtensionConnector;
import com.vaadin.shared.ui.Connect;

/**
 * The {@link GimmeSource} connector.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
@Connect(GimmeSource.class)
public class GimmeSourceConnector extends AbstractExtensionConnector {
  protected Element element;
  protected Style style;

  @Override
  protected void init() {
    registerRpc(GimmeSourceClientRpc.class, new GimmeSourceClientRpcImpl());
  }

  @Override
  protected void extend(final ServerConnector target) {
    final Widget widget = ((ComponentConnector)target).getWidget();

    element = widget.getElement();
    style = element.getStyle();
  }

  private final class GimmeSourceClientRpcImpl implements GimmeSourceClientRpc {
    @Override
    public void setPropertyBoolean(final String name, final boolean value) { element.setPropertyBoolean(name, value); }

    @Override
    public void setPropertyInteger(final String name, final int value) { element.setPropertyInt(name, value); }

    @Override
    public void setPropertyDouble(final String name, final double value) { element.setPropertyDouble(name, value); }

    @Override
    public void setPropertyString(final String name, final String value) { element.setPropertyString(name, value); }

    @Override
    public void setProperty(final String name, final Object value) {
      if(value.getClass() == Boolean.class) {
        setPropertyBoolean(name, (Boolean)value);
      } else if(value.getClass() == Integer.class) {
        setPropertyInteger(name, (Integer)value);
      } else if(value.getClass() == Double.class) {
        setPropertyDouble(name, (Double)value);
      } else if(value.getClass() == String.class) {
        setPropertyString(name, (String)value);
      } else {
        element.setPropertyObject(name, value);
      }
    }

    @Override
    public void clearStyleProperty(final String name) { style.clearProperty(name); }

    @Override
    public void setStyleProperty(final String name, final String value) { style.setProperty(name, value); }
  }
}
