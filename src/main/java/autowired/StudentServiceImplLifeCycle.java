package autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojobeans.Student;
import pojobeans.StudentRepository;
import pojobeans.StudentService;

@Service("studentService")
public class StudentServiceImplLifeCycle implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void insertStudent(long id, String lastName, String firstName, double age, String address) {
        Student student= new Student();
        student.setId(id);
        student.setLastName(lastName);
        student.setFirstName(firstName);
        student.setAge(age);
        student.setAddress(address);
        studentRepository.insert(student);
    }



    @Override
    public void updateStudent(long id, String address) {
        Student student= studentRepository.find(id);

        student.setAddress(address);

        studentRepository.update(student);
    }


    public void deleteStudent(long id) {
        Student student= studentRepository.find(id);

        studentRepository.delete(student);
    }

    @Override
    public Student getStudent(long id){
        return studentRepository.find(id);
    }}
