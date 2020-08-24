package com.oliveryasuna.gimmedom.source.shared.data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Optional;

/**
 * Possible Node types.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public enum DomNodeType implements Serializable {
  ELEMENT_NODE(1),
  ATTRIBUTE_NODE(2),
  TEXT_NODE(3),
  CDATA_SECTION_NODE(4),
  ENTITY_REFERENCE_NODE(5),
  ENTITY_NODE(6),
  PROCESSING_INSTRUCTION_NODE(7),
  COMMENT_NODE(8),
  DOCUMENT_NODE(9),
  DOCUMENT_TYPE_NODE(10),
  DOCUMENT_FRAGMENT_NODE(11),
  NOTATION_NODE(12);

  public static Optional<DomNodeType> getById(final int id) {
    return Arrays.stream(values()).filter(domNodeType -> domNodeType.id == id).findFirst();
  }

  private final int id;

  DomNodeType(final int id) { this.id = id; }

  public final int getId() { return id; }
}
