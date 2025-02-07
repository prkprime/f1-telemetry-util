package dev.prkprime.f1.y22.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TemperatureChange {
    UP(0),
    DOWN(1),
    NO_CHANGE(2);

    private final int value;

    public static TemperatureChange fromValue(int value) {
        return switch (value) {
            case 0 -> UP;
            case 1 -> DOWN;
            case 2 -> NO_CHANGE;
            default -> throw new IllegalArgumentException("No constant with value " + value + " found");
        };
    }
}
