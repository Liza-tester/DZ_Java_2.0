package Packedge_6;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoWordsInFile {
    public static void run () throws FileNotFoundException {

        System.out.println("\nДоступ по абсолютному пути\n");
        WordsInFile words = new WordsInFile("C:\\Users\\Professional\\IdeaProjects\\DZ_Java_2.0\\test.txt");
        System.out.println("Отсортированные слова:");
        System.out.println(words.showSortedWords());
        System.out.println("Количество повторений слов:");
        System.out.println(words.showWordsFrequency());
        System.out.println("Самые часто повторяющиеся слова:");
        System.out.println(words.showMostFrequentWord());

        System.out.println("\nДоступ к файлу по относительному пути\n");
        System.out.println("Введите путь к файлу, например test2.txt");
        Scanner scan = new Scanner(System.in);
        String path = scan.nextLine();
        scan.close();
        System.out.println(path);
        WordsInFile words2 = new WordsInFile(path);
        System.out.println("Отсортированные слова:");
        System.out.println(words2.showSortedWords());
        System.out.println("Количество повторений слов:");
        System.out.println(words2.showWordsFrequency());
        System.out.println("Самые часто повторяющиеся слова:");
        System.out.println(words2.showMostFrequentWord());
    }
}
