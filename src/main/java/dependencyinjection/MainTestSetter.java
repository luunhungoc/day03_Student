package dependencyinjection;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.StudentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainTestSetter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("dependencyinjection/beans-setter.xml");
        StudentService studentService=applicationContext.getBean("studentService", StudentService.class);
        System.out.println("Before deleting student 1:");
        System.out.println("Student 1:"+studentService.getStudent(1));
        System.out.println("Student 2:"+studentService.getStudent(2));

        System.out.println("================");
        System.out.println("After deleting student 1:");
        studentService.deleteStudent(1);
        System.out.println("Student 1:"+studentService.getStudent(1));
        System.out.println("Student 2:"+studentService.getStudent(2));

        System.out.println("================");
        System.out.println("After editing student 2's address from 'Quangnam' to 'Hue' :");
        studentService.updateStudent(2, "Hue");
        System.out.println("Student 1:"+studentService.getStudent(1));
        System.out.println("Student 2:"+studentService.getStudent(2));
        System.out.println("Student 3:"+studentService.getStudent(3));

        System.out.println("================");
        System.out.println("After inserting student 3:");
        studentService.insertStudent(3);
        System.out.println("Student 1:"+studentService.getStudent(1));
        System.out.println("Student 2:"+studentService.getStudent(2));
        System.out.println("Student 3:"+studentService.getStudent(3));


    }
}