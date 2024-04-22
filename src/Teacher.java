import java.util.Scanner;

public class Teacher extends Person{
    private String teacherId;

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Teacher ID: ");
        teacherId = scanner.nextLine();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Teacher ID: " + teacherId);
    }
}
