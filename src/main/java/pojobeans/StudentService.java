package pojobeans;

public interface StudentService {

    void updateStudent(long id, String address) ;
    void insertStudent(long id, String Lastname, String firstName, double age, String address) ;
    void deleteStudent(long id) ;
    Student getStudent(long id) ;
}
