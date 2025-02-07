package dev.prkprime.f1.y22.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SessionType {
    UNKNOWN(0),
    P1(1),
    P2(2),
    P3(3),
    SHORT_P(4),
    Q1(5),
    Q2(6),
    Q3(7),
    SHORT_Q(8),
    OSQ(9),
    R(10),
    R2(11),
    R3(12),
    TIME_TRIAL(13);

    private final int value;

    public static SessionType fromValue(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> P1;
            case 2 -> P2;
            case 3 -> P3;
            case 4 -> SHORT_P;
            case 5 -> Q1;
            case 6 -> Q2;
            case 7 -> Q3;
            case 8 -> SHORT_Q;
            case 9 -> OSQ;
            case 10 -> R;
            case 11 -> R2;
            case 12 -> R3;
            case 13 -> TIME_TRIAL;
            default -> throw new IllegalArgumentException("No constant with value " + value + " found");
        };
    }
}
