import java.util.Scanner;

public class Person {
    protected String id;
    protected String name;
    protected int age;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = scanner.nextLine();
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Age: ");
        age = scanner.nextInt();
    }

    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
