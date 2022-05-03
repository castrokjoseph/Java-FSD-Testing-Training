package com.project.clinic.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



import com.project.clinic.entity.Doctor;


@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {

}
