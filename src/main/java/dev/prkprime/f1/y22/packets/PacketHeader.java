package dev.prkprime.f1.y22.packets;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder(access = AccessLevel.PRIVATE, setterPrefix = "set")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PacketHeader {
    private int packetFormat;
    private int gameMajorVersion;
    private int gameMinorVersion;
    private int packetVersion;
    private int packetId;
    private long sessionUID;
    private float sessionTime;
    private int frameIdentifier;
    private int playerCarIndex;
    private int secondaryPlayerIndex;
}

