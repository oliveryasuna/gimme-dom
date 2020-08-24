package com.oliveryasuna.gimmedom.event.shared.data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

/**
 * Possible DOM event types.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public enum DomEventType implements Serializable {
  onabort("abort"),
  onafterprint("afterprint"),
  onanimationend("animationend"),
  onanimationiteration("animationiteration"),
  onanimationstart("animationstart"),
  onbeforeprint("beforeprint"),
  onbeforeunload("beforeunload"),
  onblur("blur"),
  oncanplay("canplay"),
  oncanplaythrough("canplaythrough"),
  onchange("change"),
  onclick("click"),
  oncontextmenu("contextmenu"),
  oncopy("copy"),
  oncut("cut"),
  ondblclick("dblclick"),
  ondrag("drag"),
  ondragend("dragend"),
  ondragenter("dragenter"),
  ondragleave("dragleave"),
  ondragover("dragover"),
  ondragstart("dragstart"),
  ondrop("drop"),
  ondurationchange("durationchange"),
  onended("ended"),
  onerror("error"),
  onfocus("focus"),
  onfocusin("focusin"),
  onfocusout("focusout"),
  onfullscreenchange("fullscreenchange"),
  onfullscreenerror("fullscreenerror"),
  onhashchange("hashchange"),
  oninput("input"),
  oninvalid("invalid"),
  onkeydown("keydown"),
  onkeypress("keypress"),
  onkeyup("keyup"),
  onload("load"),
  onloadeddata("loadeddata"),
  onloadedmetadata("loadedmetadata"),
  onloadstart("loadstart"),
  onmessage("message"),
  onmousedown("mousedown"),
  onmouseenter("mouseenter"),
  onmouseleave("mouseleave"),
  onmousemove("mousemove"),
  onmouseover("mouseover"),
  onmouseout("mouseout"),
  onmouseup("mouseup"),
  //onmousewheel("mousewheel"),
  onoffline("offline"),
  ononline("online"),
  onopen("open"),
  onpagehide("pagehide"),
  onpageshow("pageshow"),
  onpaste("paste"),
  onpause("pause"),
  onplay("play"),
  onplaying("playing"),
  onpopstate("popstate"),
  onprogress("progress"),
  onratechange("ratechange"),
  onresize("resize"),
  onreset("reset"),
  onscroll("scroll"),
  onsearch("search"),
  onseeked("seeked"),
  onseeking("seeking"),
  onselect("select"),
  onshow("show"),
  onstalled("stalled"),
  onstorage("storage"),
  onsubmit("submit"),
  onsuspend("suspend"),
  ontimeupdate("timeupdate"),
  ontoggle("toggle"),
  ontouchcancel("touchcancel"),
  ontouchend("touchend"),
  ontouchmove("touchmove"),
  ontouchstart("touchstart"),
  ontransitionend("transitionend"),
  onunload("unload"),
  onvolumechange("volumechange"),
  onwaiting("waiting"),
  onwheel("wheel");

  public static Optional<DomEventType> getByValue(final String value) {
    Objects.requireNonNull(value);

    return Arrays.stream(values()).filter(domEventType -> domEventType.value.equals(value)).findFirst();
  }

  private final String value;

  DomEventType(final String value) { this.value = value; }

  public final String getValue() { return value; }
}
