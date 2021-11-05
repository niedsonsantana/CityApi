package com.niedson.cidadesApi.states.repository;

import com.niedson.cidadesApi.states.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}