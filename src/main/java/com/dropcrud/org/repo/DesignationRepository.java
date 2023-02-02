package com.dropcrud.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dropcrud.org.entity.Designation;

@Repository
public interface DesignationRepository extends JpaRepository<Designation, Long> {
}