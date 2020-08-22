package com.oliveryasuna.gimmedom.event.shared.event;

import java.io.Serializable;

/**
 * Represents the DOM WheelEvent.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
// TODO: Review. If any new fields are added then make sure ot update DomEventBuilder.
public class DomWheelEvent extends DomMouseEvent implements Serializable {
  protected int deltaY;

  public final int getDeltaY() { return deltaY; }
  public final void setDeltaY(final int deltaY) { this.deltaY = deltaY; }

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
               ", deltaY=" + deltaY +
               '}';
  }
}
