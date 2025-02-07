package dev.prkprime.f1.y22.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WeatherCondition {
    CLEAR(0),
    LIGHT_CLOUD(1),
    OVERCAST(2),
    LIGHT_RAIN(3),
    HEAVY_RAIN(4),
    STORM(5);

    private final int value;

    public static WeatherCondition fromValue(int value) {
        return switch (value) {
            case 0 -> CLEAR;
            case 1 -> LIGHT_CLOUD;
            case 2 -> OVERCAST;
            case 3 -> LIGHT_RAIN;
            case 4 -> HEAVY_RAIN;
            case 5 -> STORM;
            default -> throw new IllegalArgumentException("No constant with value " + value + " found");
        };
    }
}
