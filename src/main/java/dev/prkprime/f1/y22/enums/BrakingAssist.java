package dev.prkprime.f1.y22.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BrakingAssist {
    OFF(0),
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private final int value;

    public static BrakingAssist fromValue(int value) {
        return switch (value) {
            case 0 -> OFF;
            case 1 -> LOW;
            case 2 -> MEDIUM;
            case 3 -> HIGH;
            default -> throw new IllegalArgumentException("No constant with value " + value + " found");
        };
    }
}
