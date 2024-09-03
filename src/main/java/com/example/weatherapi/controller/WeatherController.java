package com.example.weatherapi.controller;

import com.example.weatherapi.reponse.WeatherData;
import com.example.weatherapi.service.ApiCallerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1.0/weather")
@RequiredArgsConstructor
public class WeatherController {
    private final ApiCallerService apiCallerService;

    //GET /api/v1.0/weather/search?stationName=aeropuertopalma&period=lastdata
    //http://localhost:8080/api/v1.0/weather/search?stationName=aeropuertopalma&period=lastdata
    @GetMapping("/search")
   public ResponseEntity<WeatherData> searchWeatherResponseEntity(@RequestParam String stationName,@RequestParam String period)
    {
        return ResponseEntity.ok(apiCallerService.weatherDataCity(stationName,period));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
