package Dictionarynewversion;

import java.util.List;

public class DictionaryCommandline {
    Word w = new Word();
    private Dictionary dt = new Dictionary();

    public void insertWord() {
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromCommandline(dt);
        List<Word> newDic = dt.getDictionary();
        newDic.add(w);
        dt.setDictionary(newDic);
    }

    public void showAllWords(){
        System.out.println(dt.getDictionary().size());
        for(int i = 0; i < dt.getDictionary().size()-1; i++){
            System.out.println("No: " +  (i+1) + "    English: " + dt.getDictionary().get(i).getWord_target() + "    Vietnamese: " + dt.getDictionary().get(i).getWord_explain());
        }
    }

    public void dictionaryBasic(){
        DictionaryCommandline dc = new DictionaryCommandline();
        dc.insertWord();
        dc.showAllWords();
    }

    public static void main(String[] args){
        DictionaryCommandline dcl = new DictionaryCommandline();
        dcl.dictionaryBasic();
    }
}
