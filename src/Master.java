import java.util.ArrayList;

public class Master implements java.io.Serializable{
    private ArrayList<Teacher> teachers;
    public Master() {
        teachers = new ArrayList<Teacher>();
    }
    public void addStudent(Teacher teacher, Student student, Course course) throws IllegalArgumentException{
        teacher.addStudent(course, student);
        student.addCourse(course);
    }
    public void addCourse(Teacher teacher, Course course) throws IllegalArgumentException{
        teacher.addCourse(course);
    }
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public boolean isEmpty() {
        return teachers.isEmpty();
    }
}
