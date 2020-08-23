package com.oliveryasuna.gimmedom.event;

import com.oliveryasuna.gimmedom.event.event.MouseEvent;
import com.oliveryasuna.gimmedom.event.listener.MouseListener;
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

  public Registration addClickListener(final MouseListener.Click listener) {
    return addListener(MouseEvent.Click.class, listener, MouseListener.Click.METHOD);
  }

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
    public void onblur(final DomFocusEvent domEvent) {}

    @Override
    public void oncanplay(final DomEvent domEvent) {}

    @Override
    public void oncanplaythrough(final DomEvent domEvent) {}

    @Override
    public void onchange(final DomEvent domEvent) {}

    @Override
    public void onclick(final DomMouseEvent domEvent) { fireEvent(new MouseEvent.Click(component, domEvent)); }

    @Override
    public void oncontextmenu(final DomMouseEvent domEvent) {}

    @Override
    public void oncopy(final DomClipboardEvent domEvent) {}

    @Override
    public void oncut(final DomClipboardEvent domEvent) {}

    @Override
    public void ondblclick(final DomMouseEvent domEvent) {}

    @Override
    public void ondrag(final DomDragEvent domEvent) {}

    @Override
    public void ondragend(final DomDragEvent domEvent) {}

    @Override
    public void ondragenter(final DomDragEvent domEvent) {}

    @Override
    public void ondragleave(final DomDragEvent domEvent) {}

    @Override
    public void ondragover(final DomDragEvent domEvent) {}

    @Override
    public void ondragstart(final DomDragEvent domEvent) {}

    @Override
    public void ondrop(final DomDragEvent domEvent) {}

    @Override
    public void ondurationchange(final DomEvent domEvent) {}

    @Override
    public void onended(final DomEvent domEvent) {}

    @Override
    public void onerror(final DomEvent domEvent) {}

    @Override
    public void onfocus(final DomFocusEvent domEvent) {}

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
    public void oninput(final DomEvent domEvent) {}

    @Override
    public void oninvalid(final DomEvent domEvent) {}

    @Override
    public void onkeydown(final DomKeyboardEvent domEvent) {}

    @Override
    public void onkeypress(final DomKeyboardEvent domEvent) {}

    @Override
    public void onkeyup(final DomKeyboardEvent domEvent) {}

    @Override
    public void onload(final DomEvent domEvent) {}

    @Override
    public void onloadeddata(final DomEvent domEvent) {}

    @Override
    public void onloadedmetadata(final DomEvent domEvent) {}

    @Override
    public void onloadstart(final DomProgressEvent domEvent) {}

    @Override
    public void onmessage(final DomEvent domEvent) {}

    @Override
    public void onmousedown(final DomMouseEvent domEvent) {}

    @Override
    public void onmouseenter(final DomMouseEvent domEvent) {}

    @Override
    public void onmouseleave(final DomMouseEvent domEvent) {}

    @Override
    public void onmousemove(final DomMouseEvent domEvent) {}

    @Override
    public void onmouseover(final DomMouseEvent domEvent) {}

    @Override
    public void onmouseout(final DomMouseEvent domEvent) {}

    @Override
    public void onmouseup(final DomMouseEvent domEvent) {}

    @Override
    public void onmousewheel(final DomWheelEvent domEvent) {}

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
    public void onprogress(final DomEvent domEvent) {}

    @Override
    public void onratechange(final DomEvent domEvent) {}

    @Override
    public void onresize(final DomEvent domEvent) {}

    @Override
    public void onreset(final DomEvent domEvent) {}

    @Override
    public void onscroll(final DomEvent domEvent) {}

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
    public void ontouchcancel(final DomTouchEvent domEvent) {}

    @Override
    public void ontouchend(final DomTouchEvent domEvent) {}

    @Override
    public void ontouchmove(final DomTouchEvent domEvent) {}

    @Override
    public void ontouchstart(final DomTouchEvent domEvent) {}

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
