package dev.prkprime.f1.y22.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PacketID {
    MOTION(0),
    SESSION(1),
    LAP_DATA(2),
    EVENT(3),
    PARTICIPANTS(4),
    CAR_SETUPS(5),
    CAR_TELEMETRY(6),
    CAR_STATUS(7),
    FINAL_CLASSIFICATION(8),
    LOBBY_INFO(9),
    CAR_DAMAGE(10),
    SESSION_HISTORY(11);

    private final int value;

    public static PacketID fromValue(int value) {
        return switch (value) {
            case 0 -> MOTION;
            case 1 -> SESSION;
            case 2 -> LAP_DATA;
            case 3 -> EVENT;
            case 4 -> PARTICIPANTS;
            case 5 -> CAR_SETUPS;
            case 6 -> CAR_TELEMETRY;
            case 7 -> CAR_STATUS;
            case 8 -> FINAL_CLASSIFICATION;
            case 9 -> LOBBY_INFO;
            case 10 -> CAR_DAMAGE;
            case 11 -> SESSION_HISTORY;
            default -> throw new IllegalArgumentException("No constant with value " + value + " found");
        };
    }
}
