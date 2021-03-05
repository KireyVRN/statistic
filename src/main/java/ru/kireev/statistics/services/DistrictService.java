package ru.kireev.statistics.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kireev.statistics.entities.District;
import ru.kireev.statistics.repositories.DistrictRepository;


@Service
@RequiredArgsConstructor
public class DistrictService {

    private final DistrictRepository districtRepository;

    public District getById(int id) {

        return districtRepository.findById(id).get();

    }

    public District findByIdAndCityName(int districtId, String cityName) {

       return districtRepository.findByIdAndCityName(districtId, cityName).get();

    }

}
