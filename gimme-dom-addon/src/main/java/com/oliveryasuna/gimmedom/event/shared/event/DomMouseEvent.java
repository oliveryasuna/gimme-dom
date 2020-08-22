package com.oliveryasuna.gimmedom.event.shared.event;

import com.oliveryasuna.gimmedom.event.shared.data.DomMouseButton;

import java.io.Serializable;

/**
 * Represents the DOM MouseEvent.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
// TODO: Review. If any new fields are added then make sure ot update DomEventBuilder.
public class DomMouseEvent extends DomUIEvent implements Serializable {
  protected long screenX;
  protected long screenY;
  protected long clientX;
  protected long clientY;
  protected boolean ctrlKey;
  protected boolean shiftKey;
  protected boolean altKey;
  protected boolean metaKey;
  protected DomMouseButton button;

  public final long getScreenX() { return screenX; }
  public final void setScreenX(final long screenX) { this.screenX = screenX; }
  public final long getScreenY() { return screenY; }
  public final void setScreenY(final long screenY) { this.screenY = screenY; }
  public final long getClientX() { return clientX; }
  public final void setClientX(final long clientX) { this.clientX = clientX; }
  public final long getClientY() { return clientY; }
  public final void setClientY(final long clientY) { this.clientY = clientY; }
  public final boolean isCtrlKey() { return ctrlKey; }
  public final void setCtrlKey(final boolean ctrlKey) { this.ctrlKey = ctrlKey; }
  public final boolean isShiftKey() { return shiftKey; }
  public final void setShiftKey(final boolean shiftKey) { this.shiftKey = shiftKey; }
  public final boolean isAltKey() { return altKey; }
  public final void setAltKey(final boolean altKey) { this.altKey = altKey; }
  public final boolean isMetaKey() { return metaKey; }
  public final void setMetaKey(final boolean metaKey) { this.metaKey = metaKey; }
  public final DomMouseButton getButton() { return button; }
  public final void setButton(final DomMouseButton button) { this.button = button; }

  @Override
  public String toString() {
    return getClass().getSimpleName() + '{' +
               "type='" + getType() + '\'' +
               ", timeStamp=" + getTimeStamp() +
               ", screenX=" + screenX +
               ", screenY=" + screenY +
               ", clientX=" + clientX +
               ", clientY=" + clientY +
               ", ctrlKey=" + ctrlKey +
               ", shiftKey=" + shiftKey +
               ", altKey=" + altKey +
               ", metaKey=" + metaKey +
               ", button=" + button +
               '}';
  }
}
