import java.util.*;

public class StudentLoop {
    public static void studentLoop(Master master) {
        Scanner studentScanner = new Scanner(System.in);
        Student student = new Student("John");
        while(true) {
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. Print Courses");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = studentScanner.nextInt();
            studentScanner.nextLine();
            switch(choice) {
                case 1:
                    for (int i = 0; i < master.getTeachers().size(); i++) {
                        System.out.println(i + ". " + master.getTeachers().get(i));
                    }
                    System.out.print("Enter teacher index: ");
                    int teacherIndex = studentScanner.nextInt();
                    studentScanner.nextLine();
                    for (int i = 0; i < master.getTeachers().get(teacherIndex).getCourses().size(); i++) {
                        System.out.println(i + ". " + master.getTeachers().get(teacherIndex).getCourses().get(i));
                    }
                    master.addStudent(master.getTeachers().get(teacherIndex), student, master.getTeachers().get(teacherIndex).getCourses().get(studentScanner.nextInt()));
                    break;
                case 2:
                    System.out.print("Enter course name: ");
                    Course course = new Course (studentScanner.nextLine());
                    for (Course c : student.getCourses()) {
                        if (c.equals(course)) {
                            student.removeCourse(c);
                            break;
                        }
                    }
                    break;
                case 3:
                    for (Course c : student.getCourses()) {
                        System.out.println(c);
                    }
                    break;
                case 4:
                studentScanner.close();
                    return;
            }
        }
    }
}