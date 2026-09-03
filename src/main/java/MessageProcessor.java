
import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class MessageProcessor {

    static int mode;
    static String message;
    static int length;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mode = sc.nextInt();
        message = sc.next();

        switch (mode) {
            case 1:
                System.out.println("Hello, " + message + "!");
                break;
            case 2:
                if (message.contains("ss")) {
                    System.out.println("Contains double s");
                } else {
                    System.out.println("Does not contain double s");
                }
                break;
            case 3:
                length = message.length();
                if (length % 2 == 0) {
                    System.out.println(message.substring((length / 2) - 1, (length / 2) + 1));
                } else {
                    char middle = message.charAt((length / 2));
                    System.out.println(middle);
                }
                break;
            default:
                System.out.println("Unknown mode");
                break;
        }
    }
}
