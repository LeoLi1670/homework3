import java.util.Scanner;

public class BoxTester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        System.out.println("Please enter object's length: ");
        double length = scanner.nextDouble();
        System.out.println("Please enter object's width: ");
        double width = scanner.nextDouble();
        System.out.println("Please enter object's height: ");
        double height = scanner.nextDouble();

        if (box3.validate(length, width, height)) {
            System.out.print("Box3");
        } else if (box5.validate(length, width, height)) {
            System.out.print("Box5");
        } else {
            System.out.print("Can't put object to Box3 and Box5 ");
        }

    }

}
