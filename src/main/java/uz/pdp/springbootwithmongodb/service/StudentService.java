package uz.pdp.springbootwithmongodb.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.springbootwithmongodb.domains.entity.Student;
import uz.pdp.springbootwithmongodb.repository.StudentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> allStudents() {
        return studentRepository.findAll();
    }
}
