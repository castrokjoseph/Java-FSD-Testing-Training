package com.project.clinic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.clinic.entity.Doctor;
import com.project.clinic.repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository drepo;
	
	public void addDoctor(Doctor d) {
		drepo.save(d);
	}
	
	public List<Doctor> getAllDoctor() {
		return drepo.findAll();
	}
	
	public Doctor getDoctorById(String did) {
		Optional<Doctor> d= drepo.findById(did);
		if(d.isPresent()) {
			return d.get();
		}
		return null;
	}
	
	public void deleteDoctor(String did) {
		drepo.deleteById(did);
	}
}
