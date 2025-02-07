package dev.prkprime.f1.y22.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PitStatus {
    NONE(0),
    PITTING(1),
    IN_PIT_AREA(2);

    private final int value;

    public static PitStatus fromValue(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> PITTING;
            case 2 -> IN_PIT_AREA;
            default -> throw new IllegalArgumentException("No constant with value " + value + " found");
        };
    }
}
