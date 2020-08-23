package com.oliveryasuna.gimmedom.event.client;

import com.google.gwt.event.dom.client.*;
import com.google.gwt.user.client.ui.Widget;
import com.oliveryasuna.gimmedom.event.GimmeEvent;
import com.oliveryasuna.gimmedom.event.client.event.DomEventBuilder;
import com.oliveryasuna.gimmedom.event.shared.GimmeEventServerRpc;
import com.vaadin.client.ComponentConnector;
import com.vaadin.client.ServerConnector;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.event.InputEvent;
import com.vaadin.client.extensions.AbstractExtensionConnector;
import com.vaadin.shared.ui.Connect;

/**
 * The {@link GimmeEvent} connector.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
@Connect(GimmeEvent.class)
public class GimmeEventConnector extends AbstractExtensionConnector {
  protected final GimmeEventServerRpc serverRpc = RpcProxy.create(GimmeEventServerRpc.class, this);

  // TODO: Dom handlers should only be added when needed. This can be accomplished via a state boolean.
  @Override
  protected void extend(final ServerConnector target) {
    final Widget widget = ((ComponentConnector)target).getWidget();

    // TODO: abort.
    // TODO: afterprint.
    // TODO: animationend.
    // TODO: animationiteration.
    // TODO: animationstart.
    // TODO: beforeprint.
    // TODO: beforeunload.
    widget.addDomHandler(gwtEvent -> serverRpc.onblur(DomEventBuilder.buildDomFocusEvent(gwtEvent.getNativeEvent())), BlurEvent.getType());
    // TODO: canplay.
    widget.addDomHandler(gwtEvent -> serverRpc.oncanplaythrough(DomEventBuilder.buildDomEvent(gwtEvent.getNativeEvent())), CanPlayThroughEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.onchange(DomEventBuilder.buildDomEvent(gwtEvent.getNativeEvent())), ChangeEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.onclick(DomEventBuilder.buildDomMouseEvent(gwtEvent.getNativeEvent())), ClickEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.oncontextmenu(DomEventBuilder.buildDomMouseEvent(gwtEvent.getNativeEvent())), ContextMenuEvent.getType());
    // TODO: copy.
    // TODO: cut.
    widget.addDomHandler(gwtEvent -> serverRpc.ondblclick(DomEventBuilder.buildDomMouseEvent(gwtEvent.getNativeEvent())), DoubleClickEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.ondrag(DomEventBuilder.buildDomDragEvent(gwtEvent.getNativeEvent())), DragEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.ondragend(DomEventBuilder.buildDomDragEvent(gwtEvent.getNativeEvent())), DragEndEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.ondragenter(DomEventBuilder.buildDomDragEvent(gwtEvent.getNativeEvent())), DragEnterEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.ondragleave(DomEventBuilder.buildDomDragEvent(gwtEvent.getNativeEvent())), DragLeaveEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.ondragover(DomEventBuilder.buildDomDragEvent(gwtEvent.getNativeEvent())), DragOverEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.ondragstart(DomEventBuilder.buildDomDragEvent(gwtEvent.getNativeEvent())), DragStartEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.ondrop(DomEventBuilder.buildDomDragEvent(gwtEvent.getNativeEvent())), DropEvent.getType());
    // TODO: durationchange.
    widget.addDomHandler(gwtEvent -> serverRpc.onended(DomEventBuilder.buildDomEvent(gwtEvent.getNativeEvent())), EndedEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.onerror(DomEventBuilder.buildDomEvent(gwtEvent.getNativeEvent())), ErrorEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.onfocus(DomEventBuilder.buildDomFocusEvent(gwtEvent.getNativeEvent())), FocusEvent.getType());
    // TODO: focusin.
    // TODO: focusout.
    // TODO: fullscreenchange.
    // TODO: fullscreenerror.
    // TODO: hashchange.
    widget.addDomHandler(gwtEvent -> serverRpc.oninput(DomEventBuilder.buildDomEvent(gwtEvent.getNativeEvent())), InputEvent.getType()); // This is from Vaadin, not GWT.
    // TODO: invalid.
    widget.addDomHandler(gwtEvent -> serverRpc.onkeydown(DomEventBuilder.buildDomKeyboardEvent(gwtEvent.getNativeEvent())), KeyDownEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.onkeypress(DomEventBuilder.buildDomKeyboardEvent(gwtEvent.getNativeEvent())), KeyPressEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.onkeyup(DomEventBuilder.buildDomKeyboardEvent(gwtEvent.getNativeEvent())), KeyUpEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.onload(DomEventBuilder.buildDomEvent(gwtEvent.getNativeEvent())), LoadEvent.getType());
    // TODO: loadeddata.
    widget.addDomHandler(gwtEvent -> serverRpc.onloadedmetadata(DomEventBuilder.buildDomEvent(gwtEvent.getNativeEvent())), LoadedMetadataEvent.getType());
    // TODO: loadstart.
    // TODO: message.
    widget.addDomHandler(gwtEvent -> serverRpc.onmousedown(DomEventBuilder.buildDomMouseEvent(gwtEvent.getNativeEvent())), MouseDownEvent.getType());
    // TODO: mouseenter.
    // TODO: mouseleave.
    widget.addDomHandler(gwtEvent -> serverRpc.onmousemove(DomEventBuilder.buildDomMouseEvent(gwtEvent.getNativeEvent())), MouseMoveEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.onmouseover(DomEventBuilder.buildDomMouseEvent(gwtEvent.getNativeEvent())), MouseOverEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.onmouseout(DomEventBuilder.buildDomMouseEvent(gwtEvent.getNativeEvent())), MouseOutEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.onmouseup(DomEventBuilder.buildDomMouseEvent(gwtEvent.getNativeEvent())), MouseUpEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.onmousewheel(DomEventBuilder.buildDomWheelEvent(gwtEvent.getNativeEvent())), MouseWheelEvent.getType());
    // TODO: offline.
    // TODO: online.
    // TODO: open.
    // TODO: pagehide.
    // TODO: pageshow.
    // TODO: paste.
    // TODO: pause.
    // TODO: play.
    // TODO: playing.
    // TODO: popstate.
    widget.addDomHandler(gwtEvent -> serverRpc.onprogress(DomEventBuilder.buildDomEvent(gwtEvent.getNativeEvent())), ProgressEvent.getType());
    // TODO: ratechange.
    // TODO: resize.
    // TODO: reset.
    widget.addDomHandler(gwtEvent -> serverRpc.onscroll(DomEventBuilder.buildDomEvent(gwtEvent.getNativeEvent())), ScrollEvent.getType());
    // TODO: search.
    // TODO: seeked.
    // TODO: seeking.
    // TODO: select.
    // TODO: show.
    // TODO: stalled.
    // TODO: storage.
    // TODO: submit.
    // TODO: suspend.
    // TODO: timeupdate.
    // TODO: toggle.
    widget.addDomHandler(gwtEvent -> serverRpc.ontouchcancel(DomEventBuilder.buildDomTouchEvent(gwtEvent.getNativeEvent())), TouchCancelEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.ontouchend(DomEventBuilder.buildDomTouchEvent(gwtEvent.getNativeEvent())), TouchEndEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.ontouchmove(DomEventBuilder.buildDomTouchEvent(gwtEvent.getNativeEvent())), TouchMoveEvent.getType());
    widget.addDomHandler(gwtEvent -> serverRpc.ontouchstart(DomEventBuilder.buildDomTouchEvent(gwtEvent.getNativeEvent())), TouchStartEvent.getType());
    // TODO: transitionend.
    // TODO: unload.
    // TODO: volumechange.
    // TODO: waiting.
    // TODO: wheel.
  }
}
