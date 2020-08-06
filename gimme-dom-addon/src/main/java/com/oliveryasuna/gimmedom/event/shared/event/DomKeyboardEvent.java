package com.oliveryasuna.gimmedom.event.shared.event;

import java.io.Serializable;

/**
 * Represents the DOM KeyboardEvent.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public class DomKeyboardEvent extends DomUIEvent implements Serializable {
  private boolean ctrlKey;
  private boolean shiftKey;
  private boolean altKey;
  private boolean metaKey;
  private int keyCode;
  private int charCode;

  public final boolean isCtrlKey() { return ctrlKey; }
  public final void setCtrlKey(final boolean ctrlKey) { this.ctrlKey = ctrlKey; }

  public final boolean isShiftKey() { return shiftKey; }
  public final void setShiftKey(final boolean shiftKey) { this.shiftKey = shiftKey; }

  public final boolean isAltKey() { return altKey; }
  public final void setAltKey(final boolean altKey) { this.altKey = altKey; }

  public final boolean isMetaKey() { return metaKey; }
  public final void setMetaKey(final boolean metaKey) { this.metaKey = metaKey; }

  public final int getKeyCode() { return keyCode; }
  public final void setKeyCode(final int keyCode) { this.keyCode = keyCode; }

  public final int getCharCode() { return charCode; }
  public final void setCharCode(final int charCode) { this.charCode = charCode; }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "{" +
        "type='" + getType() + '\'' +
        ", timeStamp=" + getTimeStamp() +
        ", ctrlKey=" + ctrlKey +
        ", shiftKey=" + shiftKey +
        ", altKey=" + altKey +
        ", metaKey=" + metaKey +
        ", keyCode=" + keyCode +
        ", charCode=" + charCode +
        '}';
  }
}
