package Week2Task2;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        char randChar = (char) (random.nextInt(26) + 'A');
        System.out.println("Загадана буква от A до Z.");
        System.out.println("Попробуйте её угадать.");
        char ch1 = 'И';
        do{
            System.out.println("Вариант ответа: ");
            char ch1 = scanner.next().charAt(0);
            while((ch1 <= 'A') || ('Z' <= ch1)){
                System.out.print("");
                ch1 = scanner.next().charAt(0);
            }
            if (ch1 > randChar){
                System.out.print("Ищи букву, котоаря перед ней в алфавите.");
            } else if (ch1 < randChar){
                System.out.print("Ищи букву, котоаря после неё в алфавите.");
            }
        }while(ch1 != randChar);
        System.out.print("Верно!");
    }
}
