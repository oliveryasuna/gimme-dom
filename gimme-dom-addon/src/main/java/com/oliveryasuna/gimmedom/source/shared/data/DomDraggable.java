package com.oliveryasuna.gimmedom.source.shared.data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Optional;

/**
 * Possible draggable types.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public enum DomDraggable implements Serializable {
  AUTO("auto"),
  FALSE("false"),
  TRUE("true");

  public static Optional<DomDraggable> getById(final String id) {
    return Arrays.stream(values()).filter(domNodeType -> domNodeType.id.equals(id)).findFirst();
  }

  private final String id;

  DomDraggable(final String id) { this.id = id; }

  public final String getId() { return id; }
}
