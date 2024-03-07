import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Master master = new Master();
        
        System.out.println("Welcome to the school system\n");
        while(true) {
            System.out.println("Are you a teacher(0) or a student(1)? (-1 to full exit) ");
            switch(input.nextInt()) {
                case 0:
                    input.nextLine();
                    TeacherLoop.teacherLoop(master, input);
                    break;
                case 1:
                    input.nextLine();
                    StudentLoop.studentLoop(master, input);
                    break;
                case -1:
                    System.exit(0);
            }
        }
    }
}
