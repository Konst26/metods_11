import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        checkYear(2024);
        checkYear(2023);
        checkYear(2022);
        checkYear(2021);
        checkYear(2020);

        printDeviceVersion(1, 2020);
        printDeviceVersion(0, 2023);
        printDeviceVersion(1, 2024);

        int days = calculateDistance(55);
        System.out.println("Количество дней " + days);
    }


    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - не високосный год");
        }
    }
    public static void printDeviceVersion(int osType, int year) {
        int currentYear = LocalDate.now().getYear();
        var type = osType == 1 ? "Android" : "iOs";
        var appType = year < currentYear ? "облегченную " : "";
        System.out.println("Установите " + appType + "версию для системы " + type);
    }

    public static int calculateDistance (int distance) {
        int days = 1;
        if(distance > 20) {
            days++;
        }
        if(distance > 60) {
            days++;
        }
        return days;
        }
    }