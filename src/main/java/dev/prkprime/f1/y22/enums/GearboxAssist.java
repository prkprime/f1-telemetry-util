package dev.prkprime.f1.y22.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GearboxAssist {
    MANUAL(1),
    MANUAL_SUGGESTED(2),
    AUTOMATIC(3);

    private final int value;

    public static GearboxAssist fromValue(int value) {
        return switch (value) {
            case 1 -> MANUAL;
            case 2 -> MANUAL_SUGGESTED;
            case 3 -> AUTOMATIC;
            default -> throw new IllegalArgumentException("No constant with value " + value + " found");
        };
    }
}
