package com.niedson.cidadesApi.countries.repository;

import com.niedson.cidadesApi.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
