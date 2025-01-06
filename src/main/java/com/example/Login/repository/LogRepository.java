package com.example.Login.repository;

import com.example.Login.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;


@Repository
public interface LogRepository extends JpaRepository<Details,Integer> {
}
