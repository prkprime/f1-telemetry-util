package dev.prkprime.f1.y22.packets;

import dev.prkprime.f1.y22.enums.ZoneFlag;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder(access = AccessLevel.PRIVATE, setterPrefix = "set")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MarshalZone {
    private float zoneStart;
    private ZoneFlag zoneFlag;
}
