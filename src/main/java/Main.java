
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int edek = 1;
        Scanner sc = new Scanner(System.in);
        Room rm = new Room(10,10,2.5, 22, 10,6.5,true);

        while (edek != 0) {
            printMenu();
            edek = sc.nextInt();

            switch (edek) {
                case 0:
                    edek = 0;
                    break;
                case 1:
                    System.out.println("obnizamy temperature");
                    rm.turnTempDown();
                    System.out.println(rm);
                    break;
                default:
                    edek = 0;
                    break;
            }



            System.out.println(edek);
        }
    }

    public static void printMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu\n");
        sb.append("0 - Exit program\n");
        sb.append("1 - decrease temperature by 1 degree\n");
        System.out.println(sb);
    }

}
