package com.oliveryasuna.gimmedom.event;

import com.oliveryasuna.gimmedom.event.shared.GimmeEventServerRpc;
import com.oliveryasuna.gimmedom.event.shared.event.*;
import com.vaadin.server.AbstractExtension;
import com.vaadin.ui.AbstractComponent;

/**
 * The {@link GimmeEvent} extension.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public class GimmeEvent extends AbstractExtension {
  private final AbstractComponent component;

  public GimmeEvent(final AbstractComponent component) {
    extend(this.component = component);

    registerRpc(new GimmeEventServerRpcImpl());
  }

  private static final class GimmeEventServerRpcImpl implements GimmeEventServerRpc {
    @Override
    public void onabort(final DomEvent event) {}

    @Override
    public void onabort(final DomUIEvent event) {}

    @Override
    public void onafterprint(final DomEvent event) {}

    @Override
    public void onanimationend(final DomAnimationEvent event) {}

    @Override
    public void onanimationiteration(final DomAnimationEvent event) {}

    @Override
    public void onanimationstart(final DomAnimationEvent event) {}

    @Override
    public void onbeforeprint(final DomEvent event) {}

    @Override
    public void onbeforeunload(final DomEvent event) {}

    @Override
    public void onbeforeunload(final DomUIEvent event) {}

    @Override
    public void onblur(final DomFocusEvent event) {}

    @Override
    public void oncanplay(final DomEvent event) {}

    @Override
    public void oncanplaythrough(final DomEvent event) {}

    @Override
    public void onchange(final DomEvent event) {}

    @Override
    public void onclick(final DomMouseEvent event) {}

    @Override
    public void oncontextmenu(final DomMouseEvent event) {}

    @Override
    public void oncopy(final DomClipboardEvent event) {}

    @Override
    public void oncut(final DomClipboardEvent event) {}

    @Override
    public void ondblclick(final DomMouseEvent event) {}

    @Override
    public void ondrag(final DomDragEvent event) {}

    @Override
    public void ondragend(final DomDragEvent event) {}

    @Override
    public void ondragenter(final DomDragEvent event) {}

    @Override
    public void ondragleave(final DomDragEvent event) {}

    @Override
    public void ondragover(final DomDragEvent event) {}

    @Override
    public void ondragstart(final DomDragEvent event) {}

    @Override
    public void ondrop(final DomDragEvent event) {}

    @Override
    public void ondurationchange(final DomEvent event) {}

    @Override
    public void onended(final DomEvent event) {}

    @Override
    public void onerror(final DomEvent event) {}

    @Override
    public void onerror(final DomUIEvent event) {}

    @Override
    public void onerror(final DomProgressEvent event) {}

    @Override
    public void onfocus(final DomFocusEvent event) {}

    @Override
    public void onfocusin(final DomFocusEvent event) {}

    @Override
    public void onfocusout(final DomFocusEvent event) {}

    @Override
    public void onfullscreenchange(final DomEvent event) {}

    @Override
    public void onfullscreenerror(final DomEvent event) {}

    @Override
    public void onfullscreenerror(final DomUIEvent event) {}

    @Override
    public void onhashchange(final DomHashChangeEvent event) {}

    @Override
    public void oninput(final DomEvent event) {}

    @Override
    public void oninput(final DomInputEvent event) {}

    @Override
    public void oninvalid(final DomEvent event) {}

    @Override
    public void onkeydown(final DomKeyboardEvent event) {}

    @Override
    public void onkeypress(final DomKeyboardEvent event) {}

    @Override
    public void onkeyup(final DomKeyboardEvent event) {}

    @Override
    public void onload(final DomEvent event) {}

    @Override
    public void onload(final DomUIEvent event) {}

    @Override
    public void onloadeddata(final DomEvent event) {}

    @Override
    public void onloadedmetadata(final DomEvent event) {}

    @Override
    public void onloadstart(final DomProgressEvent event) {}

    @Override
    public void onmessage(final DomEvent event) {}

    @Override
    public void onmousedown(final DomMouseEvent event) {}

    @Override
    public void onmouseenter(final DomMouseEvent event) {}

    @Override
    public void onmouseleave(final DomMouseEvent event) {}

    @Override
    public void onmousemove(final DomMouseEvent event) {}

    @Override
    public void onmouseover(final DomMouseEvent event) {}

    @Override
    public void onmouseout(final DomMouseEvent event) {}

    @Override
    public void onmouseup(final DomMouseEvent event) {}

    @Override
    public void onoffline(final DomEvent event) {}

    @Override
    public void ononline(final DomEvent event) {}

    @Override
    public void onopen(final DomEvent event) {}

    @Override
    public void onpagehide(final DomPageTransitionEvent event) {}

    @Override
    public void onpageshow(final DomPageTransitionEvent event) {}

    @Override
    public void onpaste(final DomClipboardEvent event) {}

    @Override
    public void onpause(final DomEvent event) {}

    @Override
    public void onplay(final DomEvent event) {}

    @Override
    public void onplaying(final DomEvent event) {}

    @Override
    public void onpopstate(final DomPopStateEvent event) {}

    @Override
    public void onprogress(final DomEvent event) {}

    @Override
    public void onratechange(final DomEvent event) {}

    @Override
    public void onresize(final DomEvent event) {}

    @Override
    public void onresize(final DomUIEvent event) {}

    @Override
    public void onreset(final DomEvent event) {}

    @Override
    public void onscroll(final DomEvent event) {}

    @Override
    public void onscroll(final DomUIEvent event) {}

    @Override
    public void onsearch(final DomEvent event) {}

    @Override
    public void onseeked(final DomEvent event) {}

    @Override
    public void onseeking(final DomEvent event) {}

    @Override
    public void onselect(final DomEvent event) {}

    @Override
    public void onselect(final DomUIEvent event) {}

    @Override
    public void onshow(final DomEvent event) {}

    @Override
    public void onstalled(final DomEvent event) {}

    @Override
    public void onstorage(final DomStorageEvent event) {}

    @Override
    public void onsubmit(final DomEvent event) {}

    @Override
    public void onsuspend(final DomEvent event) {}

    @Override
    public void ontimeupdate(final DomEvent event) {}

    @Override
    public void ontoggle(final DomEvent event) {}

    @Override
    public void ontouchcancel(final DomTouchEvent event) {}

    @Override
    public void ontouchend(final DomTouchEvent event) {}

    @Override
    public void ontouchmove(final DomTouchEvent event) {}

    @Override
    public void ontouchstart(final DomTouchEvent event) {}

    @Override
    public void ontransitionend(final DomTransitionEvent event) {}

    @Override
    public void onunload(final DomEvent event) {}

    @Override
    public void onunload(final DomUIEvent event) {}

    @Override
    public void onvolumechange(final DomEvent event) {}

    @Override
    public void onwaiting(final DomEvent event) {}

    @Override
    public void onwheel(final DomWheelEvent event) {}
  }
}
