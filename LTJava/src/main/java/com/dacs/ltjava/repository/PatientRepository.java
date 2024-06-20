package com.dacs.ltjava.repository;


import com.dacs.ltjava.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}