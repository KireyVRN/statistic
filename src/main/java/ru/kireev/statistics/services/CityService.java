package ru.kireev.statistics.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kireev.statistics.entities.City;
import ru.kireev.statistics.repositories.CityRepository;


@Service
@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;

    public City getById(int id) {
        return cityRepository.findById(id).get();
    }

    public City findByName(String name) {
        return cityRepository.findByName(name).get();
    }

}
