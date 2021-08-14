package Package_1_2;
import java.util.Scanner;

public class MaxLengthWord {
    public static void printWord() {
        System.out.println("Введите количество слов");
        Scanner scan = new Scanner(System.in);
        int numberOfWords = scan.nextInt();
        System.out.println("Введите слова");
        int maxLength = 0;
        String maxWord = "";
        for (int i = 0; i < numberOfWords; i++){
            String Word = scan.next();
            if (Word.length() > maxLength) {
                maxLength = Word.length();
                maxWord = Word;
            }
        }
        scan.close();
        System.out.println(maxWord);
    }
}
