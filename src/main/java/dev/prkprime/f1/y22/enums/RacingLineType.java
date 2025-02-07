package dev.prkprime.f1.y22.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RacingLineType {
    TWO_D(0),
    THREE_D(1);

    private final int value;

    public static RacingLineType fromValue(int value) {
        return switch (value) {
            case 0 -> TWO_D;
            case 1 -> THREE_D;
            default -> throw new IllegalArgumentException("No constant with value " + value + " found");
        };
    }
}
