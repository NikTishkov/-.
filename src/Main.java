public class Main {
    public static boolean counterAge( int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }

         public static void checkVersion(int clientOS , int clientDeviceYear) {
             if (clientOS == 0 && clientDeviceYear >= 2015) {
                 System.out.println("Установите обычную версию приложения для iOS по ссылке.");
             } else if (clientOS == 0 && clientDeviceYear < 2015) {
                 System.out.println("Установите облегченную версию приложения для iOS по ссылке");
             }
             if (clientOS == 1 && clientDeviceYear >= 2015) {
                 System.out.println("Установите обычную версию приложения для Android по ссылке.");
             } else if (clientOS == 1 && clientDeviceYear < 2015) {
                 System.out.println("Установите облегченную версию приложения для Android по ссылке");
             }
    }

    public static int deliveryDistance(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1.");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2.");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3.");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        }
        return deliveryDistance;
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        //Task 1
        int year = 2021;
        if (counterAge(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year +" год — невисокосный год");
        }
        System.out.println("Task 2");
        //Task 2
        int clientOS = 1;
        int clientDeviceYear = 2015;
        checkVersion(clientOS,clientDeviceYear);
        System.out.println("Task 3");
        //Task 3
        int deliveryDistance = 95;
        deliveryDistance(deliveryDistance);
    }
}
