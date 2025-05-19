import java.time.LocalDate;

public class Main {
    public static void printALeapYearOrNot(int year) {
        int fourthYear = year % 4;
        int hundredthYear = year % 100;
        int fourHundredthYear = year % 400;
        if (year > 1584 && fourthYear == 0 && hundredthYear != 0 || fourHundredthYear == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void checkVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке.");
        }
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите обычную версию приложения для Android по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int findDeliveryDays(int deliveryDistance) {
//        String deliveryRangeTooLarge = "Доставки нет.";
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        //Task 1
        printALeapYearOrNot(2021);
        System.out.println("Task 2");
        //Task 2
        checkVersion(1, 2015);
        System.out.println("Task 3");
        //Task 3
        int deliveryDays = findDeliveryDays(95);
        if (deliveryDays == -1) {
            System.out.println("Доставки нет.");
        } else {
            System.out.println("Потребуется дней: "+ deliveryDays);
        }
    }
}
