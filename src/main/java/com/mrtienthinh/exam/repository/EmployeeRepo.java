package com.mrtienthinh.exam.repository;

import com.mrtienthinh.exam.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {
    List<EmployeeEntity> findAllByName(String name);
}
