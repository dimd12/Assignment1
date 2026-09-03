import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class DateValidator {

    static int day;
    static int month;
    static int year;
    static String date;
    static boolean isLeap;
    static int maxDays;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        date = day + "/" + month + "/" + year;
        System.out.print(date);

        isLeap = checkLeap(year);
        maxDays = numDay(month);

        if (day >= 1 && day <= maxDays && year > 0 && month >= 1 && month <= 12) {
            System.out.println(" is a valid date!");
        } else {
            System.out.println(" is not a valid date!");
        }

    }

    public static boolean checkLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int numDay(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
                || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2 && isLeap) {
            return 29;
        } else {
            return 28;
        }
    }
}
