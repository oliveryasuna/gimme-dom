package com.oliveryasuna.gimmedom.source.shared.data;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

/**
 * The CSS length units.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public enum CssLengthUnit {
  // Absolute.
  CENTIMETER("cm"),
  MILLIMETER("mm"),
  INCH("in"),
  PIXEL("px"),
  POINT("pt"),
  PICA("pc"),

  // Relative.
  EM("em"),
  EX("ex"),
  CH("ch"),
  REM("rem"),
  VW("vw"),
  VH("vh"),
  VMIN("vmin"),
  VMAX("vmax"),
  PERCENT("%");

  public static Optional<CssLengthUnit> getBySymbol(final String symbol) {
    Objects.requireNonNull(symbol);

    return Arrays.stream(values()).filter(cssLengthUnit -> cssLengthUnit.symbol.equals(symbol)).findFirst();
  }

  private final String symbol;

  CssLengthUnit(final String symbol) { this.symbol = symbol; }

  public String getSymbol() {
    return symbol;
  }
}
