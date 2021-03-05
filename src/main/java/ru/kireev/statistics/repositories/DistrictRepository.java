package ru.kireev.statistics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.kireev.statistics.entities.District;


import java.util.Optional;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {

    @Query("select d from District d where d.id = :districtId and d.city.name = :cityName")
    Optional<District> findByIdAndCityName(int districtId, String cityName);


}
