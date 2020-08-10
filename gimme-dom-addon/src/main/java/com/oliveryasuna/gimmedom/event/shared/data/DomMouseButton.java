package com.oliveryasuna.gimmedom.event.shared.data;

import java.io.Serializable;
import java.util.Objects;

/**
 * Possible DOM MouseEvent button types.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public enum DomMouseButton implements Serializable {
  MAIN_BUTTON(0),
  AUXILIARY_BUTTON(1),
  SECONDARY_BUTTON(2),
  FOURTH_BUTTON(3),
  FIFTH_BUTTON(4);

  public static DomMouseButton getById(final int id) {
    Objects.requireNonNull(id);

    for(final DomMouseButton domMouseButton : values()) {
      if(domMouseButton.id == id) return domMouseButton;
    }

    return null;
  }

  private final int id;

  DomMouseButton(final int id) { this.id = id; }

  public final int getId() {
    return id;
  }
}
