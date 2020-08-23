package com.oliveryasuna.gimmedom.event.listener;

import com.oliveryasuna.gimmedom.event.event.DragEvent;

@FunctionalInterface
public interface DragListener extends Listener<DragEvent> {
  void onDragEvent(DragEvent event);

  @Override
  default void dispatch(final DragEvent event) { onDragEvent(event); }

  @FunctionalInterface
  interface Drag extends Listener<DragEvent.Drag> {
    void onDragEvent(DragEvent.Drag event);

    @Override
    default void dispatch(final DragEvent.Drag event) { onDragEvent(event); }
  }

  @FunctionalInterface
  interface DragEnd extends Listener<DragEvent.DragEnd> {
    void onDragEndEvent(DragEvent.DragEnd event);

    @Override
    default void dispatch(final DragEvent.DragEnd event) { onDragEndEvent(event); }
  }

  @FunctionalInterface
  interface DragEnter extends Listener<DragEvent.DragEnter> {
    void onDragEnterEvent(DragEvent.DragEnter event);

    @Override
    default void dispatch(final DragEvent.DragEnter event) { onDragEnterEvent(event); }
  }

  @FunctionalInterface
  interface DragLeave extends Listener<DragEvent.DragLeave> {
    void onDragLeaveEvent(DragEvent.DragLeave event);

    @Override
    default void dispatch(final DragEvent.DragLeave event) { onDragLeaveEvent(event); }
  }

  @FunctionalInterface
  interface DragOver extends Listener<DragEvent.DragOver> {
    void onDragOverEvent(DragEvent.DragOver event);

    @Override
    default void dispatch(final DragEvent.DragOver event) { onDragOverEvent(event); }
  }

  @FunctionalInterface
  interface DragStart extends Listener<DragEvent.DragStart> {
    void onDragStartEvent(DragEvent.DragStart event);

    @Override
    default void dispatch(final DragEvent.DragStart event) { onDragStartEvent(event); }
  }

  @FunctionalInterface
  interface Drop extends Listener<DragEvent.Drop> {
    void onDropEvent(DragEvent.Drop event);

    @Override
    default void dispatch(final DragEvent.Drop event) { onDropEvent(event); }
  }
}
