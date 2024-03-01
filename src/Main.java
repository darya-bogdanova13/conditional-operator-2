import javax.swing.text.ViewFactory;

public class Main {
    public static void main(String[] args) {
        int age = 19;
        if (age > 18) {
            System.out.println("Ты должен праздновать");
            if (age < 21) {
                System.out.println("Выпей сливочного пива");
            } else {
                System.out.println("Иди куда хочешь и пей что хочешь");
            }
        } else if (age > 7) {
            System.out.println("Иди в школу");
        } else {
            System.out.println("Иди в детский сад");
        }
        int age1 = 21;
        if (age1 == 18) {
            System.out.println("С окончанием школы!");
        } else if (age1 == 21) {
            System.out.println("Теперь тебе можно пить алкоголь");
        } else if (age1 == 7) {
            System.out.println("Иди в школу");
        } else {
            System.out.println("Пока сказать нечего");
        }
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        int clientOS0 = 0;
        int clientDeviceYear = 2016;
        if (clientOS0 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS0 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS0 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS0 == 1 && clientDeviceYear >= 15) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        int year = 2016;
        if (year >= 1584 && year % 4 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
        int deliveryDistance = 120;
        int days = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (days + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (days + 2));
        } else {
            System.out.println("Доставки нет");
        }
        int monthNumber = 7;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такогомесяца не существует");
        }
    }
}


