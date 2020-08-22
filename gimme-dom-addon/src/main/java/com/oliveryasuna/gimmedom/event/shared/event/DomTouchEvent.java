package com.oliveryasuna.gimmedom.event.shared.event;

import java.io.Serializable;

/**
 * Represents the DOM TouchEvent.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
// TODO: Review. If any new fields are added then make sure ot update DomEventBuilder.
public class DomTouchEvent extends DomUIEvent implements Serializable {
  protected boolean ctrlKey;
  protected boolean shiftKey;
  protected boolean altKey;
  protected boolean metaKey;

  public final boolean isCtrlKey() { return ctrlKey; }
  public final void setCtrlKey(final boolean ctrlKey) { this.ctrlKey = ctrlKey; }
  public final boolean isShiftKey() { return shiftKey; }
  public final void setShiftKey(final boolean shiftKey) { this.shiftKey = shiftKey; }
  public final boolean isAltKey() { return altKey; }
  public final void setAltKey(final boolean altKey) { this.altKey = altKey; }
  public final boolean isMetaKey() { return metaKey; }
  public final void setMetaKey(final boolean metaKey) { this.metaKey = metaKey; }

  @Override
  public String toString() {
    return getClass().getSimpleName() + '{' +
               "type='" + getType() + '\'' +
               ", timeStamp=" + getTimeStamp() +
               ", ctrlKey=" + ctrlKey +
               ", shiftKey=" + shiftKey +
               ", altKey=" + altKey +
               ", metaKey=" + metaKey +
               '}';
  }
}
