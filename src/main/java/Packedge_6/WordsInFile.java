package Packedge_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordsInFile {

    private Map<String, Integer> wordsFrequency = new HashMap<>();
    private List<String> wordsList = new ArrayList<>();
    private String path;

    public WordsInFile(String path) throws FileNotFoundException {

        this.path = path;
        File file = new File(path);

        Scanner scan = new Scanner(file);
        String fileText = "";

        while (scan.hasNext()) {
            Collections.addAll(wordsList, scan.next().toLowerCase().
                    replaceAll("[^A-Za-zА-Яа-я]", " ").split("[ ]"));
            wordsList.remove("");
        }
        scan.close();
        Collections.sort(wordsList);
        for (String key : wordsList){
            if (wordsFrequency.containsKey(key)) wordsFrequency.put(key, wordsFrequency.get(key) + 1);
            else wordsFrequency.put(key, 1);
        }
        }

    public String showSortedWords (){
        return wordsList.toString();
    }

    public String  showWordsFrequency(){
        return wordsFrequency.toString();
    }
    public String showMostFrequentWord(){
        Integer maxFrequency = Collections.max(wordsFrequency.values());

        List <String> MostFrequentWord = new ArrayList<>();
        for (String key : wordsFrequency.keySet()) {
            if (wordsFrequency.get(key) == maxFrequency)
                MostFrequentWord.add(key);
        }
        return MostFrequentWord.toString() + " = " + maxFrequency;
    }
    }