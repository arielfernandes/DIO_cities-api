package com.github.arielfernandes.citiesapi.countries.repository;

import com.github.arielfernandes.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
