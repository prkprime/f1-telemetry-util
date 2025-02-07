package dev.prkprime.f1.y22.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Sector {
    SECTOR_1(0),
    SECTOR_2(1),
    SECTOR_3(2);

    private final int value;

    public static Sector fromValue(int value) {
        return switch (value) {
            case 0 -> SECTOR_1;
            case 1 -> SECTOR_2;
            case 2 -> SECTOR_3;
            default -> throw new IllegalArgumentException("No constant with value " + value + " found");
        };
    }
}
