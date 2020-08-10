package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.dom.client.NativeEvent;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;
import com.oliveryasuna.gimmedom.event.shared.data.DomMouseButton;
import com.oliveryasuna.gimmedom.event.shared.event.*;

/**
 * @author Oliver Yasuna
 */
public final class DomEventBuilder {
  public static DomEvent buildDomEvent(final NativeEvent nativeEvent) {
    final DomEvent result = new DomEvent();
    result.setType(DomEventType.getById(nativeEvent.getType()));

    return result;
  }

  public static DomUIEvent buildDomUIEvent(final NativeEvent nativeEvent) {
    final DomUIEvent result = new DomUIEvent();
    result.setType(DomEventType.getById(nativeEvent.getType()));

    return result;
  }

  public static DomFocusEvent buildDomFocusEvent(final NativeEvent nativeEvent) {
    final DomFocusEvent result = new DomFocusEvent();
    result.setType(DomEventType.getById(nativeEvent.getType()));

    return result;

  }

  public static DomMouseEvent buildDomMouseEvent(final NativeEvent nativeEvent) {
    final DomMouseEvent result = new DomMouseEvent();
    result.setType(DomEventType.getById(nativeEvent.getType()));
    result.setScreenX(nativeEvent.getScreenX());
    result.setScreenY(nativeEvent.getScreenY());
    result.setClientX(nativeEvent.getClientX());
    result.setClientY(nativeEvent.getClientY());
    result.setCtrlKey(nativeEvent.getCtrlKey());
    result.setShiftKey(nativeEvent.getShiftKey());
    result.setAltKey(nativeEvent.getAltKey());
    result.setMetaKey(nativeEvent.getMetaKey());
    result.setButton(DomMouseButton.getById(nativeEvent.getButton()));

    return result;
  }

  public static DomDragEvent buildDomDragEvent(final NativeEvent nativeEvent) {
    final DomDragEvent result = new DomDragEvent();
    result.setType(DomEventType.getById(nativeEvent.getType()));
    result.setScreenX(nativeEvent.getScreenX());
    result.setScreenY(nativeEvent.getScreenY());
    result.setClientX(nativeEvent.getClientX());
    result.setClientY(nativeEvent.getClientY());
    result.setCtrlKey(nativeEvent.getCtrlKey());
    result.setShiftKey(nativeEvent.getShiftKey());
    result.setAltKey(nativeEvent.getAltKey());
    result.setMetaKey(nativeEvent.getMetaKey());
    result.setButton(DomMouseButton.getById(nativeEvent.getButton()));

    return result;
  }

  public static DomKeyboardEvent buildDomKeyboardEvent(final NativeEvent nativeEvent) {
    final DomKeyboardEvent result = new DomKeyboardEvent();
    result.setType(DomEventType.getById(nativeEvent.getType()));
    result.setCtrlKey(nativeEvent.getCtrlKey());
    result.setShiftKey(nativeEvent.getShiftKey());
    result.setAltKey(nativeEvent.getAltKey());
    result.setMetaKey(nativeEvent.getMetaKey());
    result.setKeyCode(nativeEvent.getKeyCode());
    result.setCharCode(nativeEvent.getCharCode());

    return result;
  }
}
