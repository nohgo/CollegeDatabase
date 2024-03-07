import java.util.ArrayList;

public class Teacher implements java.io.Serializable{
    private String name;
    private int maxCap;
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Teacher(String name) {
        setName(name);
        setCourses(new ArrayList<Course>());
        maxCap = 3;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    public void addStudent(Course course, Student student) {
        course.addStudent(student);
    }
    public void addCourse(Course course) {
        if (courses.size() < maxCap)
            courses.add(course);
        else
            throw new IllegalArgumentException("Course limit reached");
    }
    @Override
    public String toString() {
        return getName() + ": " + courses.toString();
    }
}
