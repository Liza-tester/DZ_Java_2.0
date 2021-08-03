package Package_1_2;
import java.util.Arrays;
import java.util.Random;

public class MinMaxArrayReplacer {

    static int [] arrayOfNumbers = new int[20];
    static int maxNegativePosition;
    static int minPositivePosition;

    static void generator() {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) arrayOfNumbers[i] = rand.nextInt(21)-10;
        System.out.println("Сгенерированный массив случайных чисел");
        System.out.println(Arrays.toString(arrayOfNumbers));
    }
    static void maxNegative() {
        int tmp = -11;
        for (int i = 0; i < 20; i++){
            if  (arrayOfNumbers[i] < 0 && arrayOfNumbers[i] > tmp) {
                tmp = arrayOfNumbers[i];
                maxNegativePosition = i;
            }
        }
        System.out.println("Максимальное отрицательное число: " + tmp);
    }
    static void minPositive() {
        int tmp = 11;
        for (int i = 0; i < 20; i++){
            if  (arrayOfNumbers[i] > 0 && arrayOfNumbers[i] < tmp) {
                tmp = arrayOfNumbers[i];
                minPositivePosition = i;
            }
        }
        System.out.println("Минимальное положительное число: " + tmp);
    }
    static void replacer() {
        int tmp = arrayOfNumbers[minPositivePosition];
        arrayOfNumbers[minPositivePosition] = arrayOfNumbers[maxNegativePosition];
        arrayOfNumbers[maxNegativePosition] = tmp;
        System.out.println("Массив после замены элементов");
        System.out.println(Arrays.toString(arrayOfNumbers));
    }
    public static void getResult () {
        generator();
        maxNegative();
        minPositive();
        replacer();
    }
}
