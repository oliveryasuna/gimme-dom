package com.oliveryasuna.gimmedom.event;

import com.oliveryasuna.gimmedom.event.event.*;
import com.oliveryasuna.gimmedom.event.listener.*;
import com.oliveryasuna.gimmedom.event.shared.GimmeEventServerRpc;
import com.oliveryasuna.gimmedom.event.shared.event.*;
import com.vaadin.server.AbstractExtension;
import com.vaadin.shared.Registration;
import com.vaadin.ui.AbstractComponent;

/**
 * An extension to hook into more DOM events.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public class GimmeEvent extends AbstractExtension {
  protected final AbstractComponent component;

  public GimmeEvent(final AbstractComponent component) {
    extend(this.component = component);

    registerRpc(new GimmeEventServerRpcImpl());
  }

  public Registration addCanPlayThroughListener(final EventListener.CanPlayThrough listener) { return addListener(Event.CanPlayThrough.class, listener, EventListener.CanPlayThrough.METHOD); }
  public Registration addChangeListener(final EventListener.Change listener) { return addListener(Event.Change.class, listener, EventListener.Change.METHOD); }
  public Registration addEndedListener(final EventListener.Ended listener) { return addListener(Event.Ended.class, listener, EventListener.Ended.METHOD); }
  public Registration addErrorListener(final EventListener.Error listener) { return addListener(Event.Error.class, listener, EventListener.Error.METHOD); }
  public Registration addInputListener(final EventListener.Input listener) { return addListener(Event.Input.class, listener, EventListener.Input.METHOD); }
  public Registration addLoadListener(final EventListener.Load listener) { return addListener(Event.Load.class, listener, EventListener.Load.METHOD); }
  public Registration addLoadedMetadataListener(final EventListener.LoadedMetadata listener) { return addListener(Event.LoadedMetadata.class, listener, EventListener.LoadedMetadata.METHOD); }
  public Registration addProgressListener(final EventListener.Progress listener) { return addListener(Event.Progress.class, listener, EventListener.Progress.METHOD); }
  public Registration addScrollListener(final EventListener.Scroll listener) { return addListener(Event.Scroll.class, listener, EventListener.Scroll.METHOD); }

  public Registration addBlurListener(final FocusListener.Blur listener) { return addListener(FocusEvent.Blur.class, listener, FocusListener.Blur.METHOD); }
  public Registration addFocusListener(final FocusListener.Focus listener) { return addListener(FocusEvent.Focus.class, listener, FocusListener.Focus.METHOD); }

  public Registration addClickListener(final MouseListener.Click listener) { return addListener(MouseEvent.Click.class, listener, MouseListener.Click.METHOD); }
  public Registration addContextMenuListener(final MouseListener.ContextMenu listener) { return addListener(MouseEvent.ContextMenu.class, listener, MouseListener.ContextMenu.METHOD); }
  public Registration addDoubleClickListener(final MouseListener.DoubleClick listener) { return addListener(MouseEvent.DoubleClick.class, listener, MouseListener.DoubleClick.METHOD); }
  public Registration addMouseDownListener(final MouseListener.MouseDown listener) { return addListener(MouseEvent.MouseDown.class, listener, MouseListener.MouseDown.METHOD); }
  public Registration addMouseMoveListener(final MouseListener.MouseMove listener) { return addListener(MouseEvent.MouseMove.class, listener, MouseListener.MouseMove.METHOD); }
  public Registration addMouseOverListener(final MouseListener.MouseOver listener) { return addListener(MouseEvent.MouseOver.class, listener, MouseListener.MouseOver.METHOD); }
  public Registration addMouseOutListener(final MouseListener.MouseOut listener) { return addListener(MouseEvent.MouseOut.class, listener, MouseListener.MouseOut.METHOD); }
  public Registration addMouseUpListener(final MouseListener.MouseUp listener) { return addListener(MouseEvent.MouseUp.class, listener, MouseListener.MouseUp.METHOD); }

  public Registration addDragListener(final DragListener.Drag listener) { return addListener(DragEvent.Drag.class, listener, DragListener.Drag.METHOD); }
  public Registration addDragEndListener(final DragListener.DragEnd listener) { return addListener(DragEvent.DragEnd.class, listener, DragListener.DragEnd.METHOD); }
  public Registration addDragEnterListener(final DragListener.DragEnter listener) { return addListener(DragEvent.DragEnter.class, listener, DragListener.DragEnter.METHOD); }
  public Registration addDragLeaveListener(final DragListener.DragLeave listener) { return addListener(DragEvent.DragLeave.class, listener, DragListener.DragLeave.METHOD); }
  public Registration addDragOverListener(final DragListener.DragOver listener) { return addListener(DragEvent.DragOver.class, listener, DragListener.DragOver.METHOD); }
  public Registration addDragStartListener(final DragListener.DragStart listener) { return addListener(DragEvent.DragStart.class, listener, DragListener.DragStart.METHOD); }
  public Registration addDropListener(final DragListener.Drop listener) { return addListener(DragEvent.Drop.class, listener, DragListener.Drop.METHOD); }

  public Registration addMouseWheelListener(final WheelListener.MouseWheel listener) { return addListener(WheelEvent.MouseWheel.class, listener, WheelListener.MouseWheel.METHOD); }

  public Registration addTouchCancelListener(final TouchListener.TouchCancel listener) { return addListener(TouchEvent.TouchCancel.class, listener, TouchListener.TouchCancel.METHOD); }
  public Registration addTouchEndListener(final TouchListener.TouchEnd listener) { return addListener(TouchEvent.TouchEnd.class, listener, TouchListener.TouchEnd.METHOD); }
  public Registration addTouchMoveListener(final TouchListener.TouchMove listener) { return addListener(TouchEvent.TouchMove.class, listener, TouchListener.TouchMove.METHOD); }
  public Registration addTouchStartListener(final TouchListener.TouchStart listener) { return addListener(TouchEvent.TouchStart.class, listener, TouchListener.TouchStart.METHOD); }

  public Registration addKeyDownListener(final KeyboardListener.KeyDown listener) { return addListener(KeyboardEvent.KeyDown.class, listener, KeyboardListener.KeyDown.METHOD); }
  public Registration addKeyPressListener(final KeyboardListener.KeyPress listener) { return addListener(KeyboardEvent.KeyPress.class, listener, KeyboardListener.KeyPress.METHOD); }
  public Registration addKeyUpListener(final KeyboardListener.KeyUp listener) { return addListener(KeyboardEvent.KeyUp.class, listener, KeyboardListener.KeyUp.METHOD); }

  private final class GimmeEventServerRpcImpl implements GimmeEventServerRpc {
    @Override
    public void onabort(final DomEvent domEvent) {}

    @Override
    public void onafterprint(final DomEvent domEvent) {}

    @Override
    public void onanimationend(final DomAnimationEvent domEvent) {}

    @Override
    public void onanimationiteration(final DomAnimationEvent domEvent) {}

    @Override
    public void onanimationstart(final DomAnimationEvent domEvent) {}

    @Override
    public void onbeforeprint(final DomEvent domEvent) {}

    @Override
    public void onbeforeunload(final DomEvent domEvent) {}

    @Override
    public void onblur(final DomFocusEvent domEvent) { fireEvent(new FocusEvent.Blur(component, domEvent)); }

    @Override
    public void oncanplay(final DomEvent domEvent) {}

    @Override
    public void oncanplaythrough(final DomEvent domEvent) { fireEvent(new Event.CanPlayThrough(component, domEvent)); }

    @Override
    public void onchange(final DomEvent domEvent) { fireEvent(new Event.Change(component, domEvent)); }

    @Override
    public void onclick(final DomMouseEvent domEvent) { fireEvent(new MouseEvent.Click(component, domEvent)); }

    @Override
    public void oncontextmenu(final DomMouseEvent domEvent) { fireEvent(new MouseEvent.ContextMenu(component, domEvent)); }

    @Override
    public void oncopy(final DomClipboardEvent domEvent) {}

    @Override
    public void oncut(final DomClipboardEvent domEvent) {}

    @Override
    public void ondblclick(final DomMouseEvent domEvent) { fireEvent(new MouseEvent.DoubleClick(component, domEvent)); }

    @Override
    public void ondrag(final DomDragEvent domEvent) { fireEvent(new DragEvent.Drag(component, domEvent)); }

    @Override
    public void ondragend(final DomDragEvent domEvent) { fireEvent(new DragEvent.DragEnd(component, domEvent)); }

    @Override
    public void ondragenter(final DomDragEvent domEvent) { fireEvent(new DragEvent.DragEnter(component, domEvent)); }

    @Override
    public void ondragleave(final DomDragEvent domEvent) { fireEvent(new DragEvent.DragLeave(component, domEvent)); }

    @Override
    public void ondragover(final DomDragEvent domEvent) { fireEvent(new DragEvent.DragOver(component, domEvent)); }

    @Override
    public void ondragstart(final DomDragEvent domEvent) { fireEvent(new DragEvent.DragStart(component, domEvent)); }

    @Override
    public void ondrop(final DomDragEvent domEvent) { fireEvent(new DragEvent.Drop(component, domEvent)); }

    @Override
    public void ondurationchange(final DomEvent domEvent) { fireEvent(new Event.Change(component, domEvent)); }

    @Override
    public void onended(final DomEvent domEvent) { fireEvent(new Event.Ended(component, domEvent)); }

    @Override
    public void onerror(final DomEvent domEvent) { fireEvent(new Event.Error(component, domEvent)); }

    @Override
    public void onfocus(final DomFocusEvent domEvent) { fireEvent(new FocusEvent.Focus(component, domEvent)); }

    @Override
    public void onfocusin(final DomFocusEvent domEvent) {}

    @Override
    public void onfocusout(final DomFocusEvent domEvent) {}

    @Override
    public void onfullscreenchange(final DomEvent domEvent) {}

    @Override
    public void onfullscreenerror(final DomEvent domEvent) {}

    @Override
    public void onhashchange(final DomHashChangeEvent domEvent) {}

    @Override
    public void oninput(final DomEvent domEvent) { fireEvent(new Event.Input(component, domEvent)); }

    @Override
    public void oninvalid(final DomEvent domEvent) {}

    @Override
    public void onkeydown(final DomKeyboardEvent domEvent) { fireEvent(new KeyboardEvent.KeyDown(component, domEvent)); }

    @Override
    public void onkeypress(final DomKeyboardEvent domEvent) { fireEvent(new KeyboardEvent.KeyPress(component, domEvent)); }

    @Override
    public void onkeyup(final DomKeyboardEvent domEvent) { fireEvent(new KeyboardEvent.KeyUp(component, domEvent)); }

    @Override
    public void onload(final DomEvent domEvent) { fireEvent(new Event.Load(component, domEvent)); }

    @Override
    public void onloadeddata(final DomEvent domEvent) {}

    @Override
    public void onloadedmetadata(final DomEvent domEvent) { fireEvent(new Event.LoadedMetadata(component, domEvent)); }

    @Override
    public void onloadstart(final DomProgressEvent domEvent) {}

    @Override
    public void onmessage(final DomEvent domEvent) {}

    @Override
    public void onmousedown(final DomMouseEvent domEvent) { fireEvent(new MouseEvent.MouseDown(component, domEvent)); }

    @Override
    public void onmouseenter(final DomMouseEvent domEvent) {}

    @Override
    public void onmouseleave(final DomMouseEvent domEvent) {}

    @Override
    public void onmousemove(final DomMouseEvent domEvent) { fireEvent(new MouseEvent.MouseMove(component, domEvent)); }

    @Override
    public void onmouseover(final DomMouseEvent domEvent) { fireEvent(new MouseEvent.MouseOver(component, domEvent)); }

    @Override
    public void onmouseout(final DomMouseEvent domEvent) { fireEvent(new MouseEvent.MouseOut(component, domEvent)); }

    @Override
    public void onmouseup(final DomMouseEvent domEvent) { fireEvent(new MouseEvent.MouseUp(component, domEvent)); }

    @Override
    public void onmousewheel(final DomWheelEvent domEvent) { fireEvent(new WheelEvent.MouseWheel(component, domEvent)); }

    @Override
    public void onoffline(final DomEvent domEvent) {}

    @Override
    public void ononline(final DomEvent domEvent) {}

    @Override
    public void onopen(final DomEvent domEvent) {}

    @Override
    public void onpagehide(final DomPageTransitionEvent domEvent) {}

    @Override
    public void onpageshow(final DomPageTransitionEvent domEvent) {}

    @Override
    public void onpaste(final DomClipboardEvent domEvent) {}

    @Override
    public void onpause(final DomEvent domEvent) {}

    @Override
    public void onplay(final DomEvent domEvent) {}

    @Override
    public void onplaying(final DomEvent domEvent) {}

    @Override
    public void onpopstate(final DomPopStateEvent domEvent) {}

    @Override
    public void onprogress(final DomEvent domEvent) { fireEvent(new Event.Progress(component, domEvent)); }

    @Override
    public void onratechange(final DomEvent domEvent) {}

    @Override
    public void onresize(final DomEvent domEvent) {}

    @Override
    public void onreset(final DomEvent domEvent) {}

    @Override
    public void onscroll(final DomEvent domEvent) { fireEvent(new Event.Scroll(component, domEvent)); }

    @Override
    public void onsearch(final DomEvent domEvent) {}

    @Override
    public void onseeked(final DomEvent domEvent) {}

    @Override
    public void onseeking(final DomEvent domEvent) {}

    @Override
    public void onselect(final DomEvent domEvent) {}

    @Override
    public void onshow(final DomEvent domEvent) {}

    @Override
    public void onstalled(final DomEvent domEvent) {}

    @Override
    public void onstorage(final DomStorageEvent domEvent) {}

    @Override
    public void onsubmit(final DomEvent domEvent) {}

    @Override
    public void onsuspend(final DomEvent domEvent) {}

    @Override
    public void ontimeupdate(final DomEvent domEvent) {}

    @Override
    public void ontoggle(final DomEvent domEvent) {}

    @Override
    public void ontouchcancel(final DomTouchEvent domEvent) { fireEvent(new TouchEvent.TouchCancel(component, domEvent)); }

    @Override
    public void ontouchend(final DomTouchEvent domEvent) { fireEvent(new TouchEvent.TouchEnd(component, domEvent)); }

    @Override
    public void ontouchmove(final DomTouchEvent domEvent) { fireEvent(new TouchEvent.TouchMove(component, domEvent)); }

    @Override
    public void ontouchstart(final DomTouchEvent domEvent) { fireEvent(new TouchEvent.TouchStart(component, domEvent)); }

    @Override
    public void ontransitionend(final DomTransitionEvent domEvent) {}

    @Override
    public void onunload(final DomEvent domEvent) {}

    @Override
    public void onvolumechange(final DomEvent domEvent) {}

    @Override
    public void onwaiting(final DomEvent domEvent) {}

    @Override
    public void onwheel(final DomWheelEvent domEvent) {}
  }
}
