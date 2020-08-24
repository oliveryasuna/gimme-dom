package com.oliveryasuna.gimmedom.source.shared.data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Optional;

/**
 * Possible dir types.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public enum DomTextDirection implements Serializable {
  AUTO("auto"),
  LEFT_TO_RIGHT("ltr"),
  RIGHT_TO_LEFT("trl");

  public static Optional<DomTextDirection> getById(final String id) {
    return Arrays.stream(values()).filter(domNodeType -> domNodeType.id.equals(id)).findFirst();
  }

  private final String id;

  DomTextDirection(final String id) { this.id = id; }

  public final String getId() { return id; }
}
