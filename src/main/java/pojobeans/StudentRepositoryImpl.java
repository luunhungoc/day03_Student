package dependencyinjection;

import pojobeans.Student;
import pojobeans.StudentRepository;

import java.util.HashMap;
import java.util.Map;

public class StudentRepositoryImpl implements StudentRepository {
    private final Map<Long, Student> studentsMap=new HashMap<>();
    {
        Student student1=new Student();
        student1.setId(1);
        student1.setLastName("Nguyen");
        student1.setFirstName("Van A");
        student1.setAge(20.0);
        student1.setAddress("Danang");

        Student student2=new Student();
        student2.setId(1);
        student2.setLastName("Nguyen");
        student2.setFirstName("Thi B");
        student2.setAge(19.0);
        student2.setAddress("Quangnam");

        studentsMap.put(student1.getId(),student1);
        studentsMap.put(student2.getId(),student2);

    }

    @Override
    public void insert(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student find(long id) {
        return studentsMap.get(id);
    }


}
