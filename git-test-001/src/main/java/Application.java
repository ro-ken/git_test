import model.Student;

public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("李建华");
        student.setAge(13);
        System.out.println(student);
    }
}
