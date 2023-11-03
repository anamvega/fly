package com.airplane.fly.model;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ChairType {
  SILLA_LIGHT(1, "Silla light", 70),
  SILLA_BASIC(2, "Silla basic", 20),
  SILLA_PREMIUM(3, "Silla premium", 10);

  private final int id;

  private final String name;

  private final int percentage;

  public static final Map<Integer, Integer> CHAIR_TYPE = new ConcurrentHashMap<>();

  static {
    for (ChairType c : values()) {
      CHAIR_TYPE.put(c.id, c.percentage);
    }
  }
}
