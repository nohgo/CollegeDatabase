public class Main {
    public static void main(String[] args) {
        
        Master master = new Master();
        
        // Teacher teacher = new Teacher("Mr. Smith");
        // Course course = new Course("Math");
        // Student student = new Student("John");
        // master.addCourse(teacher, course);
        // master.addStudent(teacher, student, course);
        // System.out.println(teacher);
        // System.out.println(student);
     
    TeacherLoop.teacherLoop(master);
    StudentLoop.studentLoop(master);
    }
}
