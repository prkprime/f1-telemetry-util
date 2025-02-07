package dev.prkprime.f1.y22.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SessionLength {
    NONE(0),
    VERY_SHORT(2),
    SHORT(3),
    MEDIUM(4),
    MEDIUM_LONG(5),
    LONG(6),
    FULL(7);

    private final int value;

    public static SessionLength fromValue(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 2 -> VERY_SHORT;
            case 3 -> SHORT;
            case 4 -> MEDIUM;
            case 5 -> MEDIUM_LONG;
            case 6 -> LONG;
            case 7 -> FULL;
            default -> throw new IllegalArgumentException("No constant with value " + value + " found");
        };
    }
}
