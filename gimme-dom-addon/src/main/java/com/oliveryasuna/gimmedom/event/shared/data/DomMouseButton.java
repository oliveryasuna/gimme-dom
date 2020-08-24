package com.oliveryasuna.gimmedom.event.shared.data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

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

  public static Optional<DomMouseButton> getByValue(final int value) {
    Objects.requireNonNull(value);

    return Arrays.stream(values()).filter(domMouseButton -> domMouseButton.value == value).findFirst();
  }

  private final int value;

  DomMouseButton(final int value) { this.value = value; }

  public final int getValue() {
    return value;
  }
}
