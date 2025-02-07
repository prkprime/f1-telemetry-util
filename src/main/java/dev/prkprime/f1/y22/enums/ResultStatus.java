package dev.prkprime.f1.y22.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultStatus {
    INVALID(0),
    INACTIVE(1),
    ACTIVE(2),
    FINISHED(3),
    DID_NOT_FINISH(4),
    DISQUALIFIED(5),
    NOT_CLASSIFIED(6),
    RETIRED(7);

    private final int value;

    public static ResultStatus fromValue(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> INACTIVE;
            case 2 -> ACTIVE;
            case 3 -> FINISHED;
            case 4 -> DID_NOT_FINISH;
            case 5 -> DISQUALIFIED;
            case 6 -> NOT_CLASSIFIED;
            case 7 -> RETIRED;
            default -> throw new IllegalArgumentException("No constant with value " + value + " found");
        };
    }
}
