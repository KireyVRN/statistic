package ru.kireev.statistics.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "districts")
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "area")
    private int area;

    @Column(name = "population")
    private int population;

    @Column(name = "amount_of_crimes")
    private int amountOfCrimes;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id")
    private City city;

}
