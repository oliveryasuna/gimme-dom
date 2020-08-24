package com.oliveryasuna.gimmedom.source.client;

import com.oliveryasuna.gimmedom.source.GimmeSource;
import com.vaadin.shared.communication.ClientRpc;

/**
 * The {@link GimmeSource} client remote procedure calls.
 */
public interface GimmeSourceClientRpc extends ClientRpc {
  void setPropertyBoolean(String name, boolean value);
  void setPropertyInteger(String name, int value);
  void setPropertyDouble(String name, double value);
  void setPropertyString(String name, String value);
  // TODO: JavaScriptObject.
  void setProperty(String name, Object value);

  void clearStyleProperty(String name);
  void setStyleProperty(String name, String value);
}
