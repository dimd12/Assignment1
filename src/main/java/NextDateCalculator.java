
import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class NextDateCalculator {

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

        isLeap = checkLeap(year);
        maxDays = numDay(month);
        
        nextDate(day);

    }

    public static void nextDate(int day) {
        if (day + 1 > maxDays) {
            day = 1;
            if (month + 1 > 12) {
                month = 1;
                year += 1;
            } else {
                month += 1;
            }
        } else {
            day += 1;
        }

        date = day + "/" + month + "/" + year;
        System.out.println("It is " + date + " tomorrow!");
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
