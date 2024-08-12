package autowired;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.StudentService;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationbasedconfiguration/beans.xml");
        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);

        System.out.println("================");
        System.out.println("After deleting 1 student:");
        studentService.deleteStudent(1);
        applicationContext.close();
        System.out.println("================");
        System.out.println("After editing student address:");
        studentService.updateStudent(2, "Hue");
//        applicationContext.close();
        System.out.println("================");
        System.out.println("After inserting new student:");
        studentService.insertStudent(4, "Le","D",19,"Saigon");
//        applicationContext.close();
    }
}