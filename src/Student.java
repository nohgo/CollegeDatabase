import java.util.*;

public class Student implements java.io.Serializable{
    private String name;
    private ArrayList<Course> courses = new ArrayList<Course>();
    private int maxCap = 5;

    public Student(String name) {
        setName(name);
        setCourses(new ArrayList<Course>());
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
    public void addCourse(Course course) {
        if (courses.size() < maxCap)
            courses.add(course);
        else
            throw new IllegalArgumentException("Course limit reached");
    }
    public void removeCourse(int index) {
        courses.remove(index);
    }
    @Override
    public String toString() {
        return getName() + ": " + courses.toString();
    }
}