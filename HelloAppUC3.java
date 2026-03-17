import java.util.Scanner;

public class HelloAppUC3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + ", welcome to UC3!");

        sc.close();
    }
}