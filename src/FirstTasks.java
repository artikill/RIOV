import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FirstTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s_number;
        int number;

        System.out.println("Первое задание");
        s_number = sc.nextLine().trim();//считываем строку, чтобы сократить количество операций
        System.out.println(first(s_number) + "\n");

        System.out.println("Второе задание");
        s_number = sc.nextLine().trim();
        System.out.println(second(s_number) + "\n");

        System.out.println("Третье задание");
        number = Integer.parseInt(sc.nextLine());
        System.out.println(third(number) + "\n");

        System.out.println("Четвёртое задание");
        number = Integer.parseInt(sc.nextLine());
        System.out.println(fourth(number) + "\n");

        System.out.println("Пятое задание");
        int[] intArray = {
                Integer.parseInt(sc.nextLine()),
                Integer.parseInt(sc.nextLine()),
                Integer.parseInt(sc.nextLine())
        };
        System.out.println(fifth(intArray) + "\n");

        System.out.println("Шестое задание");
        number = Integer.parseInt(sc.nextLine());
        sixth(number);
        System.out.println("\n");

        System.out.println("Седьмое задание");
        String code = sc.nextLine();
        System.out.println(seventh(code) + "\n");

        System.out.println("Восьмое задание");
        eighth();

        System.out.println("Девятое задание");
        ninth();

        System.out.println("Десятое задание");
        tenth();

    }

    public static int first(String s_number) {
        return Character.getNumericValue(s_number.charAt(s_number.length() - 1));
    }

    public static int second(String s_number) {
        int res = 0;
        for (String ch : s_number.split("")) res += Short.parseShort(ch);
        return res;
    }

    public static int third(int number) {
        return number > 0 ? ++number : number;
    }

    public static int fourth(int number) {
        //альтернативный, но менее читаемый вариант
        //return number > 0 ? ++number : number < 0 ? number - 2 : 10;
        if (number > 0) return ++number;

        if(number < 0) return number - 2;

        return 10;
    }

    public static int fifth(int[] intArray) {
        return (Arrays.stream(intArray).min().getAsInt());
    }

    public static void sixth(int number) {
        if (number == 0) {
            System.out.println("Нулевое число.");
            return;
        }

        System.out.println(
            (number > 0 ? "Положительное " : "Отрицательное ") +
            (number % 2 == 0 ? "чётное " : "нечётное ") +
            "число."
        );
    }

    public static String seventh(String code) {
        switch (code) {
            case "905" -> { return ("Москва. Стоимость разговора 41.5 рублей"); }
            case "194" -> { return ("Ростов. Стоимость разговора 19.8 рублей"); }
            case "491" -> { return ("Краснодар. Стоимость разговора 26.9 рублей"); }
            case "800" -> { return ("Краснодар. Стоимость разговора 50.0 рублей"); }
            default -> { return ("Код города не найден"); }
        }
    }

    public static void eighth() {
        int[] intArray = {1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
        int[] stream = Arrays.stream(intArray).filter(x -> x < 0).toArray();

        System.out.println("Максимальное значение: " + Arrays.stream(intArray).max().getAsInt() +
                "\nСумма положительных чисел: " + Arrays.stream(intArray).filter(x -> x > 0).sum() +
                "\nСумма чётных отрицательных чисел: " + Arrays.stream(intArray).filter(x -> x < 0 && x % 2 == 0).sum() +
                "\nКоличество положительных элементов: " + Arrays.stream(intArray).filter(x -> x > 0).count() +
                "\nСреднее арифметическое отрицательных элементов: " + Arrays.stream(stream).sum() / stream.length
        );
    }

    public static void ninth() {
        int[] intArray = {15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};

        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[intArray.length - 1 - i];
            intArray[intArray.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(intArray));
    }

    public static void tenth() {
        int[] intArray = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
        int[] resultArray = new int[intArray.length];
        int count = 0;
        int index = 0;
        for(int n : intArray) {
            if(n == 0) count++;
            else {
                resultArray[index] = n;
                index++;
            }
        }
        for(int i = 0; i < count; i++) {
            resultArray[index] = 0;
            index++;
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
