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

        printDeviceVersion(1, 2010);
        printDeviceVersion(0, 2030);
        printDeviceVersion(1, 2024);

        int days = calculateDistance(111);
        if (days > 0) {
            System.out.println("Количество дней " + days);
        } else {
            System.out.println("Доставки нет");
        }
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
        var appType = year < currentYear && year < 2015 ? "облегченную " : "";

        System.out.println("Установите " + appType + "версию для системы " + type);
        if (year > currentYear) {
            System.out.println("Ошибка");
        }
    }
    public static int calculateDistance(int distance) {
        if (distance > 100) {
            return -1;
        }
        int days = 1;
        if (distance > 20) {
            days++;
        }
        if (distance > 60) {
            days++;
        }
        return days;
    }
}
