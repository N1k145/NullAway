package com.uber.lib;

import javax.annotation.Nullable;

public class Varargs {

  @Nullable private static final String[] test = null;

  public Varargs(@Nullable String... args) {}

  public static void typeUse(String @org.jspecify.annotations.Nullable ... args) {}

  public static void typeUseNullableElementsInit(@Nullable String val) {
    new Varargs().typeUseNullableElements(val, test);
  }

  public void typeUseNullableElements(@Nullable String test, @Nullable String... args) {}
}
