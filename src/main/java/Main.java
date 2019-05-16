

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int control = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the current temperature in the room?");
        control = sc.nextInt();
        RoomBuilder rb = new RoomBuilder();
        Room rm = rb.setX(10)
                .setY(10)
                .setZ(10)
                .setCurrentTemp(control)
                .setMinTemp(10)
                .setAirConditioningPowerInKw(5.5)
                .setHasAirConditioning(true)
                .build();

        System.out.println("Wat per cubic: " + rm.getWatPerCubic());

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
        System.out.println("Cooling time is: " + rm.calculateCoolingTime());
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
