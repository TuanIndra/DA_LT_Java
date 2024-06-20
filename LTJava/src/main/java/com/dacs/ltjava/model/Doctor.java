package com.dacs.ltjava.model;



import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "doctor")
public class Doctor extends User {

    @ManyToMany
    @JoinTable(
            name = "doctor_services",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id")
    )
    private Set<Service> services;

    @OneToMany(mappedBy = "doctor")
    private Set<Appointment> appointments;

    // Getters and Setters
}