package com.oliveryasuna.gimmedom.event.client.event;

import com.google.gwt.dom.client.NativeEvent;
import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;
import com.oliveryasuna.gimmedom.event.shared.data.DomMouseButton;
import com.oliveryasuna.gimmedom.event.shared.event.*;

/**
 * For building {@link DomEvent}s.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public final class DomEventBuilder {
  public static DomEvent buildDomEvent(final NativeEvent nativeEvent) {
    final DomEvent result = new DomEvent();
    result.setType(DomEventType.getByValue(nativeEvent.getType()).orElse(null));

    return result;
  }

  public static DomUIEvent buildDomUIEvent(final NativeEvent nativeEvent) {
    final DomUIEvent result = new DomUIEvent();
    result.setType(DomEventType.getByValue(nativeEvent.getType()).orElse(null));

    return result;
  }

  public static DomFocusEvent buildDomFocusEvent(final NativeEvent nativeEvent) {
    final DomFocusEvent result = new DomFocusEvent();
    result.setType(DomEventType.getByValue(nativeEvent.getType()).orElse(null));

    return result;

  }

  public static DomMouseEvent buildDomMouseEvent(final NativeEvent nativeEvent) {
    final DomMouseEvent result = new DomMouseEvent();
    result.setType(DomEventType.getByValue(nativeEvent.getType()).orElse(null));
    result.setScreenX(nativeEvent.getScreenX());
    result.setScreenY(nativeEvent.getScreenY());
    result.setClientX(nativeEvent.getClientX());
    result.setClientY(nativeEvent.getClientY());
    result.setCtrlKey(nativeEvent.getCtrlKey());
    result.setShiftKey(nativeEvent.getShiftKey());
    result.setAltKey(nativeEvent.getAltKey());
    result.setMetaKey(nativeEvent.getMetaKey());
    result.setButton(DomMouseButton.getByValue(nativeEvent.getButton()).orElse(null));

    return result;
  }

  public static DomDragEvent buildDomDragEvent(final NativeEvent nativeEvent) {
    final DomDragEvent result = new DomDragEvent();
    result.setType(DomEventType.getByValue(nativeEvent.getType()).orElse(null));
    result.setScreenX(nativeEvent.getScreenX());
    result.setScreenY(nativeEvent.getScreenY());
    result.setClientX(nativeEvent.getClientX());
    result.setClientY(nativeEvent.getClientY());
    result.setCtrlKey(nativeEvent.getCtrlKey());
    result.setShiftKey(nativeEvent.getShiftKey());
    result.setAltKey(nativeEvent.getAltKey());
    result.setMetaKey(nativeEvent.getMetaKey());
    result.setButton(DomMouseButton.getByValue(nativeEvent.getButton()).orElse(null));

    return result;
  }

  public static DomWheelEvent buildDomWheelEvent(final NativeEvent nativeEvent) {
    final DomWheelEvent result = new DomWheelEvent();
    result.setType(DomEventType.getByValue(nativeEvent.getType()).orElse(null));
    result.setScreenX(nativeEvent.getScreenX());
    result.setScreenY(nativeEvent.getScreenY());
    result.setClientX(nativeEvent.getClientX());
    result.setClientY(nativeEvent.getClientY());
    result.setCtrlKey(nativeEvent.getCtrlKey());
    result.setShiftKey(nativeEvent.getShiftKey());
    result.setAltKey(nativeEvent.getAltKey());
    result.setMetaKey(nativeEvent.getMetaKey());
    result.setButton(DomMouseButton.getByValue(nativeEvent.getButton()).orElse(null));
    result.setDeltaY(nativeEvent.getMouseWheelVelocityY());

    return result;
  }

  public static DomTouchEvent buildDomTouchEvent(final NativeEvent nativeEvent) {
    final DomTouchEvent result = new DomTouchEvent();
    result.setType(DomEventType.getByValue(nativeEvent.getType()).orElse(null));
    result.setCtrlKey(nativeEvent.getCtrlKey());
    result.setShiftKey(nativeEvent.getShiftKey());
    result.setAltKey(nativeEvent.getAltKey());
    result.setMetaKey(nativeEvent.getMetaKey());

    return result;
  }

  public static DomKeyboardEvent buildDomKeyboardEvent(final NativeEvent nativeEvent) {
    final DomKeyboardEvent result = new DomKeyboardEvent();
    result.setType(DomEventType.getByValue(nativeEvent.getType()).orElse(null));
    result.setCtrlKey(nativeEvent.getCtrlKey());
    result.setShiftKey(nativeEvent.getShiftKey());
    result.setAltKey(nativeEvent.getAltKey());
    result.setMetaKey(nativeEvent.getMetaKey());
    result.setKeyCode(nativeEvent.getKeyCode());
    result.setCharCode(nativeEvent.getCharCode());

    return result;
  }
}
