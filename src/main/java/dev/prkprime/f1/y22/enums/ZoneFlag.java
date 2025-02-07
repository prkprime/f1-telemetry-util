package dev.prkprime.f1.y22.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ZoneFlag {
    INVALID(-1),
    NONE(0),
    GREEN(1),
    BLUE(2),
    YELLOW(3),
    RED(4);

    private final int value;

    public static ZoneFlag fromValue(int value) {
        return switch (value) {
            case -1 -> INVALID;
            case 0 -> NONE;
            case 1 -> GREEN;
            case 2 -> BLUE;
            case 3 -> YELLOW;
            case 4 -> RED;
            default -> throw new IllegalArgumentException("No constant with value " + value + " found");
        };
    }
}
