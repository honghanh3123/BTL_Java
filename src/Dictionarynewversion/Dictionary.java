package Dictionarynewversion;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private List<Word> Dictionary = new ArrayList<Word>();

    public List<Word> getDictionary() {
        return Dictionary;
    }

    public void setDictionary(List<Word> dictionary) {
        Dictionary = dictionary;
    }
}
