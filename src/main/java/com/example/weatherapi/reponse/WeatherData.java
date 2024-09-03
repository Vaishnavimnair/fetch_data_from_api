package com.example.weatherapi.reponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public record WeatherData( double TEMPERATURE,
                           int TWD,
                           int PRESSURE,
                           double RAIN_MONTH,
                           double TWS_GUST,
                           double RAIN_DAY,
                           double RAIN,
                           int HUMIDITY,
                           double TWS,
                           String TIME_STRING,
                           int TWD_GUST,
                           long TIME,
                           double LATITUDE,
                           double LONGITUDE,
                           int LOCALTIME) {
}
