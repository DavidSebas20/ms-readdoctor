package com.example.readdoctor.repository;

import com.example.readdoctor.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    // Métodos personalizados pueden ir aquí si son necesarios
}
