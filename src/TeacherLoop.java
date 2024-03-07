import java.util.*;
public class TeacherLoop {
    public static void teacherLoop(Master master, Scanner teacherScanner) {

        System.out.print("\nPlease enter your name: ");
        master.addTeacher(new Teacher(teacherScanner.nextLine()));
        while (true) {
            System.out.println("1. Add Course");
            System.out.println("2. Print Teacher");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = teacherScanner.nextInt();
            teacherScanner.nextLine();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Enter course name: ");
                    String courseName = teacherScanner.nextLine();
                    master.getTeachers().get(master.getTeachers().size() - 1).addCourse(new Course(courseName));
                    System.out.println("Course added\n");
                    break;
                case 2:
                    System.out.println(master.getTeachers().get(master.getTeachers().size() - 1) + "\n");

                    break;
                case 3:
                    return;
            }
        }
    }
}
