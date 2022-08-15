public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для IOS");
        }
        else{
            System.out.println("Установите версию приложения для Android");
        }

        int clientDeviceYear = 2014;
        if ((clientOS == 0) && (clientDeviceYear <= 2015)){
            System.out.println("Установите облегчённую версию приложения для IOS по ссылке");
        }
        else if ((clientOS == 1) && (clientDeviceYear <= 2015)){
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        }
        else if ((clientOS == 0) && (clientDeviceYear >= 2015)){
            System.out.println("Установите версию приложения для IOS");
        }
        else{
            System.out.println("Установите версию приложения для Android");
        }

        int year = 2021;
        if((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0)){
            System.out.println("Год является високосным");
        }
        else{
            System.out.println("Год не является високосным");
        }

        int deliveryDistance = 95;
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: 1");
        }
        else if ((deliveryDistance >= 20) && (deliveryDistance < 60)){
            System.out.println("Потребуется  дней: 2");
        }
        else if ((deliveryDistance >= 60) && (deliveryDistance < 100)){
            System.out.println("Потребуется  дней: 3");
        }

        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Зима");
            case 2:
                System.out.println("Зима");
            case 3:
                System.out.println("Весна");
            case 4:
                System.out.println("Весна");
            case 5:
                System.out.println("Весна");
            case 6:
                System.out.println("Лето");
            case 7:
                System.out.println("Лето");
            case 8:
                System.out.println("Лето");
            case 9:
                System.out.println("Осень");
            case 10:
                System.out.println("Осень");
            case 11:
                System.out.println("Осень");
            case 12:
                System.out.println("Зима");
            default:
                System.out.println("Такого месяца нет");

        }
    }
}