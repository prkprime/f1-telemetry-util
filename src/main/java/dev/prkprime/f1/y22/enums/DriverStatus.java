package dev.prkprime.f1.y22.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DriverStatus {
    IN_GARAGE(0),
    FLYING_LAP(1),
    IN_LAP(2),
    OUT_LAP(3),
    ON_TRACK(4);

    private final int value;

    public static DriverStatus fromValue(int value) {
        return switch (value) {
            case 0 -> IN_GARAGE;
            case 1 -> FLYING_LAP;
            case 2 -> IN_LAP;
            case 3 -> OUT_LAP;
            case 4 -> ON_TRACK;
            default -> throw new IllegalArgumentException("No constant with value " + value + " found");
        };
    }
}
