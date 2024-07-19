import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a = Number("Введите первое число: "); 
        int b = Number("Введите второе число: ");
        System.out.println("Сравнение чисел: " + Comparison(a, b));
        System.out.println("Сумма чисел = " + (a + b));
        System.out.println("Вычитание чисел = " + (a - b));
        System.out.println("Умножение чисел = " + (a * b));
        System.out.println("Деление чисел = " + division(a, b)); 
        
    }

    public static int  Number(String str) {
        Scanner scan = new Scanner(System.in);
        while (true){ 
            System.out.print(str);
            String string = scan.nextLine();          
        try {      
            return  Integer.parseInt(string);
                    
             } catch (NumberFormatException ex) {
                    System.out.println("Пожалуйста введите целое число");       
           } 
       }
    }

   public static String Comparison(int a, int b) {
        if (a > b) {
            return "a > b";
        } else if (a < b) {
            return "a < b";
        }
        return  "a = b";
    }  

    public static int division(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Делить на ноль нельзя!");
        return a / b;
    }
}