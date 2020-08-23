package com.oliveryasuna.gimmedom.event.listener;

import com.oliveryasuna.gimmedom.event.event.Event;
import com.vaadin.util.ReflectTools;

import java.lang.reflect.Method;

/**
 * Base for DOM event listeners.
 *
 * @param <T> The {@link Event}
 */
@FunctionalInterface
public interface Listener<T extends Event> {
  Method listenerMethod = ReflectTools.findMethod(Listener.class, "dispatch", Event.class);

  void dispatch(T event);
}
