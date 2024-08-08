package pojobeans;

public interface StudentService {
    void updateStudent(long id, String address) ;
    void insertStudent(long id) ;
    void deleteStudent(long id) ;
    Student getStudent(long id) ;
}
