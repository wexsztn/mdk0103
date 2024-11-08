import java.util.Scanner;

public class number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Вопрос 1: Столица России? 1) Мурманск 2) Санкт-Петербург 3) Москва 4) Калининград");
        int otvet = sc.nextInt();
        if(otvet == 3) {
            score++;
            System.out.println("Правильно!Идём дальше...");
        }
        else {
            System.out.println("Неправильно!Москва - правильный ответ.");
        }

        System.out.println("Вопрос 2: Какой большой океан по площади? 1) Индийский 2) Южный 3) Атлантический 4) Тихий");
        int otvet1 = sc.nextInt();
        if(otvet1 == 4) {
            score++;
            System.out.println("Правильно!Это было легко...");
        }
        else {
            System.out.println("Неправильно! Большой океан по площади в мире это Тихий");
        }

        System.out.println("Вопрос 3: Сколько материков на земле? 1) 6 2) 7 3) 8 4) 9");
        int otvet2 = sc.nextInt();
        if(otvet2 == 1) {
            score++;
            System.out.println("Правильно!");
        }
        else {
            System.out.println("Неправильно!Всего на земле 6 материков. Элементарно же ;)");
        }

        System.out.println("Вопрос 4: Какая страна называется - Голландия? 1) Италия 2) Испания 3) Нидерланды 4) Великобритания");
        int otvet3 = sc.nextInt();
        if(otvet3 == 3) {
            score++;
            System.out.println("Працвильно!Молодец!");
        }
        else {
            System.out.println("Неправильно!Нидерланды - правильный ответ...");
        }

        System.out.println("Вопрос 5: Какая страна имеет границу с 18 странами? 1) США 2) Германия 3) Италия 4) Россия");
        int otvet4 = sc.nextInt();
        if(otvet4 == 4) {
            score++;
            System.out.println("Правильно!Хорошо идешь!)");
        }
        else {
            System.out.println("Неправильно!Правильный ответ это Россия, учи внимательней географию!");
        }

        System.out.println("Вопрос 6: Какая страна самая многонациональная? 1) Россия 2) Индия 3) Монголия 4) США");
        int otvet5 = sc.nextInt();
        if(otvet5 == 2) {
            score++;
            System.out.println("Правильно!Отлично!");
        }
        else {
            System.out.println("Неправильно!Индия - самая многонациональная страна...");
        }

        System.out.println("Вопрос 7: Другое название этой страны: Суоми.Что это за страна? 1) Финляндия 2) Япония 3) Норвегия  4) Китай");
        int otvet6 = sc.nextInt();
        if(otvet6 == 1) {
            score++;
            System.out.println("Ого, это правильно!");
        }
        else {
            System.out.println("Неправильно!Правильный ответ это Финляндия.Удивительно,правда?...");
        }

        System.out.println("Вопрос 8: Какое государство самое маленькое в мире? 1) Монако 2) Панама 3) Ватикан 4) Израиль");
        int otvet7 = sc.nextInt();
        if(otvet7 == 3) {
            score++;
            System.out.println("Правильно!Так держать!");
        }
        else {
            System.out.println("Неправильно! Ватикан - самое маленькое государство,его площадь составляет 0.44 кв.км.");
        }

        System.out.println("Вопрос 9: Виды какого города можно увидеть на российском купюре достоиством в 500 рублей? 1) Москва 2) Красноярск 3) Ярославль 4) Архангельск");
        int otvet8 = sc.nextInt();
        if(otvet8 == 4) {
            score++;
            System.out.println("Правильно!Удивляешь меня все больше и больше!");
        }
        else {
            System.out.println("Неправильно!Если посмотреть на купюру,можно увидеть город Архангельск...");
        }

        System.out.println("Вопрос 10: Через сколько штатов протекает река Миссисипи? 1) 31 2) 25 3) 27 4) 29 ");
        int otvet9 = sc.nextInt();
        if(otvet9 == 1) {
            score++;
            System.out.println("Правильно! Это был последний вопрос,поздравляю!");
        }
        else {
            System.out.println("Неправильно!Миссисипи протекает через 31 штат");
        }
        System.out.println("Давайте подведём итоги нашей увлекательной викторины!");
        System.out.println("Вы смогли ответить правильно на " + score + " из 10 вопросов.Учите географию ;)");

    }
}
