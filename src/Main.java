import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int numTeachers = scanner.nextInt();
        scanner.nextLine();

        Teacher[] teachers = new Teacher[numTeachers];
        for (int i = 0; i < numTeachers; i++) {
            teachers[i] = new Teacher();
            teachers[i].input();
        }

        System.out.println("Information of Teachers:");
        for (Teacher teacher : teachers) {
            teacher.info();
            System.out.println();
        }


        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            students[i] = new Student();
            students[i].input();
        }

        System.out.println("Information of Students:");
        for (Student student : students) {
            student.info();
            System.out.println();
        }
    }

}
