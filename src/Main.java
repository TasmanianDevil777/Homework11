import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Домашка 11. Методы");    }

    public static void printLeapYear(int year) {

        {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + "год является високосным");
            } else {
                System.out.println(year + "год не является високосным");
            }
        }
    }

    public static void printVersion(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (currentYear == year && os == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else if (currentYear > year && os == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (currentYear == year && os == 0) {
            System.out.println("Установите обычную версию приложения для ios по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для ios по ссылке");
        }
    }

    public static int getNumberOfDeliveryDays(int deliveryDistance) {
        if (deliveryDistance > 100) {
            return -1;

        }
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        return deliveryDays;
    }
}