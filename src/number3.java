import java.util.Arrays;
import java.util.Scanner;

public class number3 {
    public static void main(String[] args) {
       String[] array = new String[50];
       Scanner sc = new Scanner(System.in);
       for(int i = 0;i < array.length;i++) {
        System.out.println("Введите фильмы для просмотра");
           String film = sc.nextLine();
           if (film.equalsIgnoreCase("выход")) {
               System.out.println("Выход");
               break;
           } else {
               array[i] = film;
           }
       }
        System.out.println(Arrays.toString(array));
    }
}
