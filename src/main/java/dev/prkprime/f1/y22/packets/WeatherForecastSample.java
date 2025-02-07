package dev.prkprime.f1.y22.packets;

import dev.prkprime.f1.y22.enums.SessionType;
import dev.prkprime.f1.y22.enums.TemperatureChange;
import dev.prkprime.f1.y22.enums.WeatherCondition;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder(access = AccessLevel.PRIVATE, setterPrefix = "set")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WeatherForecastSample {
    private SessionType sessionType;
    private int timeOffset;
    private WeatherCondition weather;
    private int trackTemperature;
    private TemperatureChange trackTemperatureChange;
    private int airTemperature;
    private TemperatureChange airTemperatureChange;
    private int rainPercentage;
}
