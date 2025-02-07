package dev.prkprime.f1.y22.packets;

import dev.prkprime.f1.y22.enums.DriverStatus;
import dev.prkprime.f1.y22.enums.PitStatus;
import dev.prkprime.f1.y22.enums.ResultStatus;
import dev.prkprime.f1.y22.enums.Sector;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LapData {
    private int lastLapTimeInMS;
    private int currentLapTimeInMS;
    private int sector1TimeInMS;
    private int sector2TimeInMS;
    private float lapDistance;
    private float totalDistance;
    private float safetyCarDelta;
    private int carPosition;
    private int currentLapNum;
    private PitStatus pitStatus;
    private int numPitStops;
    private Sector sector;
    private boolean currentLapInvalid;
    private int penalties;
    private int warnings;
    private int numUnservedDriveThroughPens;
    private int numUnservedStopGoPens;
    private int gridPosition;
    private DriverStatus driverStatus;
    private ResultStatus resultStatus;
    private boolean pitLaneTimerActive;
    private int pitLaneTimeInLaneInMS;
    private int pitStopTimerInMS;
    private boolean pitStopShouldServePen;
}

