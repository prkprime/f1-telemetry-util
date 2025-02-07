package dev.prkprime.f1.y22.packets;

import dev.prkprime.f1.y22.enums.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder(access = AccessLevel.PRIVATE, setterPrefix = "set")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PacketSessionData {
    private PacketHeader header;
    private WeatherCondition weather;
    private int trackTemperature;
    private int airTemperature;
    private int totalLaps;
    private int trackLength;
    private SessionType sessionType;
    private int trackId;
    private int formula;
    private int sessionTimeLeft;
    private int sessionDuration;
    private int pitSpeedLimit;
    private boolean gamePaused;
    private boolean isSpectating;
    private int spectatorCarIndex;
    private boolean sliProNativeSupport;
    private int numMarshalZones;
    private MarshalZone[] marshalZones;
    private SafetyCarStatus safetyCarStatus;
    private boolean networkGame;
    private int numWeatherForecastSamples;
    private WeatherForecastSample[] weatherForecastSamples;
    private ForecastAccuracy forecastAccuracy;
    private int aiDifficulty;
    private int seasonLinkIdentifier;
    private int weekendLinkIdentifier;
    private int sessionLinkIdentifier;
    private int pitStopWindowIdealLap;
    private int pitStopWindowLatestLap;
    private int pitStopRejoinPosition;
    private boolean steeringAssist;
    private BrakingAssist brakingAssist;
    private GearboxAssist gearboxAssist;
    private boolean pitAssist;
    private boolean pitReleaseAssist;
    private boolean ersAssist;
    private boolean drsAssist;
    private DynamicRacingLine dynamicRacingLine;
    private RacingLineType dynamicRacingLineType;
    private int gameMode;
    private int ruleSet;
    private int timeOfDay;
    private SessionLength sessionLength;
}
