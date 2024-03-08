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
                    try {
                        System.out.print("Enter course name: ");
                        String courseName = teacherScanner.nextLine();
                        System.out.print("Enter course prefix: ");
                        String coursePrefix = teacherScanner.nextLine();
                        System.out.print("Enter course number: ");
                        int courseNumber = teacherScanner.nextInt();
                        teacherScanner.nextLine();

                        master.getTeachers().get(master.getTeachers().size() - 1).addCourse(new Course(courseName, coursePrefix, courseNumber));
                        System.out.println("Course added\n");
                    } catch (Exception e) {
                        System.out.println(e.getMessage() + "\n");
                    }

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
