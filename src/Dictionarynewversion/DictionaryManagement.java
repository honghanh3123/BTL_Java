package Dictionarynewversion;

import java.util.List;
import java.util.Scanner;

public class DictionaryManagement {
    public void insertFromCommandline(Dictionary dt){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Input number word of dictionary: ");
        number = sc.nextInt();
        sc.nextLine();
        System.out.println("Input word of dictionary: ");
        for(int i = 0; i < number; i++){
            Word w = new Word();
            String word_target = sc.nextLine();
            w.setWord_target(word_target);
            String word_explain = sc.nextLine();
            w.setWord_explain(word_explain);
            List<Word> newDic = dt.getDictionary();
            newDic.add(w);
            dt.setDictionary(newDic);
        }
    }
}
