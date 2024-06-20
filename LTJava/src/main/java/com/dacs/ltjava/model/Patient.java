package com.dacs.ltjava.model;



import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
public class Patient extends User {

    @OneToMany(mappedBy = "patient")
    private Set<Appointment> appointments;

    // Getters and Setters
}