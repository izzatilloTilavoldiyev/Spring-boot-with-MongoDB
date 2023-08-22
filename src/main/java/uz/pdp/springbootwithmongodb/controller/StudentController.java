package uz.pdp.springbootwithmongodb.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.springbootwithmongodb.domains.entity.Student;
import uz.pdp.springbootwithmongodb.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> fetchAllStudents() {
        List<Student> students = studentService.allStudents();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getById(
            @PathVariable String id
    ) {
        Student student = studentService.getById(id);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(
            @PathVariable String id
    ) {
        studentService.deleteById(id);
        return ResponseEntity.ok("Successfully deleted");
    }
}
