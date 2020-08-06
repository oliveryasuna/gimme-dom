package com.oliveryasuna.gimmedom.event.shared;

import com.oliveryasuna.gimmedom.event.shared.event.*;
import com.vaadin.shared.communication.ServerRpc;

/**
 * Gimme Event server report procedure calls.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public interface GimmeEventServerRpc extends ServerRpc {
  void onabort(DomEvent event);
  void onabort(DomUIEvent event);
  void onafterprint(DomEvent event);
  void onanimationend(DomAnimationEvent event);
  void onanimationiteration(DomAnimationEvent event);
  void onanimationstart(DomAnimationEvent event);
  void onbeforeprint(DomEvent event);
  void onbeforeunload(DomEvent event);
  void onbeforeunload(DomUIEvent event);
  void onblur(DomFocusEvent event);
  void oncanplay(DomEvent event);
  void oncanplaythrough(DomEvent event);
  void onchange(DomEvent event);
  void onclick(DomMouseEvent event);
  void oncontextmenu(DomMouseEvent event);
  void oncopy(DomClipboardEvent event);
  void oncut(DomClipboardEvent event);
  void ondblclick(DomMouseEvent event);
  void ondrag(DomDragEvent event);
  void ondragend(DomDragEvent event);
  void ondragenter(DomDragEvent event);
  void ondragleave(DomDragEvent event);
  void ondragover(DomDragEvent event);
  void ondragstart(DomDragEvent event);
  void ondrop(DomDragEvent event);
  void ondurationchange(DomEvent event);
  void onended(DomEvent event);
  void onerror(DomEvent event);
  void onerror(DomUIEvent event);
  void onerror(DomProgressEvent event);
  void onfocus(DomFocusEvent event);
  void onfocusin(DomFocusEvent event);
  void onfocusout(DomFocusEvent event);
  void onfullscreenchange(DomEvent event);
  void onfullscreenerror(DomEvent event);
  void onfullscreenerror(DomUIEvent event);
  void onhashchange(DomHashChangeEvent event);
  void oninput(DomEvent event);
  void oninput(DomInputEvent event);
  void oninvalid(DomEvent event);
  void onkeydown(DomKeyboardEvent event);
  void onkeypress(DomKeyboardEvent event);
  void onkeyup(DomKeyboardEvent event);
  void onload(DomEvent event);
  void onload(DomUIEvent event);
  void onloadeddata(DomEvent event);
  void onloadedmetadata(DomEvent event);
  void onloadstart(DomProgressEvent event);
  void onmessage(DomEvent event);
  void onmousedown(DomMouseEvent event);
  void onmouseenter(DomMouseEvent event);
  void onmouseleave(DomMouseEvent event);
  void onmousemove(DomMouseEvent event);
  void onmouseover(DomMouseEvent event);
  void onmouseout(DomMouseEvent event);
  void onmouseup(DomMouseEvent event);
  void onoffline(DomEvent event);
  void ononline(DomEvent event);
  void onopen(DomEvent event);
  void onpagehide(DomPageTransitionEvent event);
  void onpageshow(DomPageTransitionEvent event);
  void onpaste(DomClipboardEvent event);
  void onpause(DomEvent event);
  void onplay(DomEvent event);
  void onplaying(DomEvent event);
  void onpopstate(DomPopStateEvent event);
  void onprogress(DomEvent event);
  void onratechange(DomEvent event);
  void onresize(DomEvent event);
  void onresize(DomUIEvent event);
  void onreset(DomEvent event);
  void onscroll(DomEvent event);
  void onscroll(DomUIEvent event);
  void onsearch(DomEvent event);
  void onseeked(DomEvent event);
  void onseeking(DomEvent event);
  void onselect(DomEvent event);
  void onselect(DomUIEvent event);
  void onshow(DomEvent event);
  void onstalled(DomEvent event);
  void onstorage(DomStorageEvent event);
  void onsubmit(DomEvent event);
  void onsuspend(DomEvent event);
  void ontimeupdate(DomEvent event);
  void ontoggle(DomEvent event);
  void ontouchcancel(DomTouchEvent event);
  void ontouchend(DomTouchEvent event);
  void ontouchmove(DomTouchEvent event);
  void ontouchstart(DomTouchEvent event);
  void ontransitionend(DomTransitionEvent event);
  void onunload(DomEvent event);
  void onunload(DomUIEvent event);
  void onvolumechange(DomEvent event);
  void onwaiting(DomEvent event);
  void onwheel(DomWheelEvent event);
}
