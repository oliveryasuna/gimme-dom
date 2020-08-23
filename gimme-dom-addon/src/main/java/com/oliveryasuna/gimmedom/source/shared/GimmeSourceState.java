package com.oliveryasuna.gimmedom.source.shared;

import com.oliveryasuna.gimmedom.source.GimmeSource;
import com.oliveryasuna.gimmedom.source.shared.data.DomNodeType;
import com.vaadin.shared.communication.SharedState;

import java.io.Serializable;

/**
 * The {@link GimmeSource} state.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public class GimmeSourceState extends SharedState implements Serializable {
  // Node.

  public String baseUri;

  public String nodeName;
  public DomNodeType nodeType;

  // Element.

  public String tagName;
  public String id;
  public String className;

  public String innerHtml;
  public String outerHtml;

  public double clientLeft;
  public double clientTop;
  public double clientWidth;
  public double clientHeight;

  public double scrollLeft;
  public double scrollTop;
  public double scrollWidth;
  public double scrollHeight;
}
