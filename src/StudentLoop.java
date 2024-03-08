import java.util.*;

public class StudentLoop {
    public static void studentLoop(Master master, Scanner studentScanner) {
        System.out.print("\nEnter your name: ");
        Student student = new Student(studentScanner.nextLine());
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
                        System.out.println((i+1)+ ". " + master.getTeachers().get(i));
                    }
                    System.out.print("Enter teacher index: ");
                    int teacherIndex = studentScanner.nextInt() - 1;
                    studentScanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < master.getTeachers().get(teacherIndex).getCourses().size(); i++) {
                        System.out.println(i+1 + ". " + master.getTeachers().get(teacherIndex).getCourses().get(i));
                    }
                    System.out.print("Enter course index: ");
                    try {
                        master.addStudent(master.getTeachers().get(teacherIndex), student, master.getTeachers().get(teacherIndex).getCourses().get(studentScanner.nextInt() - 1));
                    } catch (Exception e) {
                        System.out.println(e.getMessage() + "\n");
                    }
                    break;
                case 2:
                    for (int i = 0; i < student.getCourses().size(); i++) {
                        System.out.println((i+1) + ". " + student.getCourses().get(i));
                    }
                    System.out.print("Enter course index: ");
                    int studentIndex = studentScanner.nextInt();
                    try {
                        student.getCourses().get(studentIndex - 1).removeStudent(student);
                        student.removeCourse(studentIndex - 1);
                    } catch (Exception e) { System.out.println("Invalid index\n"); };

                    break;
                case 3:
                    System.out.println("\n" + student + "\n");
                    break;
                case 4:
                    if (student.getCourses().size() == 0)
                        System.out.println("You need to enroll in at least one course before exiting.\n");
                    else
                        return;
                    break;
            }
        }
    }
}