import java.util.Scanner;

public class SwitchTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        switch (month) {
            case 1:
                System.out.println("Месяц №1 - Январь");
                break;
            case 2:
                System.out.println("Месяц №2 - Февраль");
                break;
            case 3:
                System.out.println("Месяц №3 - Март");
                break;
            case 4:
                System.out.println("Месяц №4 - Апрель");
                break;
            case 5:
                System.out.println("Месяц №5 - Май");
                break;
            case 6:
                System.out.println("Месяц №6 - Июнь");
                break;
            case 7:
                System.out.println("Месяц №7 - Июль");
                break;
            case 8:
                System.out.println("Месяц №8 - Август");
                break;
            case 9:
                System.out.println("Месяц №9 - Сентябрь");
                break;
            case 10:
                System.out.println("Месяц №10 - Октябрь");
                break;
            case 11:
                System.out.println("Месяц №11 - Ноябрь");
                break;
            case 12:
                System.out.println("Месяц №12 - Декабрь");
                break;
            default:
                System.out.println("Ошибка. Нет месяца с таким номером!");
        }
    }
}
