import java.util.*;
public class TeacherLoop {
    public static void teacherLoop(Master master) {
        Scanner teacherScanner = new Scanner(System.in);
        Teacher teacher = new Teacher("Mr. Smith");
        while (true) {
            System.out.println("1. Add Course");
            System.out.println("2. Print Teacher");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = teacherScanner.nextInt();
            teacherScanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter course name: ");
                    String courseName = teacherScanner.nextLine();
                    teacher.addCourse(new Course(courseName));
                    break;
                case 2:
                    System.out.println(teacher);
                    break;
                case 3:
                teacherScanner.close();
                    return;
            }
        }
    }
}
