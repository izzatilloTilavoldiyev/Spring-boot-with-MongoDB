package uz.pdp.springbootwithmongodb.controller;

import org.springframework.data.mongodb.repository.MongoRepository;
import uz.pdp.springbootwithmongodb.domains.entity.Student;

public interface StudentRepository
        extends MongoRepository<Student, String> {
}
