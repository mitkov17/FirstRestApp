package com.my.springcourse.FirstRestApp1.repositories;

import com.my.springcourse.FirstRestApp1.models.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementsRepository extends JpaRepository<Measurement, Integer> {
}
