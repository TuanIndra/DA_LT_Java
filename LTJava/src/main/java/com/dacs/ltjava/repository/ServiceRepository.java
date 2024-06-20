package com.dacs.ltjava.repository;

import com.dacs.ltjava.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}