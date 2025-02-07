package dev.prkprime.f1.y22.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SafetyCarStatus {
    NONE(0),
    FULL(1),
    VIRTUAL(2),
    FORMATION_LAP(3);

    private final int value;

    public static SafetyCarStatus fromValue(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> FULL;
            case 2 -> VIRTUAL;
            case 3 -> FORMATION_LAP;
            default -> throw new IllegalArgumentException("No constant with value " + value + " found");
        };
    }
}
