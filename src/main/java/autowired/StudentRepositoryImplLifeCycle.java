package autowired;

import org.springframework.stereotype.Repository;
import pojobeans.Student;
import pojobeans.StudentRepository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImplLifeCycle implements StudentRepository {
    private Map<Long, Student> studentsMap;

    @PostConstruct
    public void init() {
        System.out.println("Init method is called (Annotation Method)");
        studentsMap = new HashMap<>();
        Student student1 = new Student();
        student1.setId(1);
        student1.setLastName("Nguyen");
        student1.setFirstName("Van A");
        student1.setAge(20.0);
        student1.setAddress("Danang");

        Student student2 = new Student();
        student2.setId(2);
        student2.setLastName("Nguyen");
        student2.setFirstName("Thi B");
        student2.setAge(19.0);
        student2.setAddress("Quangnam");
        studentsMap.put(student1.getId(), student1);
        studentsMap.put(student2.getId(), student2);

        Student student3 = new Student();
        student3.setId(3);
        student3.setLastName("Tran");
        student3.setFirstName("C");
        student3.setAge(18.0);
        student3.setAddress("Quangtri");

        studentsMap.put(student3.getId(), student3);

        System.out.println("Display information for at least 2 students:");
        for (Map.Entry<Long, Student> entry : studentsMap.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ": " + entry.getValue());
        }
    }


    @Override
    public void insert (Student student){

        studentsMap.put(student.getId(), student);
    }

    @Override
    public void update (Student student){
        studentsMap.put(student.getId(), student);
    }

    @Override
    public void delete (Student student){
        studentsMap.remove(student.getId(), student);
    }

    @Override
    public Student find ( long id){
        return studentsMap.get(id);
    }
    @PreDestroy
    public void displayMin2StudentInfo() throws Exception{

        for (Map.Entry<Long, Student> entry : studentsMap.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ": " + entry.getValue());
        }

    }
    }


