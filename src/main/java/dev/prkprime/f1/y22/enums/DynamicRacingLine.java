package dev.prkprime.f1.y22.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DynamicRacingLine {
    OFF(0),
    CORNERS_ONLY(1),
    FULL(2);

    private final int value;

    public static DynamicRacingLine fromValue(int value) {
        return switch (value) {
            case 0 -> OFF;
            case 1 -> CORNERS_ONLY;
            case 2 -> FULL;
            default -> throw new IllegalArgumentException("No constant with value " + value + " found");
        };
    }
}
