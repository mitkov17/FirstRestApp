package com.my.springcourse.FirstRestApp1.repositories;

import com.my.springcourse.FirstRestApp1.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<Person, Integer>  {
}
