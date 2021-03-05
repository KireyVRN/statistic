package ru.kireev.statistics.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kireev.statistics.services.CityService;
import ru.kireev.statistics.services.DistrictService;


@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class AppController {

    private final DistrictService districtService;
    private final CityService cityService;

    @GetMapping()
    public String hello() {
        return "helloPage";
    }

    @GetMapping("/cities/{cityName}")
    String showCity(@PathVariable("cityName") String name, Model model) {

        model.addAttribute("city", cityService.findByName(name));

        return "city";

    }

    @GetMapping("/cities/{cityName}/{id}")
    String showDistrict(@PathVariable("cityName") String name, @PathVariable("id") int id, Model model) {

        model.addAttribute("district", districtService.findByIdAndCityName(id, cityService.findByName(name).getName()));

        return "district";

    }
}
