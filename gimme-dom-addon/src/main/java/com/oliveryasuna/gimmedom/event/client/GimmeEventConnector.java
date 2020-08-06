package com.oliveryasuna.gimmedom.event.client;

import com.google.gwt.user.client.ui.Widget;
import com.oliveryasuna.gimmedom.event.GimmeEvent;
import com.oliveryasuna.gimmedom.event.client.event.DomEventBuilder;
import com.oliveryasuna.gimmedom.event.client.event.GwtAbortEvent;
import com.oliveryasuna.gimmedom.event.shared.GimmeEventServerRpc;
import com.vaadin.client.ComponentConnector;
import com.vaadin.client.ServerConnector;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.extensions.AbstractExtensionConnector;

/**
 * The {@link GimmeEvent} connector.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public class GimmeEventConnector extends AbstractExtensionConnector {
  private final GimmeEventServerRpc serverRpc = RpcProxy.create(GimmeEventServerRpc.class, this);

  @Override
  protected void init() {
    super.init();
  }

  @Override
  protected void extend(final ServerConnector target) {
    final Widget widget = ((ComponentConnector)target).getWidget();

    widget.addDomHandler((gwtEvent) -> serverRpc.onabort(DomEventBuilder.buildDomEvent(gwtEvent.getNativeEvent())), GwtAbortEvent.getType());
  }
}
