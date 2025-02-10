package com.example.readdoctor.service;

import com.example.readdoctor.entity.Doctor;
import com.example.readdoctor.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    // Obtener todos los doctores
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    // Obtener un doctor por su ID
    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found with ID: " + id));
    }
}
