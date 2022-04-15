import java.util.Scanner;

public class SwitchTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        switch (month) {
            case 12:
                System.out.print("Декабрь, ");
            case 1:
                System.out.print("Январь, ");
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.print("Март, ");
            case 4:
                System.out.print("Апрель, ");
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.print("Июнь, ");
            case 7:
                System.out.print("Июль, ");
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.print("Сентябрь, ");
            case 10:
                System.out.print("Октябрь, ");
            case 11:
                System.out.println("Ноябрь");
                break;
            default:
                System.out.println("Ошибка. Нет месяца с таким номером!");
        }
    }
}
