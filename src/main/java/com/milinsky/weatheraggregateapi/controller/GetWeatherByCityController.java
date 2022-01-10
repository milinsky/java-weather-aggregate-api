package com.milinsky.weatheraggregateapi.controller;

import com.milinsky.weatheraggregateapi.interactor.GetAverageWeatherByCityInteractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GetWeatherByCityController {

    private final GetAverageWeatherByCityInteractor getAverageWeatherByCity;

    @Autowired
    public GetWeatherByCityController(GetAverageWeatherByCityInteractor getAverageWeatherByCity) {
        this.getAverageWeatherByCity = getAverageWeatherByCity;
    }

    @GetMapping("/run")
    public String run() {
        return this.getAverageWeatherByCity.execute();
    }
}
