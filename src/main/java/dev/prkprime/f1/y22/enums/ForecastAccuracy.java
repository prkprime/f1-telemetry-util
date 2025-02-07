package dev.prkprime.f1.y22.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ForecastAccuracy {
    PERFECT(0),
    APPROXIMATE(1);

    private final int value;

    public ForecastAccuracy fromValue(int value) {
        return switch (value) {
            case 0 -> PERFECT;
            case 1 -> APPROXIMATE;
            default -> throw new IllegalArgumentException("No constant with value " + value + " found");
        };
    }
}
