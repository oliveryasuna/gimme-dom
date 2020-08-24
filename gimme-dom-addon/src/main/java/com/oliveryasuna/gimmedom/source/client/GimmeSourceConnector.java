package com.oliveryasuna.gimmedom.source.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;
import com.oliveryasuna.gimmedom.source.GimmeSource;
import com.oliveryasuna.gimmedom.source.shared.GimmeSourceState;
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
  @Override
  protected void extend(final ServerConnector target) {
    final Widget widget = ((ComponentConnector)target).getWidget();
    final Element element = widget.getElement();

    // TODO: Doesn't work.
    widget.addAttachHandler(gwtEvent -> {
      if(gwtEvent.isAttached()) {
        getState().clientWidth = element.getClientWidth();
      }
    });

    /*elemental.dom.Element elementalElement = Js.cast(element);
    elementalElement.*/
  }


  @Override
  public GimmeSourceState getState() {
    return (GimmeSourceState)super.getState();
  }
}
