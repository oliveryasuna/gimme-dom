package com.oliveryasuna.gimmedom.event.shared.event;

import com.oliveryasuna.gimmedom.event.shared.data.DomEventType;

import java.io.Serializable;

/**
 * Represents the DOM Event.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
// TODO: Review. If any new fields are added then make sure ot update DomEventBuilder.
public class DomEvent implements Serializable {
  protected DomEventType type;
  protected final long timeStamp = System.currentTimeMillis();

  // TODO: UIObject info.
  private boolean stopPropagation;

  public void stopPropagation() { stopPropagation = true; }

  public final DomEventType getType() { return type; }
  public final void setType(final DomEventType type) { this.type = type; }

  public final long getTimeStamp() { return timeStamp; }

  public final boolean shouldStopPropagation() { return stopPropagation; }

  @Override
  public String toString() {
    return getClass().getSimpleName() + '{' +
               "type=" + type +
               ", timeStamp=" + timeStamp +
               '}';
  }
}
