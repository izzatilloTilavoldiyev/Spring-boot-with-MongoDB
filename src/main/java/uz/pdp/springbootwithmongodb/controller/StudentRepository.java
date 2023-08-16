package uz.pdp.springbootwithmongodb.controller;

import org.springframework.data.mongodb.repository.MongoRepository;
import uz.pdp.springbootwithmongodb.domains.entity.Student;

import java.util.Optional;

public interface StudentRepository
        extends MongoRepository<Student, String> {
    Optional<Student> findStudentByEmail(String email);
}
