import java.util.Scanner;

public class SwitchTask4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String color = scan.next();
        switch (color) {
            case "Красный":
                System.out.println("Вы яркий и амбициозный.");
                break;
            case "Голубой":
                System.out.println("Вы спокойный и трудолюбивый.");
                break;
            case "Белый":
                System.out.println("Вы добрый и мягкий.");
                break;
            default:
                System.out.println("Вы просто человек :)");
        }
    }
}
