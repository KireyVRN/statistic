package ru.kireev.statistics.entities;

import lombok.Data;
import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "area")
    private int area;

    @Column(name = "foundation_date")
    private int foundationDate;

    @Column(name = "population")
    private int population;

    @Column(name = "dialing_code")
    private int dialingCode;

    @Column(name = "amount_of_crimes")
    private int amountOfCrimes;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    private List<District> districts;

}
