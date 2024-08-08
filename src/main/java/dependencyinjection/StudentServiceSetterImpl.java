package dependencyinjection;

import pojobeans.Student;
import pojobeans.StudentRepository;
import pojobeans.StudentService;

public class StudentServiceSetterImpl implements StudentService {
    private StudentRepository studentRepository;
    public void setStudentRepository(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    public void insertStudent(long id){
        Student student= new Student();

        student.setLastName(student.getLastName());
        student.setFirstName(student.getFirstName());
        student.setAge(student.getAge());
        student.setAddress(student.getAddress());

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
