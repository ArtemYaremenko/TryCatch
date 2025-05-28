package pro.sky;


public class Main {
    public static void main(String[] args) {
        System.out.println("Напишите пример обработки нескольких исключений в одном блоке catch.");

        try {
//            String s = null;
//            s.length();
            int a = Integer.parseInt("f,d");
        } catch (NullPointerException | NumberFormatException exception) {
            System.out.println("Обнаружено исключение: " + exception.getMessage());
        }

    }
}