package dependencyinjection;

import pojobeans.Student;
import pojobeans.StudentRepository;
import pojobeans.StudentService;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    public void setStudentRepository(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    @Override
    public void updateStudent(long id){
        Student student= studentRepository.find(id);
        student.setId(student.getId());
        student.setLastName(student.getLastName());
        student.setFirstName(student.getFirstName());
        student.setAge(student.getAge());
        student.setAddress(student.getAddress());

        studentRepository.update(student);
    }

    @Override
    public Student getStudent(long id){
        return studentRepository.find(id);
    }

}
