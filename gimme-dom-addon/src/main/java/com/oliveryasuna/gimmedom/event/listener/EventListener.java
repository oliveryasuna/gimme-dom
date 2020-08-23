package com.oliveryasuna.gimmedom.event.listener;

import com.oliveryasuna.gimmedom.event.event.Event;

@FunctionalInterface
public interface EventListener extends Listener<Event> {
  void onEvent(Event event);

  @Override
  default void dispatch(final Event event) { onEvent(event); }

  @FunctionalInterface
  interface CanPlayThrough extends Listener<Event.CanPlayThrough> {
    void onCanPlayThroughEvent(Event.CanPlayThrough event);

    @Override
    default void dispatch(final Event.CanPlayThrough event) { onCanPlayThroughEvent(event); }
  }

  @FunctionalInterface
  interface Change extends Listener<Event.Change> {
    void onChangeEvent(Event.Change event);

    @Override
    default void dispatch(final Event.Change event) { onChangeEvent(event); }
  }

  @FunctionalInterface
  interface Ended extends Listener<Event.Ended> {
    void onEndedEvent(Event.Ended event);

    @Override
    default void dispatch(final Event.Ended event) { onEndedEvent(event); }
  }

  @FunctionalInterface
  interface Error extends Listener<Event.Error> {
    void onErrorEvent(Event.Error event);

    @Override
    default void dispatch(final Event.Error event) { onErrorEvent(event); }
  }

  @FunctionalInterface
  interface Input extends Listener<Event.Input> {
    void onInputEvent(Event.Input event);

    @Override
    default void dispatch(final Event.Input event) { onInputEvent(event); }
  }

  @FunctionalInterface
  interface Load extends Listener<Event.Load> {
    void onLoadEvent(Event.Load event);

    @Override
    default void dispatch(final Event.Load event) { onLoadEvent(event); }
  }

  @FunctionalInterface
  interface LoadedMetadata extends Listener<Event.LoadedMetadata> {
    void onLoadedMetadataEvent(Event.LoadedMetadata event);

    @Override
    default void dispatch(final Event.LoadedMetadata event) { onLoadedMetadataEvent(event); }
  }

  @FunctionalInterface
  interface Progress extends Listener<Event.Progress> {
    void onProgressEvent(Event.Progress event);

    @Override
    default void dispatch(final Event.Progress event) { onProgressEvent(event); }
  }

  @FunctionalInterface
  interface Scroll extends Listener<Event.Scroll> {
    void onScrollEvent(Event.Scroll event);

    @Override
    default void dispatch(final Event.Scroll event) { onScrollEvent(event); }
  }
}
