import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Master master = new Master();

        try {master = Loader.loadFile();}
		catch(Exception e) {}

        System.out.println("\nWelcome to the school system");
        while(true) {
            System.out.print("\nAre you a teacher(0) or a student(1)? (-1 to full exit): ");
            switch(input.nextInt()) {
                case 0:
                    input.nextLine();
                    TeacherLoop.teacherLoop(master, input);
                    break;
                case 1:
                    input.nextLine();
                    if (!master.isEmpty()) {
                        StudentLoop.studentLoop(master, input);
                    } else {
                        System.out.println("No courses available\n");
                    }
                    break;
                case -1:
                    Saver.saveClass(master);
                    System.exit(0);
            }
        }
    }
}
