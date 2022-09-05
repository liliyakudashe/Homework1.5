public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Первая задача");
        int clientOS = 0, clientOSAndroid = 1;
        boolean isOperatingSystem = true;
        if (isOperatingSystem || clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (isOperatingSystem || clientOSAndroid == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 2
        System.out.println("Вторая задача");
        int clientDeviceYear = 2015, iosYear = 2014, androidYear = 2021;
        if (iosYear < clientDeviceYear){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (androidYear < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }
        // Задача 3
        System.out.println("Третья задача");
        int year = 2022;
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " это високосный год.");
        } else if ((year % 4 == 0) && (year % 100 == 0)
                && (year % 400 == 0)) {
            System.out.println(year + " это високосный год.");
        } else {
            System.out.println(year + " это не високосный год.");
        }
        // Задача 4
        System.out.println("Четвёртая задача");
        int day = 1, dayTwo = 2, dayThree = 3;
        int distance = 90;
        if (distance <= 20){
            System.out.printf("Потребуется %d день доставки \n", day);
        } else if (distance >= 20 && distance <= 60) {
            System.out.printf("Потребуется %d дня доставки \n", dayTwo);
        } else if (distance >= 60 && distance <= 100) {
            System.out.printf("Потребуется %d дня доставки \n", dayThree);
        }
        // Задача 5
        System.out.println("Пятая задача");
        String theTimeOfTheYearIsWinter = "Время года зима";
        String theTimeOfTheYearIsAutumn = "Время года осень";
        String theTimeOfTheYearIsWinterSpring = "Время года весна";
        String theTimeOfTheYearIsSummer = "Время года лето";

        int monthNumber = 13;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println(theTimeOfTheYearIsWinter);
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(theTimeOfTheYearIsWinterSpring);
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(theTimeOfTheYearIsSummer);
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(theTimeOfTheYearIsAutumn);
                break;
            default:
                System.out.println("Нет такого времени года нет");
        }
    }
}