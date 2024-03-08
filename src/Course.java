import java.util.*;

public class Course implements java.io.Serializable{
    private int maxCap;
    private String name;
    private String prefix;
    private int number;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Course(String name, String prefix, int number) {
        setName(name);
        setStudents(new ArrayList<Student>());
        maxCap = 30;
        setPrefix(prefix);
        setNumber(number);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public void addStudent(Student student) {
        if (students.size() < maxCap)
            students.add(student);
        else
            throw new IllegalArgumentException("Course limit reached");
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name);
    }
    @Override
    public String toString() {
        return prefix + number + " - " + name;
    }
    public String getPrefix() {
        return prefix;
    }
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
