package pojobeans;

public interface StudentRepository {

    void insert(Student student) ;

    void update(Student student);
    void delete(Student student) ;
    Student find(long id);
}
