package com.example.weatherapi.service;

import com.example.weatherapi.reponse.WeatherData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;


@Service
@RequiredArgsConstructor
public class ApiCallerService {
   private final RestClient restClient;

    public WeatherData weatherDataCity(String stationName,String period){
        return restClient.get()
                .uri("/getAemetStation/{stationName}/{period}/", stationName, period)
                .retrieve()
                .body(WeatherData.class);
    }
}

