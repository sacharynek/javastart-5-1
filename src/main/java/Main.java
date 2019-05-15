
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int control = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the current temperature in the room?");
        control = sc.nextInt();
        Room rm = new Room(10, 10, 2.5, control, 10, 6.5, true);

        control = 1;
        while (control != 0) {
            printMenu();
            control = sc.nextInt();

            switch (control) {
                case 0:
                    control = 0;
                    break;
                case 1:
                    control = lowerTemperature(rm);
                    break;
                default:
                    control = 0;
                    break;
            }

            System.out.println(control);
        }
    }

    private static int lowerTemperature(Room rm) {

        System.out.println("We're lowering the temperature");
        rm.turnTempDown();
        System.out.println(rm);
        if (rm.isMinAndCurrentTempEqual()) {
            System.out.println("Temperature can't be any lower");
            return 0;
        }
        return 1;
    }

    private static void printMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu\n");
        sb.append("0 - Exit program\n");
        sb.append("1 - decrease temperature by 1 degree\n");
        System.out.println(sb);
    }

}
