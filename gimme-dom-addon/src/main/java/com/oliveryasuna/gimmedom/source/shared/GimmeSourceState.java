package com.oliveryasuna.gimmedom.source.shared;

import com.oliveryasuna.gimmedom.source.GimmeSource;
import com.oliveryasuna.gimmedom.source.shared.data.DomDraggable;
import com.oliveryasuna.gimmedom.source.shared.data.DomTextDirection;
import com.vaadin.shared.AbstractComponentState;

/**
 * The {@link GimmeSource} state.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public class GimmeSourceState extends AbstractComponentState {
  // TODO: There are more, and some of these aren't standard, they are part of GWT.

  public String id;
  public String[] classNames;
  public String tagName;
  public String title;
  public String lang;

  public String innerHtml;
  public String innerText;

  public int tabIndex;

  public DomTextDirection dir;
  public DomDraggable draggable;

  public int absoluteTop;
  public int absoluteRight;
  public int absoluteBottom;
  public int absoluteLeft;

  public int offsetLeft;
  public int offsetTop;
  public int offsetWidth;
  public int offsetHeight;

  public int scrollLeft;
  public int scrollTop;
  public int scrollWidth;
  public int scrollHeight;

  public int clientWidth;
  public int clientHeight;

  public String toString;
}
