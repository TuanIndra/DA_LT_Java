package com.dacs.ltjava.repository;


import com.dacs.ltjava.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}