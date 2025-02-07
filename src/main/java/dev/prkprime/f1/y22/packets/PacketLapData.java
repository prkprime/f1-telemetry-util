package dev.prkprime.f1.y22.packets;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PacketLapData {
    private PacketHeader header;
    private LapData[] lapData = new LapData[22];
    private int timeTrialPBCarIdx;
    private int timeTrialRivalCarIdx;
}
