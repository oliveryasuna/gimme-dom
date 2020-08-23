package com.oliveryasuna.gimmedom.event.listener;

import com.oliveryasuna.gimmedom.event.event.MouseEvent;
import com.vaadin.util.ReflectTools;

import java.lang.reflect.Method;

@FunctionalInterface
public interface MouseListener extends Listener<MouseEvent> {
  void onMouseEvent(MouseEvent event);

  @Override
  default void dispatch(final MouseEvent event) { onMouseEvent(event); }

  @FunctionalInterface
  interface Click extends Listener<MouseEvent.Click> {
    Method method = ReflectTools.findMethod(Click.class, "onClickEvent", MouseEvent.Click.class);

    void onClickEvent(MouseEvent.Click event);

    @Override
    default void dispatch(final MouseEvent.Click event) { onClickEvent(event); }
  }

  @FunctionalInterface
  interface ContextMenu extends Listener<MouseEvent.ContextMenu> {
    void onContextMenuEvent(MouseEvent.ContextMenu event);

    @Override
    default void dispatch(final MouseEvent.ContextMenu event) { onContextMenuEvent(event); }
  }

  @FunctionalInterface
  interface DoubleClick extends Listener<MouseEvent.DoubleClick> {
    void onDoubleClickEvent(MouseEvent.DoubleClick event);

    @Override
    default void dispatch(final MouseEvent.DoubleClick event) { onDoubleClickEvent(event); }
  }

  @FunctionalInterface
  interface MouseDown extends Listener<MouseEvent.MouseDown> {
    void onMouseDownEvent(MouseEvent.MouseDown event);

    @Override
    default void dispatch(final MouseEvent.MouseDown event) { onMouseDownEvent(event); }
  }

  @FunctionalInterface
  interface MouseMove extends Listener<MouseEvent.MouseMove> {
    void onMouseMoveEvent(MouseEvent.MouseMove event);

    @Override
    default void dispatch(final MouseEvent.MouseMove event) { onMouseMoveEvent(event); }
  }

  @FunctionalInterface
  interface MouseOver extends Listener<MouseEvent.MouseOver> {
    void onMouseOverEvent(MouseEvent.MouseOver event);

    @Override
    default void dispatch(final MouseEvent.MouseOver event) { onMouseOverEvent(event); }
  }

  @FunctionalInterface
  interface MouseOut extends Listener<MouseEvent.MouseOut> {
    void onMouseOutEvent(MouseEvent.MouseOut event);

    @Override
    default void dispatch(final MouseEvent.MouseOut event) { onMouseOutEvent(event); }
  }

  @FunctionalInterface
  interface MouseUp extends Listener<MouseEvent.MouseUp> {
    void onMouseUpEvent(MouseEvent.MouseUp event);

    @Override
    default void dispatch(final MouseEvent.MouseUp event) { onMouseUpEvent(event); }
  }
}
