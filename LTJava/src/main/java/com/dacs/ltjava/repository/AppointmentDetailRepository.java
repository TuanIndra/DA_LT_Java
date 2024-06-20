package com.dacs.ltjava.repository;

import com.dacs.ltjava.model.AppointmentDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentDetailRepository extends JpaRepository<AppointmentDetail, Long> {
}