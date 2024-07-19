import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String a = Strings("Строка а: ");
        String b = Strings("Строка б: ");

        if (a.equals(b)) {
            System.out.print("Строки идентичны");
        }else {
            System.out.print("Строки неидентичны");
        }
    }

    public static String Strings (String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(string);
        String str = scanner.nextLine();
        return str;  
    }
}